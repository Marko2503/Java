package nasledjivanje;

public class Vozilo {
	String ime;
	int brzina;
	
	public Vozilo(String ime, int brzina) {
		super();
		this.ime = ime;
		this.brzina = brzina;
	}

	@Override
	public String toString() {
		return "Ime: " +ime+ "\n" + "Brzina: " +brzina;
	}
	
	
}
