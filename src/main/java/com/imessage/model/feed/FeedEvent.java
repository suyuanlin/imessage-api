package com.imessage.model.feed;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * FeedEvent 2014-1-14 下午6:39:38
 * 
 * @author Tkk
 */
public class FeedEvent {

	/**
	 * 触发的用户ID
	 */
	private String userid;

	/**
	 * 触发的用户名
	 */
	private String username;
	
	/**
	 * 
	 */
	private String service;
	
	/**
	 * 业务id
	 */
	private String sid;

	/**
	 * 业务数据
	 */
	private Serializable serviceData;

	/**
	 * 业务链接
	 */
	private String serviceLink;

	/**
	 * 创建时间
	 */
	private Date createDate;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getServiceLink() {
		return serviceLink;
	}

	public void setServiceLink(String serviceLink) {
		this.serviceLink = serviceLink;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Serializable getServiceData() {
		return serviceData;
	}

	public void setServiceData(Serializable serviceData) {
		this.serviceData = serviceData;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

}
