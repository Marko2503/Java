package binarneDatoteke;

import java.io.Serializable;

public class Student implements Serializable {
	private String ime;
	private int godiste;
	
	public Student(String ime, int godiste) {
		this.ime = ime;
		this.godiste = godiste;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	
	@Override
	public String toString() {
		return ime+ " " +godiste;
	}
	
	
	
	
}
