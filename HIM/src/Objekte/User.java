package Objekte;

public class User {

	private String userId;
	private String userPass;
	private String userName;
	private String userVorname;
	private String userMail;

	private String loginStatus;

	public User() {

	}

	public User(String userId, String userPass, String userName, String userVorname, String userMail) {

		this.userId = userId;
		this.userPass = userPass;
		this.userVorname = userVorname;
		this.userName = userName;
		this.userMail = userMail;
	}

	public String getUserVorname() {
		return userVorname;
	}

	public void setUserVorname(String userVorname) {
		this.userVorname = userVorname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public boolean verifyLogin(String id, String passwort) throws Exception {

		return false;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", userVorname="
				+ userVorname + ", userMail=" + userMail + ", loginStatus=" + loginStatus + "]";
	}

}
