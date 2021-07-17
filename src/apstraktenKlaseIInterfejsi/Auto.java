package apstraktenKlaseIInterfejsi;

public class Auto extends Vozilo implements SuperAuto {

	public Auto(String ime) {
		super(ime);
	}

	@Override
	public void ubrzaj() {
		setBrzina(getBrzina()+10);
	}

	@Override
	public void uspori() {
		setBrzina(getBrzina()-10);
	}

	@Override
	public void ispis() {
		System.out.println("Naziv: " +getIme()+ " Brzina: " +getBrzina());
	}

	@Override
	public void superUbrzanje() {
		setBrzina(getBrzina()+100);
		
	}

	@Override
	public void stop() {
		setBrzina(0);
	}
}
