package jp.ac.asojuku.batch.updategrade.exception;

public class DBException extends Exception {

	private Exception e;

	public DBException(Exception e){
		this.e = e;
	}

	public String getMessage(){
		return e.getMessage();
	}
}
