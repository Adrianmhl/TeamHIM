package Objekte;

public class Betreuer extends User {

	private int betPersNr;
	private Studierende listeStud;

	public Betreuer(int betPersNr, String pass, byte[] salt, String nachname, String vorname, String mail) {
		super(betPersNr, pass, salt, nachname, vorname, mail, 0);
	}

}
