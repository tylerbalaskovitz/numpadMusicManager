package com.revature.models;

public class Login {
	
	private String username;
	private String pword;
	
	
	
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", pword=" + pword + "]";
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
