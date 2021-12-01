package Swing;

import javax.swing.table.AbstractTableModel;

public class ProfTableModel extends AbstractTableModel{

	@Override
	public int getRowCount() {
		//Hier sollte die Anzahl der Studenten
		//welche von dem Betreuer betreut werden zurückgegeben werden
		return 3;
	}

	@Override
	public int getColumnCount() {
		
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//Für die erste Spalte
		if (rowIndex==0) {
			//for schleife zur belegung der Reihen
			//ruft die elemente aus dem Array/List betreuteStudenten
		}
		
		//Für die zweite Spalte
		if (rowIndex==1) {
			//for schleife zur belegung der Reihen
			//ruft die elemente aus dem Array/List betreuteStudenten.getCompany()
		}
		
		//Für die dritte Spalte
		if (rowIndex==2) {
			//for schleife zur belegung der Reihen
			//ruft die elemente aus dem Array/List betreuteStudenten 
		}
		
		//Für die vierte Spalte
		if (rowIndex==3) {}
		
		//Für die fünfte Spalte
		if (rowIndex==4) {
			//Buttons zum Bewerben
		}
		
		return null;
	}

}
