package jp.ac.asojuku.batch.updategrade.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * お知らせ公開テーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class InfoPublicTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 情報テーブル. */
	private InfomationTblEntity infomationTbl;

	/** 学科マスター. */
	private CourseMasterEntity courseMaster;

	/** 状態. */
	private Integer statusId;

	/** PUBLIC_DATETIME. */
	private Date publicDatetime;

	/** 公開終了日. */
	private Date endDatetime;

	/**
	 * コンストラクタ.
	 */
	public InfoPublicTblEntity() {
	}

	/**
	 * 情報テーブル を設定します.
	 * 
	 * @param infomationTbl
	 *            情報テーブル
	 */
	public void setInfomationTbl(InfomationTblEntity infomationTbl) {
		this.infomationTbl = infomationTbl;
	}

	/**
	 * 情報テーブル を取得します.
	 * 
	 * @return 情報テーブル
	 */
	public InfomationTblEntity getInfomationTbl() {
		return this.infomationTbl;
	}

	/**
	 * 学科マスター を設定します.
	 * 
	 * @param courseMaster
	 *            学科マスター
	 */
	public void setCourseMaster(CourseMasterEntity courseMaster) {
		this.courseMaster = courseMaster;
	}

	/**
	 * 学科マスター を取得します.
	 * 
	 * @return 学科マスター
	 */
	public CourseMasterEntity getCourseMaster() {
		return this.courseMaster;
	}

	/**
	 * 状態 を設定します.
	 * 
	 * @param statusId
	 *            状態
	 */
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	/**
	 * 状態 を取得します.
	 * 
	 * @return 状態
	 */
	public Integer getStatusId() {
		return this.statusId;
	}

	/**
	 * PUBLIC_DATETIME を設定します.
	 * 
	 * @param publicDatetime
	 *            PUBLIC_DATETIME
	 */
	public void setPublicDatetime(Date publicDatetime) {
		this.publicDatetime = publicDatetime;
	}

	/**
	 * PUBLIC_DATETIME を取得します.
	 * 
	 * @return PUBLIC_DATETIME
	 */
	public Date getPublicDatetime() {
		return this.publicDatetime;
	}

	/**
	 * 公開終了日 を設定します.
	 * 
	 * @param endDatetime
	 *            公開終了日
	 */
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}

	/**
	 * 公開終了日 を取得します.
	 * 
	 * @return 公開終了日
	 */
	public Date getEndDatetime() {
		return this.endDatetime;
	}


}
