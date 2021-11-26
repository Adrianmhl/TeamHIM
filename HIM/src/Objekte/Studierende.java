package Objekte;

import Datenbank.Datenbank;

public class Studierende extends User {

	public Studierende() {

	}

	public Studierende(String userId, String userPass, String userName, String userVorname, String userMail) {
		super(userId, userPass, userName, userVorname, userMail);
		// TODO Auto-generated constructor stub
	}

	private String studMat;
	private String studStatus;
	private String studBetreuer;

	public String getStudMat() {
		return studMat;
	}

	public void setStudMat(String studMat) {
		this.studMat = studMat;
	}

	public String getStudStatus() {
		return studStatus;
	}

	public void setStudStatus(String studStatus) {
		this.studStatus = studStatus;
	}

	public String getStudBetreuer() {
		return studBetreuer;
	}

	public void setStudBetreuer(String studBetreuer) {
		this.studBetreuer = studBetreuer;
	}

	@Override
	public boolean verifyLogin(String id, String passwort) {
		Datenbank db = new Datenbank();
		String pass = db.getStudierende(id).getUserPass();
		if (pass.equals(passwort))
			return true;
		else
			return false;

	}

	@Override
	public String toString() {
		return "Studierende [studMat=" + studMat + ", studStatus=" + studStatus + ", studBetreuer=" + studBetreuer
				+ "]";
	}

}
