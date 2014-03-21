package com.imessage.model;

public class AuthContextHolder {

	private static ThreadLocal<AuthContext> authContextHolder = new ThreadLocal<AuthContext>();

	public static AuthContext getAuthContext() {
		return (AuthContext) authContextHolder.get();
	}

	public static void setAuthContext(AuthContext authContext) {
		authContextHolder.set(authContext);
	}

	public static void cleanAuthContext() {
		setAuthContext(null);
	}
}
