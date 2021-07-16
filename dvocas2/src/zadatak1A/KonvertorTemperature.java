package zadatak1A;

public class KonvertorTemperature {
	
	static final double APSOLUTNA_NULA_C=-273.15;
	static final double APSOLUTNA_NULA_F=-459.67;
	
	double konverujUFarenhajte(double tc) {
		
		if(tc>=APSOLUTNA_NULA_C) {
			double tf=tc*9/5+32;  // return tc*9/5+32
			return tf;
		}
		else {
			System.out.println("GRESKA");
			return -1000;
		}
	}
	
	double konvertujUCelzijuse(double tf) {
		
		if(tf>=APSOLUTNA_NULA_F) {
			return (tf-32)*5/9;
		}
		else {
			System.out.println("GRESKA");
			return -1000;
		}
	}
	
	AgregatnoStanje vratiAgregatnoStanjeVode(double tc) {
		
		if(tc<0) {
			return AgregatnoStanje.CVRSTO;
		}
		else if(tc>=0 && tc<100) {
			return AgregatnoStanje.TECNO;
		}
		else {
			return AgregatnoStanje.GAS;
		}
	}
}
