package Datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Objekte.Betreuer;
import Objekte.Studierende;

public class Datenbank {

	private static Connection con;

	/**
<<<<<<< Updated upstream
	 * @SalamQu @author isedo
	 * @param betPersNr
	 * @return
=======
	 * @Salam  
	 * 
>>>>>>> Stashed changes
	 */
	public Betreuer getBetreuer(int betPersNr) {
		if (con == null)
			try {
				startConnection();
			} catch (ClassNotFoundException e1) {

				e1.printStackTrace();
			}
		Betreuer betreuer = null;

		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.betreuer WHERE name = ?");
			stmt.setInt(1, betPersNr);
			ResultSet rs;
			rs = stmt.executeQuery();
			while (rs.next()) {

				betreuer = new Betreuer(betPersNr, rs.getString("nachname"), rs.getString("vorname"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return betreuer;

	}
	/**
	 * @Salam
	 */

	public Studierende getStudierende(String id) {

		if (con == null)
			try {
				startConnection();
			} catch (ClassNotFoundException e1) {

				e1.printStackTrace();
			}

		Studierende student = null;

		try {

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM db3.student WHERE id =?");
			ResultSet rs;
			stmt.setString(1, id);
			rs = stmt.executeQuery();

			while (rs.next()) {

				student = new Studierende(id, rs.getString("passwort"), rs.getString("name"), rs.getString("vorname"),
						rs.getString("mail"));

			}

		} catch (Exception e) {
			return null;
		}
		return student;

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
	 */

	public boolean createUser(String id, String passwort, String name, String vorname, String mail) {

		if (con == null)
			try {
				startConnection();
			} catch (ClassNotFoundException e1) {

				e1.printStackTrace();
			}

		try {

			PreparedStatement stmt = con.prepareStatement("INSERT INTO `db3`.`student` (`id`, `passwort`, `name`, `vorname`, `mail`) VALUES (?,?,?,?,?);");
			stmt.setString(1, id);
			stmt.setString(2,passwort);
			stmt.setString(3, name);
			stmt.setString(4,vorname);
			stmt.setString(5, mail);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}
  
	public boolean deleteUser() { 
		
		return false;
	}

	public void studBetreuerMatch() {

		
	}

	public void startConnection() throws ClassNotFoundException {

		String url = "jdbc:mysql://3.69.96.96:3306/";
		String dbName = "db3";
		String userName = "db3";
		String password = "!db3.winf?";
		String driver = "com.mysql.cj.jdbc.Driver";

		Class.forName(driver);

		try {
			con = DriverManager.getConnection(url + dbName, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connected to the database");
	}

	public void closeConnection() {

	}
}