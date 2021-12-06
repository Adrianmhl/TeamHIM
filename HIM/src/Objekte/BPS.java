package Objekte;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BPS {

	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	private LocalDateTime now = LocalDateTime.now();
	private int id;
	private String unternehmen;
	private String firmenanschrift;
	private String firmenbetreuerName;
	private String abteilung;
	private String telefon;
	private String mail;
	private String zeitraum;
	private String themenbereich;
	private String kurzbeschreibung;
	private String datumantrag;

	public BPS(int id, String unternehmen, String firmenanschrift, String firmenbetreuerNameName, String abteilung,
			String telefon, String mail, String zeitraum, String themenbereich, String kurzbeschreibung) {

		this.id = id;
		this.unternehmen = unternehmen;
		this.firmenanschrift = firmenanschrift;
		this.firmenbetreuerName = firmenbetreuerNameName;
		this.abteilung = abteilung;
		this.telefon = telefon;
		this.mail = mail;
		this.zeitraum = zeitraum;
		this.themenbereich = themenbereich;
		this.kurzbeschreibung = kurzbeschreibung;
		this.datumantrag = dtf.format(now);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnternehmen() {
		return unternehmen;
	}

	public void setUnternehmen(String unternehmen) {
		this.unternehmen = unternehmen;
	}

	public String getFirmenanschrift() {
		return firmenanschrift;
	}

	public void setFirmenanschrift(String firmenanschrift) {
		this.firmenanschrift = firmenanschrift;
	}

	public String getfirmenbetreuerName() {
		return firmenbetreuerName;
	}

	public void setfirmenbetreuerName(String firmenbetreuerName) {
		this.firmenbetreuerName = firmenbetreuerName;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getZeitraum() {
		return zeitraum;
	}

	public void setZeitraum(String zeitraum) {
		this.zeitraum = zeitraum;
	}

	public String getThemenbereich() {
		return themenbereich;
	}

	public void setThemenbereich(String themenbereich) {
		this.themenbereich = themenbereich;
	}

	public String getKurzbeschreibung() {
		return kurzbeschreibung;
	}

	public void setKurzbeschreibung(String kurzbeschreibung) {
		this.kurzbeschreibung = kurzbeschreibung;
	}

	public String getDatumantrag() {
		return datumantrag;
	}

	public void setDatumantrag(String datumantrag) {
		this.datumantrag = datumantrag;
	}

	@Override
	public String toString() {
		return "BPS [dtf=" + dtf + ", now=" + now + ", id=" + id + ", unternehmen=" + unternehmen + ", firmenanschrift="
				+ firmenanschrift + ", firmenbetreuerName=" + firmenbetreuerName + ", abteilung=" + abteilung
				+ ", telefon=" + telefon + ", mail=" + mail + ", zeitraum=" + zeitraum + ", themenbereich="
				+ themenbereich + ", kurzbeschreibung=" + kurzbeschreibung + ", datumantrag=" + datumantrag + "]";
	}

}