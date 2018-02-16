package jp.ac.asojuku.batch.updategrade.entity;

import java.io.Serializable;

/**
 * テストケーステーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class TestcaseTableEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 課題テーブル. */
	private TaskTblEntity taskTbl;

	/** テストケースID. */
	private Integer testcaseId;

	/** 配点. */
	private Integer allmostOfMarks;

	/** 正解出力ファイル名. */
	private String outputFileName;

	/** 入力ファイル名. */
	private String inputFileName;

	/**
	 * コンストラクタ.
	 */
	public TestcaseTableEntity() {
	}

	/**
	 * 課題テーブル を設定します.
	 * 
	 * @param taskTbl
	 *            課題テーブル
	 */
	public void setTaskTbl(TaskTblEntity taskTbl) {
		this.taskTbl = taskTbl;
	}

	/**
	 * 課題テーブル を取得します.
	 * 
	 * @return 課題テーブル
	 */
	public TaskTblEntity getTaskTbl() {
		return this.taskTbl;
	}

	/**
	 * テストケースID を設定します.
	 * 
	 * @param testcaseId
	 *            テストケースID
	 */
	public void setTestcaseId(Integer testcaseId) {
		this.testcaseId = testcaseId;
	}

	/**
	 * テストケースID を取得します.
	 * 
	 * @return テストケースID
	 */
	public Integer getTestcaseId() {
		return this.testcaseId;
	}

	/**
	 * 配点 を設定します.
	 * 
	 * @param allmostOfMarks
	 *            配点
	 */
	public void setAllmostOfMarks(Integer allmostOfMarks) {
		this.allmostOfMarks = allmostOfMarks;
	}

	/**
	 * 配点 を取得します.
	 * 
	 * @return 配点
	 */
	public Integer getAllmostOfMarks() {
		return this.allmostOfMarks;
	}

	/**
	 * 正解出力ファイル名 を設定します.
	 * 
	 * @param outputFileName
	 *            正解出力ファイル名
	 */
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	/**
	 * 正解出力ファイル名 を取得します.
	 * 
	 * @return 正解出力ファイル名
	 */
	public String getOutputFileName() {
		return this.outputFileName;
	}

	/**
	 * 入力ファイル名 を設定します.
	 * 
	 * @param inputFileName
	 *            入力ファイル名
	 */
	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	/**
	 * 入力ファイル名 を取得します.
	 * 
	 * @return 入力ファイル名
	 */
	public String getInputFileName() {
		return this.inputFileName;
	}


}
