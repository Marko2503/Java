package zadatak1A;

public class ProbaKonvertoraTemperature {
	
	public static void main(String [] args) {
		/*System.out.println(KonvertorTemperature.APSOLUTNA_NULA_C);
		System.out.println(KonvertorTemperature.APSOLUTNA_NULA_F);
		
		System.out.println(AgregatnoStanje.GAS);*/
		
		KonvertorTemperature kt=new KonvertorTemperature();
		
		double tc=12;
		
		double tf=kt.konverujUFarenhajte(tc);
		
		System.out.println("Temperatura je " + tc + " Celzijusa" );
		System.out.println("Temperatura je " + tf + " Farenhajta");
		
		System.out.println("Agregatno stanje vode na temperaturi " + tc+ " je " +kt.vratiAgregatnoStanjeVode(tc));
		
		
	}

	
}
