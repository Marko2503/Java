package liste;

import java.util.List;

public class Student {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (godiste != other.godiste) {
			return false;
		}
		if (ime == null) {
			if (other.ime != null) {
				return false;
			}
		} else if (!ime.equals(other.ime)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student:ime: " + ime + ", godiste: " + godiste;
	}
	
	public static void ispisListe(List<Student> studenti) {
		if(studenti.isEmpty()) { //provera da li je lista prazna
			System.out.println("Lista je prazna");
			return;
		}
		
		System.out.println("Lista je: ");
		
		for (Student s : studenti) { 
			System.out.println(" " +s);
		}
	}
}
