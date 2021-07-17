package zadatak1;

public class Komercijalista extends Zaposleni {
	private double bonus=50000;
	
	@Override
	public double izracunajPlatu(int brojSati) {
		double plata=brojSati*satnica+bonus;
		return plata;
	}

}
