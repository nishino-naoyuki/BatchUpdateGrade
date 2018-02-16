package jp.ac.asojuku.batch.updategrade;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import jp.ac.asojuku.batch.updategrade.dao.UserDao;
import jp.ac.asojuku.batch.updategrade.entity.UserTblEntity;

/**
 * USER_TBLの学年を更新するバッチ
 * ※毎月1日の午前0時に動くように設定しておく
 * @author nishino
 *　
 */
public class BatchUpdateGrade {
	private static final int LISTNUM = 1000;

	public static void main(String[] args) {
		BatchUpdateGrade obj = new BatchUpdateGrade();

		obj.run();
	}

	/**
	 * バッチのメイン処理
	 */
	public void run(){
		int offset = 0;

		//ユーザー情報を取得する
		UserDao dao = null;
		try{
			dao = new UserDao();
			//接続
			dao.connect();
			//トランザクション魁氏
			dao.beginTranzaction();
			while(true){
				//ユーザー取得
				List<UserTblEntity> userList =
						dao.searchUserTask(offset, LISTNUM);

				if( userList.size() > 0){
					//DB更新
					updateGrade(dao,userList);
					//offsetを追加
					offset += LISTNUM;

				}else{
					break;
				}
			}
			dao.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if(dao != null) dao.rollback();
		} finally{
			if(dao != null) dao.close();
		}

	}

	/**
	 * 学年を更新する
	 *
	 * @param dao
	 * @param userList
	 * @throws SQLException
	 */
	private void updateGrade(UserDao dao,List<UserTblEntity> userList) throws SQLException{

		//取得したリスト分ループ
		for( UserTblEntity userEntity : userList){
			//学年を取得（計算）する
			userEntity.setGrade( getGrade(userEntity) );
			//DB更新
			dao.update(userEntity.getUserId(), userEntity.getGrade());

		}
	}

	/**
	 * 学年を計算（取得）する
	 * @param userEntity
	 * @return
	 */
	private int getGrade(UserTblEntity userEntity){
		Calendar calendar = Calendar.getInstance();

		//入学年次
		int adYear = userEntity.getAdmissionYear();
		//留年回数
		int repCount = userEntity.getRepeatYearCount();

		int nendo = calendar.get(Calendar.YEAR);

		//Calendar.MONTHは1月は０となる
		if( calendar.get(Calendar.MONTH) < 3 ){
			//4月より前（3月まで）は前年度
			nendo--;
		}

		return (nendo-adYear-repCount+1);
	}

}
