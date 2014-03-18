package com.imessage.model;

import java.io.Serializable;

public class ReplyInfo extends BaseModel {

	private String replyId;
	private String messageId;
	private String userId;
	private String replyContext;

	public Serializable getPK() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPK(Serializable pk) {
		// TODO Auto-generated method stub

	}

	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReplyContext() {
		return replyContext;
	}

	public void setReplyContext(String replyContext) {
		this.replyContext = replyContext;
	}

}
