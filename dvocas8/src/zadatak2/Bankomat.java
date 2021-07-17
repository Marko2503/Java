package zadatak2;

public class Bankomat implements AutomatNovcaInterfejs{
	private double stanje=5000.0;
	
	@Override
	public void uloziNovac(double iznosZaUplatu) {
		if(iznosZaUplatu>0) {
			stanje=stanje+iznosZaUplatu;
		} else {
			System.out.println("GRESKA");
		}
	}

	@Override
	public void podigniNovac(double iznosZaPodizanje) {
		if(iznosZaPodizanje>0 && iznosZaPodizanje<=stanje) {
			stanje=stanje-iznosZaPodizanje;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public void ispisiStanje() {
		System.out.println("Na automatu je ostalo " + stanje + " din");
	}
}
