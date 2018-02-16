package jp.ac.asojuku.batch.updategrade.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 履歴テーブル モデルクラス.
 *
 * @author generated by ERMaster
 * @version $Id$
 */
public class HistoryTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** HISTORY_ID. */
	private Integer historyId;

	/** ユーザーテーブル. */
	private UserTblEntity userTbl;

	/** 動作マスター. */
	private ActionMasterEntity actionMaster;

	/** ACTION_DATE. */
	private Date actionDate;

	/** メッセージ. */
	private String message;

	/**
	 * コンストラクタ.
	 */
	public HistoryTblEntity() {
	}

	/**
	 * HISTORY_ID を設定します.
	 *
	 * @param historyId
	 *            HISTORY_ID
	 */
	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	/**
	 * HISTORY_ID を取得します.
	 *
	 * @return HISTORY_ID
	 */
	public Integer getHistoryId() {
		return this.historyId;
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
	 * 動作マスター を設定します.
	 *
	 * @param actionMaster
	 *            動作マスター
	 */
	public void setActionMaster(ActionMasterEntity actionMaster) {
		this.actionMaster = actionMaster;
	}

	/**
	 * 動作マスター を取得します.
	 *
	 * @return 動作マスター
	 */
	public ActionMasterEntity getActionMaster() {
		return this.actionMaster;
	}

	/**
	 * ACTION_DATE を設定します.
	 *
	 * @param actionDate
	 *            ACTION_DATE
	 */
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	/**
	 * ACTION_DATE を取得します.
	 *
	 * @return ACTION_DATE
	 */
	public Date getActionDate() {
		return this.actionDate;
	}

	/**
	 * メッセージ を設定します.
	 *
	 * @param message
	 *            メッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * メッセージ を取得します.
	 *
	 * @return メッセージ
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((historyId == null) ? 0 : historyId.hashCode());
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
		HistoryTblEntity other = (HistoryTblEntity) obj;
		if (historyId == null) {
			if (other.historyId != null) {
				return false;
			}
		} else if (!historyId.equals(other.historyId)) {
			return false;
		}
		return true;
	}

}
