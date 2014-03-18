package com.imessage.model;

import java.io.Serializable;
import java.util.Date;

public class MessageInfo extends BaseModel {

	private String messageId;
	private String createUserId;
	private String title;
	private String messageContext;
	private Date modifyTime;

	public Serializable getPK() {
		return messageId;
	}

	public void setPK(Serializable pk) {
		this.messageId = pk.toString();
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getMessageContext() {
		return messageContext;
	}

	public void setMessageContext(String messageContext) {
		this.messageContext = messageContext;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
