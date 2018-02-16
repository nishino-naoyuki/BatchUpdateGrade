/**
 *
 */
package jp.ac.asojuku.batch.updategrade.config;

import jp.ac.asojuku.batch.updategrade.exception.AsoLearningSystemErrException;

/**
 * アプリケーションの
 * @author nishino
 *
 */
public class AppSettingProperty extends ConfigBase {

	//シングルトン
	private static AppSettingProperty prop = null;
	private static final String CONFIG_NAME = "app.properties";
	private static final String DB_URL = "db.connect.url";
	private static final String DB_USER = "db.connect.user";
	private static final String DB_PASSWORD = "db.connect.password";


	public AppSettingProperty() throws AsoLearningSystemErrException {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * インスタンスの取得
	 * @return
	 * @throws BookStoreSystemErrorException
	 */
	public static AppSettingProperty getInstance() throws AsoLearningSystemErrException{

		if( prop == null ){
			prop = new AppSettingProperty();
		}

		return prop;
	}

	//　コンフィグファイルの名前を返す
	protected String getConfigName(){ return CONFIG_NAME; }

	/**
	 * DB URLのフォルダ取得
	 * @return
	 */
	public String getDBUrl(){
		return getProperty(DB_URL);
	}

	/**
	 * DB URLのフォルダ取得
	 * @return
	 */
	public String getDBUser(){
		return getProperty(DB_USER);
	}

	/**
	 * DB URLのフォルダ取得
	 * @return
	 */
	public String getDBPassword(){
		return getProperty(DB_PASSWORD);
	}
}
