package zadatak2;

import java.io.IOException;

public class ProveraBazaOsoba {

	public static void main(String[] args) {
		Osoba o1=new Osoba("Marko","Markovic");
		Osoba o2=new Osoba("Pera","Peric");
		BazaOsoba b=new BazaOsoba();
		
		b.dodajOsobu(o1);
		b.dodajOsobu(o2);
		
		try {
			b.sacuvajUFajl("osobe.db");
			b.ucitajIzFajla("osobe.db");
			System.out.println(b.getOsobe());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
