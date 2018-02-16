package jp.ac.asojuku.batch.updategrade.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 結果テーブル モデルクラス.
 *
 * @author generated by ERMaster
 * @version $Id$
 */
public class ResultTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 結果ID. */
	private Integer resultId;

	/** ユーザーテーブル. */
	private UserTblEntity userTbl;

	/** 課題テーブル. */
	private TaskTblEntity taskTbl;

	/** 合計得点. */
	private Float totalScore;

	/** 提出済みフラグ. */
	private Integer handed;

	/** 最終提出日. */
	private Date handedTimestamp;

	/** 解答の文字列. */
	private String answer;

	/** COMMENT. */
	private String comment;

	/** COMMENT_UPDATE_TIME. */
	private Date commentUpdateTime;

	/** 結果ソース品質テーブル 一覧. */
	private Set<ResultMetricsTblEntity> resultMetricsTblSet;

	/** 結果詳細テーブル（テストケース） 一覧. */
	private Set<ResultTestcaseTblEntity> resultTestcaseTblSet;

	/** ソースコードテーブル 一覧. */
	private Set<SrcTblEntity> srcTblSet;

	/**
	 * コンストラクタ.
	 */
	public ResultTblEntity() {
		this.resultMetricsTblSet = new HashSet<ResultMetricsTblEntity>();
		this.resultTestcaseTblSet = new HashSet<ResultTestcaseTblEntity>();
		this.srcTblSet = new HashSet<SrcTblEntity>();
	}

	/**
	 * 結果ID を設定します.
	 *
	 * @param resultId
	 *            結果ID
	 */
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}

	/**
	 * 結果ID を取得します.
	 *
	 * @return 結果ID
	 */
	public Integer getResultId() {
		return this.resultId;
	}

	/**
	 * ユーザーテーブル を設定します.
	 *
	 * @param userTbl
	 *            ユーザーテーブル
	 */
	public void setUserTbl(UserTblEntity userTbl) {
		this.userTbl = userTbl;
	}

	/**
	 * ユーザーテーブル を取得します.
	 *
	 * @return ユーザーテーブル
	 */
	public UserTblEntity getUserTbl() {
		return this.userTbl;
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
	 * 合計得点 を設定します.
	 *
	 * @param totalScore
	 *            合計得点
	 */
	public void setTotalScore(Float totalScore) {
		this.totalScore = totalScore;
	}

	/**
	 * 合計得点 を取得します.
	 *
	 * @return 合計得点
	 */
	public Float getTotalScore() {
		return this.totalScore;
	}

	/**
	 * 提出済みフラグ を設定します.
	 *
	 * @param handed
	 *            提出済みフラグ
	 */
	public void setHanded(Integer handed) {
		this.handed = handed;
	}

	/**
	 * 提出済みフラグ を取得します.
	 *
	 * @return 提出済みフラグ
	 */
	public Integer getHanded() {
		return this.handed;
	}

	/**
	 * 最終提出日 を設定します.
	 *
	 * @param handedTimestamp
	 *            最終提出日
	 */
	public void setHandedTimestamp(Date handedTimestamp) {
		this.handedTimestamp = handedTimestamp;
	}

	/**
	 * 最終提出日 を取得します.
	 *
	 * @return 最終提出日
	 */
	public Date getHandedTimestamp() {
		return this.handedTimestamp;
	}

	/**
	 * 解答の文字列 を設定します.
	 *
	 * @param answer
	 *            解答の文字列
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * 解答の文字列 を取得します.
	 *
	 * @return 解答の文字列
	 */
	public String getAnswer() {
		return this.answer;
	}

	/**
	 * COMMENT を設定します.
	 *
	 * @param comment
	 *            COMMENT
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * COMMENT を取得します.
	 *
	 * @return COMMENT
	 */
	public String getComment() {
		return this.comment;
	}

	/**
	 * 結果ソース品質テーブル 一覧を設定します.
	 *
	 * @param resultMetricsTblSet
	 *            結果ソース品質テーブル 一覧
	 */
	public void setResultMetricsTblSet(Set<ResultMetricsTblEntity> resultMetricsTblSet) {
		this.resultMetricsTblSet = resultMetricsTblSet;
	}

	/**
	 * 結果ソース品質テーブル を追加します.
	 *
	 * @param resultMetricsTbl
	 *            結果ソース品質テーブル
	 */
	public void addResultMetricsTbl(ResultMetricsTblEntity resultMetricsTbl) {
		this.resultMetricsTblSet.add(resultMetricsTbl);
	}

	/**
	 * 結果ソース品質テーブル 一覧を取得します.
	 *
	 * @return 結果ソース品質テーブル 一覧
	 */
	public Set<ResultMetricsTblEntity> getResultMetricsTblSet() {
		return this.resultMetricsTblSet;
	}

	/**
	 * 結果詳細テーブル（テストケース） 一覧を設定します.
	 *
	 * @param resultTestcaseTblSet
	 *            結果詳細テーブル（テストケース） 一覧
	 */
	public void setResultTestcaseTblSet(Set<ResultTestcaseTblEntity> resultTestcaseTblSet) {
		this.resultTestcaseTblSet = resultTestcaseTblSet;
	}

	/**
	 * 結果詳細テーブル（テストケース） を追加します.
	 *
	 * @param resultTestcaseTbl
	 *            結果詳細テーブル（テストケース）
	 */
	public void addResultTestcaseTbl(ResultTestcaseTblEntity resultTestcaseTbl) {
		this.resultTestcaseTblSet.add(resultTestcaseTbl);
	}

	/**
	 * 結果詳細テーブル（テストケース） 一覧を取得します.
	 *
	 * @return 結果詳細テーブル（テストケース） 一覧
	 */
	public Set<ResultTestcaseTblEntity> getResultTestcaseTblSet() {
		return this.resultTestcaseTblSet;
	}

	/**
	 * ソースコードテーブル 一覧を設定します.
	 *
	 * @param srcTblSet
	 *            ソースコードテーブル 一覧
	 */
	public void setSrcTblSet(Set<SrcTblEntity> srcTblSet) {
		this.srcTblSet = srcTblSet;
	}

	/**
	 * ソースコードテーブル を追加します.
	 *
	 * @param srcTbl
	 *            ソースコードテーブル
	 */
	public void addSrcTbl(SrcTblEntity srcTbl) {
		this.srcTblSet.add(srcTbl);
	}

	/**
	 * ソースコードテーブル 一覧を取得します.
	 *
	 * @return ソースコードテーブル 一覧
	 */
	public Set<SrcTblEntity> getSrcTblSet() {
		return this.srcTblSet;
	}

	/**
	 * COMMENT_UPDATE_TIME を設定します.
	 *
	 * @param commentUpdateTime
	 *            COMMENT_UPDATE_TIME
	 */
	public void setCommentUpdateTime(Date commentUpdateTime) {
		this.commentUpdateTime = commentUpdateTime;
	}

	/**
	 * COMMENT_UPDATE_TIME を取得します.
	 *
	 * @return COMMENT_UPDATE_TIME
	 */
	public Date getCommentUpdateTime() {
		return this.commentUpdateTime;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resultId == null) ? 0 : resultId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ResultTblEntity other = (ResultTblEntity) obj;
		if (resultId == null) {
			if (other.resultId != null) {
				return false;
			}
		} else if (!resultId.equals(other.resultId)) {
			return false;
		}
		return true;
	}

}