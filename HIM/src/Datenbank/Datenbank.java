package Datenbank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.spec.KeySpec;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import com.mysql.cj.protocol.Resultset;

import Objekte.BPS;
import Objekte.Betreuer;
import Objekte.Bewerbung;
import Objekte.PPA;
import Objekte.Studierende;
import Objekte.User;


public class Datenbank {

	private static Connection con;

/**
 * Gibt einen Benutzer anhand seiner id zur�ck
 * @param id
 * @return
 * @throws Exception
 */

	public static User getUser(int id) throws Exception {

		if (con == null)
			startConnection();

		try {

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.student WHERE id =?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					return new Studierende(id, rs.getString("passwort"), rs.getBytes("pwSalt"), rs.getString("name"),
							rs.getString("vorname"), rs.getString("mail"), rs.getString("praxisstelle"),
							rs.getString("betreuer"),rs.getBlob("nachweis"),rs.getBlob("bericht"),rs.getBlob("vertrag"));
				}
			}
			stmt = con.prepareStatement("SELECT * FROM db3.betreuer WHERE id =?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					return new Betreuer(id, rs.getString("passwort"), rs.getBytes("pwSalt"), rs.getString("name"),
							rs.getString("vorname"), rs.getString("mail"));
				}
			}
			stmt = con.prepareStatement("SELECT * FROM db3.ppa WHERE id =?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					return new PPA(id, rs.getString("passwort"), rs.getBytes("pwSalt"), rs.getString("name"),
							rs.getString("vorname"), rs.getString("mail"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	/**
	 * Gibt eine Liste aller BPS aus der Datenbank zur�ck
	 * @return
	 * @throws Exception
	 */
	public static ArrayList<BPS> getBPSlist() throws Exception {
		ArrayList<BPS> bpslist = new ArrayList<>();

		if (con == null)
			startConnection();

		PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.bpsantrag");

		ResultSet rs = stmt.executeQuery();
		if (rs != null) {

			BPS bps;
			while (rs.next()) {

				bps = new BPS(rs.getInt("id"), rs.getString("unternehmen"), rs.getString("firmenanschrift"),
						rs.getString("firmenbetreuerName"), rs.getString("abteilung"), rs.getString("telefon"),
						rs.getString("mail"), rs.getString("zeitraum"), rs.getString("themenbereich"),
						rs.getString("kurzbeschreibung"), rs.getString("status"));
				bpslist.add(bps);
			}
		}

		return bpslist;
	}
	
	/**
	 * Erzeugt eine Liste aller Studierender
	 * @return
	 * @throws Exception
	 */
	public static ArrayList<Studierende> getStudentlist() throws Exception {
		ArrayList<Studierende> studList = new ArrayList<>();

		if (con == null)
			startConnection();

		PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.student");

		ResultSet rs = stmt.executeQuery();
		if (rs != null) {

			Studierende stud;
			while (rs.next()) {

				stud = new Studierende(rs.getInt("id"), null, null, rs.getString("name"), rs.getString("vorname"), rs.getString("mail"), rs.getString("praxisstelle"), rs.getString("betreuer"),rs.getBlob("nachweis"),rs.getBlob("bericht"),rs.getBlob("vertrag"));
				studList.add(stud);
			}
		}
		return studList;
	}

	public static void createBPS(int matnum, BPS bps) throws Exception {

		if (con == null)
			startConnection();
		
		
		
		PreparedStatement stmnt = con.prepareStatement(
				"Insert INTO `db3`.`bpsantrag` VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");
		stmnt.setInt(1, bps.getId());
		stmnt.setString(2, bps.getUnternehmen());
		stmnt.setString(3, bps.getFirmenanschrift());
		stmnt.setString(4, bps.getFirmenbetreuerName());
		stmnt.setString(5, bps.getAbteilung());
		stmnt.setString(6, bps.getTelefon());
		stmnt.setString(7, bps.getMail());
		stmnt.setString(8, bps.getZeitraum());
		stmnt.setString(9, bps.getThemenbereich());
		stmnt.setString(10, bps.getKurzbeschreibung());
		stmnt.setString(11, bps.getDatumantrag());
		stmnt.setString(12, bps.getStatus());

		stmnt.executeUpdate();

	}

	/**
	 * gibt ein BPS anhand der Matrikelnummer des zugeh�rigen Studenten zur�ck
	 * @param matrikelnum
	 * @return
	 * @throws Exception
	 */
	public static BPS getBPS(int matrikelnum) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmt = null;

		stmt = con.prepareStatement("Select * FROM db3.bpsantrag WHERE id=?");
		stmt.setInt(1, matrikelnum);
		ResultSet rs = stmt.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				return new BPS(matrikelnum, rs.getString("unternehmen"), rs.getString("firmenanschrift"),
						rs.getString("firmenbetreuerName"), rs.getString("abteilung"), rs.getString("telefon"),
						rs.getString("mail"), rs.getString("zeitraum"), rs.getString("themenbereich"),
						rs.getString("kurzbeschreibung"), rs.getString("status"));
			}
		}
		return null;
	}

	

	/**
	 * Stellt einen neuen User in der Datenbank her
	 */

	public static void createUser(User user) throws Exception {

		if (con == null)
			startConnection();
		PreparedStatement stmt = null;
		switch (user.getRole()) {
		case -1:
			stmt = con.prepareStatement(
					"INSERT INTO `db3`.`student` (`id`, `passwort`, `pwSalt`, `name`, `vorname`, `mail`) VALUES (?,?,?,?,?,?);");
			break;
		case 0:
			stmt = con.prepareStatement(
					"INSERT INTO `db3`.`betreuer` (`id`, `passwort`, `pwSalt`, `name`, `vorname`, `mail`) VALUES (?,?,?,?,?,?);");
			break;
		case 1:
			stmt = con.prepareStatement(
					"INSERT INTO `db3`.`ppa` (`id`, `passwort`, `pwSalt`, `name`, `vorname`, `mail`) VALUES (?,?,?,?,?,?);");
		}
		stmt.setInt(1, user.getUserId());
		stmt.setString(2, user.getUserPass());
		stmt.setBytes(3, user.getUserSalt());
		stmt.setString(4, user.getUserName());
		stmt.setString(5, user.getUserVorname());
		stmt.setString(6, user.getUserMail());
		stmt.executeUpdate();
	}
 /**
  * Generiert einen Hash aus einem beliebigen Passwort und Salt
  * @param password
  * @param salt
  * @return
  * @throws Exception
  */
	public static String hashPassword(String password, byte[] salt) throws Exception {

		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 500000, 128);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] hash = factory.generateSecret(keySpec).getEncoded();
		return new String(hash);
	}
