package com.revature.models;

public class Login {
	
	
	
	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", username=" + username + ", pword=" + pword + "]";
	}
	private int login_id;
	private String username;
	private String pword;
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	
	
	
	

}
