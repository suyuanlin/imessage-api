package com.imessage.model;

import java.io.Serializable;

public class User extends BaseModel {
	private String userId;
	private String userName;
	private String passWord;
	private String imagePath;

	public Serializable getPK() {
		return userId;
	}

	public void setPK(Serializable pk) {
		this.userId = pk.toString();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
