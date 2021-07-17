package zadatak1.finansije;

import zadatak1.Zaposleni;

public class Racunovodstvo implements ObracunPlataInterfejs {
	private double stanje;
	
	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	@Override
	public void isplatiPlate(Zaposleni[] zaposleni, int brojSati) {
		double ukupnoPlata=0;
		
		for(Zaposleni zap: zaposleni) { //for each petlja(za prolazak kroz niz)
			ukupnoPlata+=zap.izracunajPlatu(brojSati);
		}
		
		if(stanje>ukupnoPlata) {
			stanje=stanje-ukupnoPlata;
		} else {
			System.out.println("Nema dovoljno novca na racunu");
		}
	}
}
