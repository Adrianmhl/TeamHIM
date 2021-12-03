package Datenbank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Objekte.Betreuer;
import Objekte.Studierende;

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
	public static Betreuer getBetreuer(int betPersNr) throws Exception {
		if (con == null)
			startConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.betreuer WHERE name = ?");
			stmt.setInt(1, betPersNr);
			ResultSet rs = stmt.executeQuery();
			 while (rs.next()) { 
			
			return new Betreuer(betPersNr, rs.getString("nachname"), rs.getString("vorname"));
			}
		} catch (SQLException e) {
			return null;
		}
		return null;
	}

	/**
	 * @throws Exception
	 * @Salam
	 */

	public static Studierende getStudierende(String id) throws Exception {

		if (con == null)
			startConnection();

		try {

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.student WHERE id =?");
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
			return new Studierende(id, rs.getString("passwort"), rs.getString("name"), rs.getString("vorname"),
					rs.getString("mail"));
			 }

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	/**
	 * Stellt neuen User im Datenbank her (zur Zeit nur "student" Tabelle)
	 * 
	 * @author isedo
	 * @param id
	 * @param passwort
	 * @param name
	 * @param vorname
	 * @param mail
	 * @return //
	 * @throws Exception
	 */

	public static void createUser(Studierende student) throws Exception {// Vorschlag: Student als Parameter

		if (con == null)
			startConnection();

		PreparedStatement stmt = con.prepareStatement(
				"INSERT INTO `db3`.`student` (`id`, `passwort`, `name`, `vorname`, `mail`) VALUES (?,?,?,?,?);");
		stmt.setString(1, student.getUserId());
		stmt.setString(2, student.getUserPass());
		stmt.setString(3, student.getUserName());
		stmt.setString(4, student.getUserVorname());
		stmt.setString(5, student.getUserMail());
		stmt.executeUpdate();
	}
	public static void upload(String path, String matnum) throws Exception {
		if (con == null)
			startConnection();
        PreparedStatement stmnt = con.prepareStatement("UPDATE student SET nachweis = ? WHERE id = ?");
        InputStream inputStream = new FileInputStream(new File(path));
        System.out.println(inputStream);
        stmnt.setBlob(1, inputStream);
        stmnt.setString(2, matnum);
        stmnt.executeUpdate();
        inputStream.close();
	}
	public boolean deleteUser() { 

		return false;
	}

	public void studBetreuerMatch() {

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