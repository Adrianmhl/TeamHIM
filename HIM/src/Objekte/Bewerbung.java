package Objekte;

public class Bewerbung {
	
	private int id;
	private int prof;
	private int count;
	
	public Bewerbung(int id, int prof, int count) {
		this.id=id;
		this.prof=prof;
		this.count=count;
	}
	
	public int getId() {
		return id;
	}
	public int getProf() {
		return prof;
	}
	public int getCount() {
		return count;
	}
	
}
