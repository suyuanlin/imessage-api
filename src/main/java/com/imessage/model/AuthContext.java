package com.imessage.model;

import java.io.Serializable;
import java.util.List;

public interface AuthContext extends Serializable {

	public User getUser();

	public List<String> getGroupIds();

	public String getCurrentDomain();
	
	public boolean isSignin();

}
