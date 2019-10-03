package com.Controller;

public class User {
 
	private String userid;
	private String password;

 
	 public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public User() {
		super();
		
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	}
