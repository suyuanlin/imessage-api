package com.imessage.model;

import java.util.List;

public class AuthContextImpl implements AuthContext {

	private static final long serialVersionUID = -3708932905237739605L;

	protected User user;

	protected List<String> groupIds;

	protected String domain;

	public AuthContextImpl(User user, List<String> groupIds, String domain) {
		super();
		this.user = user;
		this.groupIds = groupIds;
		this.domain = domain;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public List<String> getGroupIds() {
		return groupIds;
	}

	@Override
	public String getCurrentDomain() {
		return this.domain;
	}

	@Override
	public boolean isSignin() {
		return user != null && !user.getUserId().equals(AnonymousUser.ANONYMOUS_USER_ID);
	}

}
