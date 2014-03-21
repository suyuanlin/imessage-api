package com.imessage.model;

public class AnonymousUser extends User {

	private static final long serialVersionUID = -6825366339576561982L;
	public static final String ANONYMOUS_USER_ID = "guest";

	public AnonymousUser() {
		super();
		this.setUserId(ANONYMOUS_USER_ID);
		this.setUserName("游客");
	}

	public AnonymousUser(String id, String name) {
		super();
		this.setUserId(ANONYMOUS_USER_ID);
		this.setUserName("游客");
	}

	public boolean isAdmin() {
		return false;
	}
}
