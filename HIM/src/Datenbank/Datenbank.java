package Datenbank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
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
	 * <<<<<<< Updated upstream
	 * 
	 * @SalamQu @author isedo
	 * @param betPersNr
	 * @return =======
	 * @throws Exception
	 * @Salam
	 * 
	 *        >>>>>>> Stashed changes
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
							rs.getString("betreuer"));
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
	 * holt bps daten aus der datenbank und gibt sie in das bps-objekt weiter
	 * 
	 * @return
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
//		System.out.println(bpslist);
		return bpslist;
	}
	/**
	 * Diese Methode erzeugt ein Array der Studierenden
	 * @author Adrian
	 * @return studList[] Liste von angelegten Studierenden
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

				stud = new Studierende(rs.getInt("id"), null, null, rs.getString("name"), rs.getString("vorname"), rs.getString("mail"), rs.getString("praxisstelle"), rs.getString("betreuer"));
				studList.add(stud);
			}
		}
		return studList;
	}

	public static void updateBPS(int matrikelnum, BPS bps) throws Exception {

		if (con == null)
			startConnection();
		PreparedStatement stmt = null;

		stmt = con.prepareStatement(
				"UPDATE `db3`.`bpsantrag` SET `unternehmen` = ?, `firmenanschrift` = ?, `firmenbetreuerName` = ?, "
						+ "`abteilung` = ?, `telefon` = ?, `mail` = ?, `zeitraum` = ?, `themenbereich` = ?, "
						+ "`kurzbeschreibung` = ?, `datumantrag` = ?, `status` = ? WHERE (`id` = " + matrikelnum + ")");

		stmt.setString(1, bps.getUnternehmen());
		stmt.setString(2, bps.getFirmenanschrift());
		stmt.setString(3, bps.getFirmenbetreuerName());
		stmt.setString(4, bps.getAbteilung());
		stmt.setString(5, bps.getTelefon());
		stmt.setString(6, bps.getMail());
		stmt.setString(7, bps.getZeitraum());
		stmt.setString(8, bps.getThemenbereich());
		stmt.setString(9, bps.getKurzbeschreibung());
		stmt.setString(10, bps.getDatumantrag());
		stmt.setString(11, bps.getStatus());

		stmt.executeUpdate();

	}

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

	public static void createBPS(int matrikelnum) throws Exception {

		if (con == null)
			startConnection();
		PreparedStatement stmt = null;

		stmt = con.prepareStatement("INSERT INTO `db3`.`bpsantrag` (`id`, `status`) VALUES (?,?);");
		stmt.setInt(1, matrikelnum);
		stmt.setString(2, "");
		stmt.executeUpdate();

	}

	/**
	 * Stellt neuen User im Datenbank her
	 * 
	 * @author isedor, Felix
	 * @param id
	 * @param passwort
	 * @param name
	 * @param vorname
	 * @param mail
	 * @return //
	 * @throws Exception
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

	public static String hashPassword(String password, byte[] salt) throws Exception {

		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 500000, 128);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] hash = factory.generateSecret(keySpec).getEncoded();
		return new String(hash);
	}

	public static void upload(File infile, int matnum, String column) throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("UPDATE student SET " + column + " = ? WHERE id = ?");
		InputStream inputStream = new FileInputStream(infile);
		System.out.println(inputStream);
		// stmnt.setString(1, column);
		stmnt.setBlob(1, inputStream);
		stmnt.setInt(2, matnum);
		stmnt.executeUpdate();
		inputStream.close();
	}

	public static void download(String path, int matnum, String column) throws Exception {
		if (con == null)
			startConnection();
		FileOutputStream output = new FileOutputStream(path);
		PreparedStatement stmnt = con.prepareStatement("Select " + column + " From student WHERE id = ?");
		// stmnt.setString(1, column);
		stmnt.setInt(1, matnum);
		ResultSet rs = stmnt.executeQuery();
		while (rs.next()) {
			output.write(rs.getBlob(column).getBytes(1, (int) rs.getBlob(column).length()));
		}
		output.close();

	}

	public boolean deleteUser() {

		return false;
	}

	public static void studBetreuerMatch(int bpsId, int professor)	throws Exception {
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("INSERT INTO db3.bewerbungen (`bps`, `professor`,`position`) VALUES (?,?,?) ");
		stmnt.setInt(1, bpsId);
		stmnt.setInt(2, professor);
		stmnt.setInt(3, getQueuePosition(bpsId)+1);
		stmnt.executeUpdate();
		
	}
	
	public static int getQueuePosition(int bps) throws Exception{
		if (con == null)
			startConnection();
		PreparedStatement stmnt = con.prepareStatement("SELECT * FROM db3.bewerbungen WHERE bps=?");
		stmnt.setInt(1, bps);
		ResultSet rs =stmnt.executeQuery();
	    if (rs != null) 
	    {
	      rs.last();
	      return rs.getRow(); 
	    }
		return 0;
	}
	
	 public static ArrayList<Bewerbung> getApplicationList(int id) throws Exception {
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
	 
	 public static void updateBPSStatus(String status, int id) throws Exception{
		 if (con == null)
				startConnection();
		 PreparedStatement stmnt = con.prepareStatement("UPDATE db3.bpsantrag SET `status` = ? WHERE id=?");
		 stmnt.setString(1, status);
		 stmnt.setInt(2, id);
		 stmnt.executeUpdate();
	 }
	 
	 public static void zuteilung(int matnum, int betnum) throws Exception{
		 PreparedStatement stmnt = con.prepareStatement("Insert INTO db3.betreuerstudent (`betnum`,`matnum`) VALUES (?,?)");
		 updateBPSStatus("Zugeteilt", matnum);
		 stmnt.setInt(1, betnum);
		 stmnt.setInt(2, matnum);
		 stmnt.executeUpdate();
		 
	 }
	 
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

	public void closeConnection() {

	}
}