package Datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Objekte.Betreuer;
import Objekte.Studierende;

public class Datenbank {

	private static Connection conn;

	// Connetion
	static void startConnDB() throws ClassNotFoundException {

		String url = "jdbc:mysql://3.69.96.96:3306/";
		String dbName = "db3";
		String userName = "db3";
		String password = "!db3.winf?";
		String driver = "com.mysql.cj.jdbc.Driver";

		Class.forName(driver);

		try {
			conn = DriverManager.getConnection(url + dbName, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connected to the database");
	}

	/**
	 * 
	 * @param betPersNr
	 * @return
	 */
	public Betreuer getBetreuer(int betPersNr) {
		if (conn == null)
			try {
				startConnDB();
			} catch (ClassNotFoundException e1) {

				e1.printStackTrace();
			}
		Betreuer betreuer = null;

		try {
			Statement stmt = conn.createStatement();
			stmt = conn.createStatement();

			ResultSet rs;
			rs = stmt.executeQuery("SELECT * FROM db3.betreuer WHERE name = '" + betPersNr + "'");
			while (rs.next()) {

				betreuer = new Betreuer(betPersNr, rs.getString("nachname"), rs.getString("vorname"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return betreuer;
		//

	}

	public Studierende getStudierende(int mnr) {

		if (conn == null)
			try {
				startConnDB();
			} catch (ClassNotFoundException e1) {

				e1.printStackTrace();
			}

		Studierende student = null;

		try {

			Statement stmt = conn.createStatement();
			ResultSet rs;

			rs = stmt.executeQuery("SELECT * FROM db3.student WHERE matrikelnummer = '" + mnr + "'");

			while (rs.next()) {

				student = new Studierende(mnr, rs.getString("vorname"), rs.getString("nachname"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;

	}

	public boolean createUser() {

		return true;
	}

	public boolean deleteUser() {
		return false;
	}

	public void studBetreuerMatch() {

	}

	public void startConnection() {
	}

	public void closeConnection() {

	}
}