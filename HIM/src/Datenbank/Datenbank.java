package Datenbank;

import java.sql.Connection;

import Objekte.Betreuer;
import Objekte.Studierende;

public class Datenbank {
	
	private Connection connection;
	
	
	public Betreuer getBetreuer() {
		return null;
	
	}
	
   public Studierende getStudierende() {
	   return null;
   }

   public boolean createUser() {
	   return true;
   }

   public boolean deleteUser() {
	   return false;
   }
   
   public void studBetreuerMatch() {
	
  }
   public void  startConnection() {
  }
  
   public void closeConnection() {
   
}
}