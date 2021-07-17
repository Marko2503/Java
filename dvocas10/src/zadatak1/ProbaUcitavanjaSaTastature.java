package zadatak1;

import java.io.IOException;

public class ProbaUcitavanjaSaTastature {

	public static void main(String[] args) throws IOException  {
		/*try {
			System.out.print("Unesite neki tekst: ");
			String nekiString=UcitavanjeSaTastature.ucitajIVratiString();
			System.out.println("Uneli ste: " +nekiString);
		} catch (IOException e) {
			System.out.println("Doslo je do greske prilikom ucitavanja sa tastature" +e.getMessage());
		}*/
		
		/*try {
			System.out.print("Unesite neki broj: ");
			double kvadrat=UcitavanjeSaTastature.ucitajBrojIVratiKvadrat();
			System.out.println("Kvadrat unetog broja je: " +kvadrat);
		} catch (NumberFormatException e) {
			System.out.println("Greska!Nije unet validan broj");
			System.out.println(e.getMessage());
		}*/
		
		System.out.print("Unesite broj: ");
		UcitavanjeSaTastature.ucitajBrojIProveriParnost();
	
		System.out.print("Unesite recenicu: ");
		int brojReci=UcitavanjeSaTastature.ucitajRecenicuIVratiBrojReci();
		System.out.println("Recenica ima " +brojReci+ " reci");
		
		System.out.println("Program se normalno zavrsio");
		
	}
}
