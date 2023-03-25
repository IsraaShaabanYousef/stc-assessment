package com.stc.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String type;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "permission_group_id")
	private PermissionGroups group;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PermissionGroups getGroup() {
		return group;
	}
	public void setGroup(PermissionGroups group) {
		this.group = group;
	}
	
}
