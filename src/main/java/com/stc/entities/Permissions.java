package com.stc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Permissions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "permission_level")
	private String permissionLevel;
	
	@ManyToOne
	@JoinColumn(name = "group_id")
	private PermissionGroups permissionGroup;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public PermissionGroups getPermissionGroup() {
		return permissionGroup;
	}

	public void setPermissionGroup(PermissionGroups permissionGroup) {
		this.permissionGroup = permissionGroup;
	}
	
	
}
