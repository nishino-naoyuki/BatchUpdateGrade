package jp.ac.asojuku.batch.updategrade.entity;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 役割マスタ モデルクラス.
 *
 * @author generated by ERMaster
 * @version $Id$
 */
public class RoleMasterEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ROLE_ID. */
	private Integer roleId;

	/** 役割名. */
	private String roleName;

	/** ユーザーテーブル 一覧. */
	private Set<UserTblEntity> userTblSet;

	/**
	 * コンストラクタ.
	 */
	public RoleMasterEntity() {
		this.userTblSet = new LinkedHashSet<UserTblEntity>();
	}

	/**
	 * ROLE_ID を設定します.
	 *
	 * @param roleId
	 *            ROLE_ID
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * ROLE_ID を取得します.
	 *
	 * @return ROLE_ID
	 */
	public Integer getRoleId() {
		return this.roleId;
	}

	/**
	 * 役割名 を設定します.
	 *
	 * @param roleName
	 *            役割名
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 役割名 を取得します.
	 *
	 * @return 役割名
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * ユーザーテーブル 一覧を設定します.
	 *
	 * @param userTblSet
	 *            ユーザーテーブル 一覧
	 */
	public void setUserTblSet(Set<UserTblEntity> userTblSet) {
		this.userTblSet = userTblSet;
	}

	/**
	 * ユーザーテーブル を追加します.
	 *
	 * @param userTbl
	 *            ユーザーテーブル
	 */
	public void addUserTbl(UserTblEntity userTbl) {
		this.userTblSet.add(userTbl);
	}

	/**
	 * ユーザーテーブル 一覧を取得します.
	 *
	 * @return ユーザーテーブル 一覧
	 */
	public Set<UserTblEntity> getUserTblSet() {
		return this.userTblSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
		RoleMasterEntity other = (RoleMasterEntity) obj;
		if (roleId == null) {
			if (other.roleId != null) {
				return false;
			}
		} else if (!roleId.equals(other.roleId)) {
			return false;
		}
		return true;
	}

}
