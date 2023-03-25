package com.stc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Files {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Lob
	private byte[] binary;
	
	@Column(name = "item_id")
	private long itemId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getBinary() {
		return binary;
	}

	public void setBinary(byte[] binary) {
		this.binary = binary;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	
}
