package com.imessage.model;

import java.util.Date;

public abstract class BaseModel implements PK {

	private static final long serialVersionUID = 1L;

	private boolean isEditing = false;

	public boolean isEditing() {
		return isEditing;
	}

	public void setEditing(boolean isEditing) {
		this.isEditing = isEditing;
	}

	private Date createDate = new Date();

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
