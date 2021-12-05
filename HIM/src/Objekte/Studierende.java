package Objekte;




public class Studierende extends User {

	
	public Studierende(int userId, String userPass, byte[] userSalt, String userName, String userVorname, String userMail, String Praxisstelle, String betreuer) {
		super(userId, userPass,userSalt, userName, userVorname, userMail,-1);
	}

	private String studStatus;
	private String studBetreuer;


	

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
	

	
/*
	@Override
	public String toString() {
		return "Studierende [studMat=" + studMat + ", studStatus=" + studStatus + ", studBetreuer=" + studBetreuer
				+ "]";
	}
*/
}
