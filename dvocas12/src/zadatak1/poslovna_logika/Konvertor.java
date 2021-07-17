package zadatak1.poslovna_logika;

public class Konvertor {
	public double konvertujDinareUEvre(double iznosUDinarima,String vrstaKursa) {
		if(vrstaKursa.equals("Kupovni")) {
			return iznosUDinarima/126;
		} else {
			return iznosUDinarima/120;
		}
	}
	
	public double konvertujEvreUDinare(double iznosUEvrima,String vrstaKursa) {
		if(vrstaKursa.equals("Kupovni")) {
			return iznosUEvrima*126;
		} else {
			return iznosUEvrima*120;
		}
	}

}
