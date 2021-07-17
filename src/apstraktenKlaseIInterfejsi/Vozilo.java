package apstraktenKlaseIInterfejsi;

public abstract class Vozilo {
	private String ime;
	private int brzina=0;
	
	public Vozilo(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}
	
	public abstract void ubrzaj();
	
	public abstract void uspori();
	
	public abstract void ispis();
}
