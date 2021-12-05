package Objekte;

import Datenbank.Datenbank;

public class User {

	private int userId;
	private String userPass;
	private String userName;
	private String userVorname;
	private String userMail;
	private byte[] userSalt;
	private String loginStatus;
	private int role;
	

	public User(int userId,String userPass, byte[] userSalt, String userName, String userVorname, String userMail, int role) {

		this.userId = userId;
		this.userPass = userPass;
		this.userVorname = userVorname;
		this.userName = userName;
		this.userMail = userMail;
		this.userSalt=userSalt;
		this.role=role;
	}

	
	
	
	
	public String getUserVorname() {
		return userVorname;
	}

	public void setUserVorname(String userVorname) {
		this.userVorname = userVorname;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getLoginStatus() {
		return loginStatus;
	}
	public byte[] getUserSalt() {
		return userSalt;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public int getRole() {
		return role;
	}
	
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", userVorname="
				+ userVorname + ", userMail=" + userMail + ", loginStatus=" + loginStatus + "]";
	}

}
