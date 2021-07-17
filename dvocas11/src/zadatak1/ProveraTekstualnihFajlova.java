package zadatak1;

import java.io.IOException;

public class ProveraTekstualnihFajlova {

	public static void main(String[] args) {
		try {
			String ucitaniTekst=TekstualniFajlovi.ucitajIVratiTekst("tekst.txt");
			System.out.println(ucitaniTekst);
			
			//TekstualniFajlovi.upisiTekst("mojTekstualniFajlIzJave.txt"); //ako ne postoji kreira se novi, a ako postoji njegov sadrzaj se menja odgovarajucim tekstom
			TekstualniFajlovi.upisiTekst("mojFajl.txt", "Ovo je moj fajl");
			
		} catch (IOException e) {
			System.out.println("Greska! Navedeni fajl ne postoji.Proverite ime fajla i pokusajte ponovo");
			e.printStackTrace();
		}
		
		

	}

}
