/**
 *
 */
package jp.ac.asojuku.batch.updategrade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.ac.asojuku.batch.updategrade.entity.UserTblEntity;



/**
 * ユーザーテーブルのDAO
 * @author nishino
 *
 */
public class UserDao extends Dao {
	Logger logger = LoggerFactory.getLogger(UserDao.class);


	private static final String MEMBER_LIST_SQL =
			"SELECT * FROM USER_TBL u "
			+ "WHERE u.GRADUATE_YEAR is null AND u.GIVE_UP_YEAR is null AND ROLE_ID=0 "
			+ "ORDER BY u.USER_ID "
			+ "LIMIT ? OFFSET ? ";

	// ユーザーの更新
	private static final String MEMBER_UPDATE_SQL =
			 "UPDATE USER_TBL SET "
			+ "GRADE=?, "
			+ "UPDATE_DATE=CURRENT_TIMESTAMP "
			+ "WHERE USER_ID=?";


	public UserDao() {
	}
	public UserDao(Connection con) {
		super(con);
	}

	public List<UserTblEntity> searchUserTask(int offset,int num) throws SQLException{
		List<UserTblEntity> list = new ArrayList<>();

		if( con == null ){
			return null;
		}

		PreparedStatement ps = null;
		ResultSet rs = null;

        try {
        	StringBuffer sb = new StringBuffer(MEMBER_LIST_SQL);

    		// ステートメント生成
			ps = con.prepareStatement(sb.toString());

			ps.setInt(1, num);
			ps.setInt(2,offset);

	        // SQLを実行
	        rs = ps.executeQuery();

	        list = getUserTblListFromResultSet(rs);

		} catch (SQLException e) {
			//例外発生時はログを出力し、上位へそのままスロー
			throw e;

		} finally {
			safeClose(ps,rs);
		}

		return list;
	}


	private List<UserTblEntity> getUserTblListFromResultSet(ResultSet rs) throws SQLException{
		List<UserTblEntity> list = new ArrayList<>();

		UserTblEntity entity = null;

        //値を取り出す
        while(rs.next()){
        	entity = createUserTblEntityFromResultSet(rs);
        	list.add(entity);
        }


		return list;
	}


	/**
	 * ユーザー情報の更新
	 * @param userEntity
	 * @param hashedPass
	 * @throws SQLException
	 */
	public void update(Integer userId,Integer grade) throws SQLException{

		if( con == null ){
			return;
		}

		PreparedStatement ps = null;

        try {
        	ps = con.prepareStatement(MEMBER_UPDATE_SQL);

        	//パラメータセット
        	ps.setInt(1, grade);	//GRADE
        	ps.setInt(2, userId);	//USERID

			ps.executeUpdate();

		} catch (SQLException e) {
			//例外発生時はログを出力し、上位へそのままスロー
			logger.warn("SQLException:",e);
			throw e;
		} finally {
			safeClose(ps,null);
		}
	}

	/**
	 * データベースの結果からUserTblEntityを取得する
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private UserTblEntity createUserTblEntityFromResultSet(ResultSet rs) throws SQLException {
		UserTblEntity entity = new UserTblEntity();

		entity.setUserId(rs.getInt("USER_ID"));
		entity.setMailadress(rs.getString("MAILADRESS"));
		entity.setPassword(rs.getString("PASSWORD"));
		entity.setName(rs.getString("NAME"));
		entity.setNickName(rs.getString("NICK_NAME"));
		entity.setAccountExpryDate(rs.getDate("ACCOUNT_EXPRY_DATE"));
		entity.setPasswordExpirydate(rs.getDate("PASSWORD_EXPIRYDATE"));
		entity.setIsFirstFlg(rs.getInt("IS_FIRST_FLG"));
		entity.setCertifyErrCnt(rs.getInt("CERTIFY_ERR_CNT"));
		entity.setIsLockFlg(rs.getInt("IS_LOCK_FLG"));
		entity.setEntryDate(rs.getTimestamp("ENTRY_DATE"));
		entity.setRemark(rs.getString("REMARK"));
		entity.setUpdateDate(rs.getTimestamp("UPDATE_DATE"));
		Integer admissionYear = fixInt(rs.getInt("ADMISSION_YEAR"),rs.wasNull());
		entity.setAdmissionYear(admissionYear);
		entity.setRepeatYearCount(rs.getInt("REPEAT_YEAR_COUNT"));
		Integer graduateYear = fixInt(rs.getInt("GRADUATE_YEAR"),rs.wasNull());
		entity.setGraduateYear(graduateYear);
		Integer giveupYear = fixInt(rs.getInt("GIVE_UP_YEAR"),rs.wasNull());
		entity.setGiveUpYear(giveupYear);

		entity.setAbatarIdList(rs.getString("AVATAR_ID_CSV"));
		entity.setGrade(rs.getInt("grade"));

		return entity;
	}

}
