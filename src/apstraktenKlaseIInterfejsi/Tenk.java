package apstraktenKlaseIInterfejsi;

public class Tenk extends Vozilo{

	public Tenk(String ime) {
		super(ime);
	}

	@Override
	public void ubrzaj() {
		setBrzina(getBrzina()+1);
	}

	@Override
	public void uspori() {
		setBrzina(getBrzina()-1);		
	}

	@Override
	public void ispis() {
		System.out.println("TENK-Naziv: " +getIme()+ " Brzina: " +getBrzina());
	}
}
