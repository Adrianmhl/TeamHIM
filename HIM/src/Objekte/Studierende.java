package Objekte;


import Datenbank.Datenbank;

public class Studierende extends User {

	public Studierende() {

	}

	public Studierende(int userId, String userPass, byte[] userSalt, String userName, String userVorname, String userMail, String Praxisstelle, String betreuer) {
		super(userId, userPass,userSalt, userName, userVorname, userMail);
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
	/**
	 * @author isedo Überprüft Login Daten (Datenbank == Eingabe ? )
	 * @throws Exception
	 */
	public boolean verifyLogin(int id, String passwort) throws Exception {
		

		if (Datenbank.getStudierende(id) == null) { 

			return false;
		}
		String pass = Datenbank.getStudierende(id).getUserPass();
		byte[] salt = Datenbank.getStudierende(id).getUserSalt();
		String hashString= Datenbank.hashPassword(passwort, salt);
		
		if (hashString.equals(pass))
			return true;
		return false;

	}

	@Override
	public String toString() {
		return "Studierende [studMat=" + studMat + ", studStatus=" + studStatus + ", studBetreuer=" + studBetreuer
				+ "]";
	}

}
