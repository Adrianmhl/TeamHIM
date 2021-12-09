package Swing;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.ButtonUI;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import Datenbank.Datenbank;

/**
 * Diese Klasse dient als Model für die Tabelle MenuBet
 * 
 * @author adrianmuhleisen
 *
 */

public class MenuBetTableModel extends AbstractTableModel {

	public int getColumnCount() {
		return 4;

	}

	public int getRowCount() {
		try {
			return Datenbank.getStudentlist().size();
		} catch (Exception e) {
			return 0;
		}
	}

	public String getColumnName(int colnum) {
		// Für die erste Spalte
		if (colnum == 0) {
			return "Student";
		}
		// Für die zweite Spalte
		if (colnum == 1) {
			return "Unternehmen";
		}

		// Für die dritte Spalte
		if (colnum == 2) {
			return "Betreuer";
		}

		// Für die vierte Spalte
		if (colnum == 3) {
			return "Bewerben";
		}
		return null;
	}

	public Object getValueAt(int row, int col) {
		// Für die erste Spalte: Name
		if (col == 0) {
			try {
				return Datenbank.getStudentlist().get(row).getUserVorname() + " "
						+ Datenbank.getStudentlist().get(row).getUserName();
			} catch (Exception e) {
				return "Fehler";
			}
		}

		// Für die zweite Spalte: Unternehmen
		if (col == 1) {
			try {

				return Datenbank.getStudentlist().get(row).getPraxisstelle();
			} catch (Exception e) {
				return "Fehler";
			}
		}

		// Für die dritte Spalte: Betreuer
		if (col == 2) {
			try {

				return Datenbank.getStudentlist().get(row).getStudBetreuer();
			} catch (Exception e) {
				return "Fehler";
			}
		}

		// Für die vierte Spalte
		if (col == 3) {

			new JButton("Bewerben");

		}
		return null;

	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}

//	public Class getColumnClass(int column) {
//	      return getValueAt(0, 3).getClass();
//	   }

}
