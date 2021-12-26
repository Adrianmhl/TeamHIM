package Objekte;

import java.io.File;
import java.sql.Blob;

public class Studierende extends User {

	private String studStatus;
	private String studBetreuer;
	private String Praxisstelle;
	private Blob nachweis;
	private Blob bericht;
	private Blob vertrag;
	
	public Studierende(int userId, String userPass, byte[] userSalt, String userName, String userVorname, String userMail, String Praxisstelle, String betreuer,Blob nachweis, Blob bericht, Blob vertrag) {
		super(userId, userPass,userSalt, userName, userVorname, userMail,-1);
		this.Praxisstelle=Praxisstelle;
		this.nachweis=nachweis;
		this.bericht=bericht;
		this.vertrag=vertrag;
	}
	


	

	public String getPraxisstelle() {
		return this.Praxisstelle;
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





	public Blob getNachweis() {
		return nachweis;
	}





	public Blob getBericht() {
		return bericht;
	}





	public Blob getVertrag() {
		return vertrag;
	}
	

}