/**
 * Funktion um Dateien in die Datenbank hochzuladen
 * @param infile
 * @param matnum
 * @param column
 * @param isForBetreuer
 * @throws Exception
 */
	public static void upload(File infile, int matnum, String column, boolean isForBetreuer) throws Exception {
		if (con == null)
			startConnection();
		if(! isForBetreuer) {
			PreparedStatement stmnt = con.prepareStatement("UPDATE student SET " + column + " = ? WHERE id = ?");
			InputStream inputStream;
			if(infile==null)
				inputStream=null;
			else
				inputStream = new FileInputStream(infile);
			stmnt.setBlob(1, inputStream);
			stmnt.setInt(2, matnum);
			stmnt.executeUpdate();
			if(inputStream!=null)
				inputStream.close();
		}
		else
		{
			PreparedStatement stmnt = con.prepareStatement("UPDATE betreuerstudent SET `praktikumsbericht` = ? WHERE matnum = ?");
			InputStream inputStream = new FileInputStream(infile);
			stmnt.setBlob(1, inputStream);
			stmnt.setInt(2, matnum);
			stmnt.executeUpdate();
			inputStream.close();
		}
	}
	/**
	 * Funktion um den Besuchsbericht in die Datenbank hochzuladen
	 * @param infile
	 * @param matnum
	 * @throws Exception
	 */
	public static void uploadBesuchsBericht(File infile, int matnum) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("UPDATE betreuerstudent SET `bericht` = ? WHERE matnum = ?");
		InputStream inputStream = new FileInputStream(infile);
		stmnt.setBlob(1, inputStream);
		stmnt.setInt(2, matnum);
		stmnt.executeUpdate();
		inputStream.close();
		
	}
	
	/**
	 * Funktion um nach dem Vorhandensein des Besuchsberichtes eines Studenten zu pruefen
	 * @param matnum
	 * @return
	 * @throws Exception
	 */
	public static boolean checkBesuchBericht(int matnum) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("Select `bericht` From betreuerstudent WHERE matnum = ?");
		stmnt.setInt(1, matnum);
		ResultSet rs= stmnt.executeQuery();
		while (rs.next()) {
			if(rs.getBlob("bericht")!=null) return true;
		}
		return false;
	}
	
	/**
	 * Funktion um nach dem Vorhandensein des Praktikumsberichtes eines Studenten zu pruefen
	 * @param matnum
	 * @return
	 * @throws Exception
	 */
	public static boolean checkBericht(int matnum) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("Select `praktikumsbericht` From betreuerstudent WHERE matnum = ?");
		stmnt.setInt(1, matnum);
		ResultSet rs= stmnt.executeQuery();
		while (rs.next()) {
			if(rs.getBlob("praktikumsbericht")!=null) return true;
		}
		return false;
	}
	
	/**
	 * Funktion um eine Datei aus der Datenbank herunterzuladen
	 * @param path
	 * @param matnum
	 * @param column
	 * @throws Exception
	 */
	public static void download(String path, int matnum, String column) throws Exception {
		if (con == null)
			startConnection();
		FileOutputStream output = new FileOutputStream(path);
		PreparedStatement stmnt;
		
		
		if(column.equals("bericht")) {
			stmnt = con.prepareStatement("Select `praktikumsbericht` From betreuerstudent WHERE matnum = ?");
			stmnt.setInt(1, matnum);
			ResultSet rs = stmnt.executeQuery();
			while (rs.next()) {
				output.write(rs.getBlob("praktikumsbericht").getBytes(1, (int) rs.getBlob("praktikumsbericht").length()));
			}
		}
		else if (column.equals("besuchsbericht")) {
			stmnt = con.prepareStatement("Select `bericht` From betreuerstudent WHERE matnum = ?");
			stmnt.setInt(1, matnum);
			ResultSet rs = stmnt.executeQuery();
			while (rs.next()) {
				output.write(rs.getBlob("bericht").getBytes(1, (int) rs.getBlob("bericht").length()));
			}
		}
		else {
			stmnt = con.prepareStatement("Select " + column + " From student WHERE id = ?");
			stmnt.setInt(1, matnum);
			ResultSet rs = stmnt.executeQuery();
			while (rs.next()) {
				output.write(rs.getBlob(column).getBytes(1, (int) rs.getBlob(column).length()));
			}
		}
		
		
		
		
		output.close();

	}

	/**
	 * Teilt einen Studenten vorl�ufig einem Betreuer zu
	 * @param bpsId
	 * @param professor
	 * @throws Exception
	 */

	public static void studBetreuerMatch(int bpsId, int professor)	throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("INSERT INTO db3.bewerbungen (`bps`, `professor`,`position`) VALUES (?,?,?) ");
		
		stmnt.setInt(1, bpsId);
		stmnt.setInt(2, professor);
		stmnt.setInt(3, getQueuePosition(bpsId)+1);
		stmnt.executeUpdate();
		
	}
	
	/**
	 * �berpr�fung des Platzes in der Chronologischen Rangliste der Betreuerbewerbungen
	 * @param bps
	 * @return
	 * @throws Exception
	 */
	public static int getQueuePosition(int bps) throws Exception{
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("SELECT * FROM db3.bewerbungen WHERE bps=?");
		updateBPSStatus("Bewerber",bps);
		stmnt.setInt(1, bps);
		ResultSet rs =stmnt.executeQuery();
	    if (rs != null) 
	    {
	      rs.last();
	      return rs.getRow(); 
	    }
		return 0;
	}
	
	/**
	 * Gibt die Bewerbungen auf einen Studenten zur�ck
	 * @param id
	 * @return
	 * @throws Exception
	 */
	 public static ArrayList<Bewerbung> getApplicationList(int id) throws Exception {
		 if (con == null)
				startConnection();
		 ArrayList<Bewerbung> bewerbungList = new ArrayList<>();
		 PreparedStatement stmnt = con.prepareStatement("SELECT * FROM db3.bewerbungen WHERE bps=?");
		 stmnt.setInt(1, id);
		 ResultSet rs=stmnt.executeQuery();
		 if(rs!=null) {
			 while(rs.next()) {
				 bewerbungList.add(new Bewerbung(rs.getInt(1),rs.getInt(3),rs.getInt(2)));
			 }
			 return bewerbungList;
		 }
		 else return null;
	 }
	 
	 /**
	  * Setzt den Status des BPS eines Studenten
	  * @param status
	  * @param id
	  * @throws Exception
	  */
	 public static void updateBPSStatus(String status, int id) throws Exception{
		 if (con == null)
				startConnection();
		 PreparedStatement stmnt = con.prepareStatement("UPDATE db3.bpsantrag SET `status` = ? WHERE id=?");
		 stmnt.setString(1, status);
		 stmnt.setInt(2, id);
		 stmnt.executeUpdate();
	 }
	 
	 
	 /**
	  * Gibt eine Liste aller Studenten zur�ck
	  * @param betnum
	  * @return
	  * @throws Exception
	  */
	 public static ArrayList<Integer> getStudentList(int betnum) throws Exception {
		 if (con == null)
				startConnection();
		 PreparedStatement stmnt = con.prepareStatement("SELECT matnum FROM db3.betreuerstudent WHERE betnum=?");
		 stmnt.setInt(1, betnum);
		 ResultSet rs=stmnt.executeQuery();
		 ArrayList<Integer> zuteilungList = new ArrayList<>();
		 while(rs.next()) {
			 zuteilungList.add(rs.getInt("matnum"));
		 }
		 return zuteilungList;
	 }
	 
	 /**
	  * Teilt einen Betreuer fest einem Studenten zu
	  * @param matnum
	  * @param betnum
	  * @throws Exception
	  */
	 public static void zuteilung(int matnum, int betnum) throws Exception{
		 if (con == null)
				startConnection();
		 PreparedStatement stmnt = con.prepareStatement("Insert INTO db3.betreuerstudent (`betnum`,`matnum`) VALUES (?,?)");
		 PreparedStatement stmnt2 = con.prepareStatement("DELETE FROM db3.bewerbungen WHERE bps=?");
		 stmnt2.setInt(1, matnum);
		 
		 updateBPSStatus("Zugeteilt", matnum);
		 stmnt.setInt(1, betnum);
		 stmnt.setInt(2, matnum);
		 stmnt.executeUpdate();
		 stmnt2.executeUpdate();
	 }
	 
	 /**
	  * Gibt die Mitarbeiternummer des Betreuer eines Studenten zur�ck
	  * @param matnum
	  * @return
	  * @throws Exception
	  */
	 public static String getBetreuer(int matnum) throws Exception {
		 if(con==null)
			 startConnection();
		 try {
		 PreparedStatement stmnt1 = con.prepareStatement("Select `betnum` From betreuerstudent WHERE matnum = ?");
		 
			stmnt1.setInt(1, matnum);
		
		 ResultSet rs1=stmnt1.executeQuery();
		 Integer betnum=null;
		 if(rs1!=null) {
			 while(rs1.next()) {
				betnum=rs1.getInt("betnum");
				
			 }
			 return getUser(betnum).getUserName();
		 }
		 else return null;
		 } 
		 catch (Exception e) {
				
			return null;
		 }
		
	 }
	 
	
	 /**
	  * Akzeptiert einen Praktikumsbericht
	  * @param matnum
	  * @throws Exception
	  */
	 public static void acceptBericht(int matnum) throws Exception {
		 if (con == null)
				startConnection();
		 PreparedStatement stmnt1 = con.prepareStatement("Select `praktikumsbericht` From betreuerstudent WHERE matnum = ?");
		 stmnt1.setInt(1, matnum);
		 ResultSet rs1=stmnt1.executeQuery();
		 Blob bericht=null;
		 while(rs1.next()) {
			bericht=rs1.getBlob("praktikumsbericht");
		 }
		 PreparedStatement stmnt2 = con.prepareStatement("UPDATE db3.student SET `bericht` = ? WHERE id=?");
		 stmnt2.setBlob(1, bericht);
		 stmnt2.setInt(2, matnum);
		 stmnt2.executeUpdate();
		
	 }
	 
	 /**
	  * L�dt eine Feedbackdatei f�r den Praktikumsbericht eines Studentenin die Datenbank hoch
	  * @param matnum
	  * @param inFile
	  * @throws Exception
	  */
	 public static void sendFeedback(int matnum, File inFile) throws Exception {
		 if (con == null)
				startConnection();
		
		 PreparedStatement stmnt = con.prepareStatement("UPDATE db3.betreuerstudent SET `feedback` = ? WHERE matnum=?");
		 InputStream inputStream = null;
		 if(inFile!=null)	
			inputStream = new FileInputStream(inFile);
			
			stmnt.setBlob(1, inputStream);
			stmnt.setInt(2, matnum);
			stmnt.executeUpdate();
			if(inputStream!=null)
				inputStream.close();
		
	 }
	 
	 /**
	  * L�dt die Feedbackdatei f�r einen Studenten aus der Datenbank herunter
	  * @param matnum
	  * @param path
	  * @throws Exception
	  */
	 public static void getFeedback(int matnum, String path) throws Exception {
		 if (con == null)
				startConnection();
		 FileOutputStream output = new FileOutputStream(path);
			PreparedStatement stmnt;
			stmnt = con.prepareStatement("Select `feedback` From betreuerstudent WHERE matnum = ?");
			stmnt.setInt(1, matnum);
			ResultSet rs = stmnt.executeQuery();
			while (rs.next()) {
				output.write(rs.getBlob("feedback").getBytes(1, (int) rs.getBlob("feedback").length()));
				
			}
			output.close();
	 }
	 
	 /**
	  * Pr�ft, ob eine Feedbackdatei f�r einen Studenten existiert
	  * @param matnum
	  * @return
	  * @throws Exception
	  */
	 public static boolean checkFeedback(int matnum) throws Exception {
		 if (con == null)
				startConnection();
			PreparedStatement stmnt = con.prepareStatement("Select `feedback` From betreuerstudent WHERE matnum = ?");
			stmnt.setInt(1, matnum);
			ResultSet rs= stmnt.executeQuery();
			while (rs.next()) {
				if(rs.getBlob("feedback")!=null) return true;
			}
			return false;
		
	 }
	 
	 /**
	  * Startet die Verbindung zur Datenbank
	  * @throws Exception
	  */
	public static void startConnection() throws Exception {

		String url = "jdbc:mysql://3.69.96.96:3306/";
		String dbName = "db3";
		String userName = "db3";
		String password = "!db3.winf?";
		String driver = "com.mysql.cj.jdbc.Driver";

		Class.forName(driver);

		con = DriverManager.getConnection(url + dbName, userName, password);

		System.out.println("Connected to the database");
	}
	
	/**
	 * Macht einen Studenten zu einem Absolventen und f�gt ihn als solchen in die Datenbank ein
	 * @param matnum
	 * @throws Exception
	 */
	public static void addAbsolvent(int matnum) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("Insert INTO db3.absolventen (`id`,`datum`,`betreuer`) VALUES (?,?,?)");
		Date today = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
	    String date = format.format(today);
		stmnt.setInt(1, matnum);
		stmnt.setString(2,date);
		stmnt.setString(3, getBetreuer(matnum));
		stmnt.executeUpdate();
		updateBPSStatus("Beendet", matnum);
	}
	
	/**
	 * Legt den Downloadpfad f�r das PPA fest
	 * @param ppaNum
	 * @param path
	 * @throws Exception
	 */
	public static void setPpaPath(int ppaNum, String path) throws Exception {
		if (con == null)
			startConnection();
		
		PreparedStatement stmnt = con.prepareStatement("UPDATE db3.ppa SET `pfad` = ? WHERE id=?");
		 stmnt.setString(1, path);
		 stmnt.setInt(2, ppaNum);
		 stmnt.executeUpdate();
	}
	
	/**
	 * Legt den Downloadpfad f�r den Betreuer fest
	 * @param ppaNum
	 * @param path
	 * @throws Exception
	 */
	public static void setBetreuerPath(int betNum, String path) throws Exception {
		if (con == null)
			startConnection();
		
		PreparedStatement stmnt = con.prepareStatement("UPDATE db3.betreuer SET `pfad` = ? WHERE id=?");
		 stmnt.setString(1, path);
		 stmnt.setInt(2, betNum);
		 stmnt.executeUpdate();
	}
	
	/**
	 * gibt den Downloadpfad f�r das PPA zur�ck
	 * @param ppaNum
	 * @return
	 * @throws Exception
	 */
	public static String getPpaPath(int ppaNum) throws Exception {
		if (con == null)
			startConnection();
		
		PreparedStatement stmnt = con.prepareStatement("Select `pfad` From db3.ppa WHERE id = ?");
		stmnt.setInt(1, ppaNum);
		ResultSet rs= stmnt.executeQuery();
		while (rs.next()) {
			if(rs.getString("pfad")!=null) return rs.getString("pfad");
			else return "C:\\";
		}
		return null;
	}
	
	/**
	 * gibt den Downloadpfad f�r des Betreuers zur�ck
	 * @param ppaNum
	 * @return
	 * @throws Exception
	 */
	public static String getBetreuerPath(int betNum) throws Exception {
		if (con == null)
			startConnection();
		
		PreparedStatement stmnt = con.prepareStatement("Select `pfad` From db3.betreuer WHERE id = ?");
		stmnt.setInt(1, betNum);
		ResultSet rs= stmnt.executeQuery();
		while (rs.next()) {
			if(rs.getString("pfad")!=null) return rs.getString("pfad");
			else return "C:\\";
		}
		return null;
	}
	
	/**
	 * Gibt eine Map der Absolventen f�r die einspeisung in Excel zur�ck
	 * @return
	 * @throws SQLException
	 */
	public static TreeMap<String, Object[]> getAbsolventen() throws Exception{
		if (con == null)
			startConnection();
		PreparedStatement stmnt=con.prepareStatement("Select * From db3.absolventen");
		ResultSet rs= stmnt.executeQuery();
		TreeMap<String, Object[]> data= new TreeMap <String, Object[]> ();
		int i=1;
		data.put("1", new Object[] {"Matrikelnummer", "Abschlussdatum", "Betreuer"});
		while(rs.next()) {
			i++;
			data.put(""+i,new Object[] {rs.getInt("id"), rs.getString("datum"), rs.getString("betreuer")});
		}
		return data;
		
	}
	
	
}