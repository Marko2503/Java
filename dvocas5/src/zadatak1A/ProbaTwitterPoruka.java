package zadatak1A;

import java.util.GregorianCalendar;

public class ProbaTwitterPoruka {

	public static void main(String[] args) {
		TwitterPoruka poruka=new TwitterPoruka();
		
		poruka.postaviKorisnika("pera121");
		poruka.postaviPoruku("Ovo je #moja prva #poruka");
		
		poruka.ispisi();
		
		int brojHash=poruka.prebrojHash();
		System.out.println("U poruci ima " +brojHash+ " #");
		
		int brojReci=poruka.prebrojReci();
		System.out.println("U poruci ima " +brojReci+ " reci");
		
		GregorianCalendar datum=new GregorianCalendar(2001, 9, 27); //meseci pocinju od 0
		boolean odgovor=poruka.proveriRodjendan(datum);
		
		if(odgovor) { //ako je vrednost promenljive odgovor true
			System.out.println("Tvitovano na rodjendan");
		} else {
			System.out.println("Nije tvitovano na rodjendan");
		}
		
		

	}

}
