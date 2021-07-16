package zadatak1A;

import java.util.GregorianCalendar; // ubacivanje nepostojecih klasa

public class TwitterPoruka {
	String korisnik="nepoznato"; //string konstanta new String("nepoznato")
	String poruka="nepoznato";
	
	GregorianCalendar datum=new GregorianCalendar();
	
	void postaviKorisnika(String korisnik) {
		if(korisnik!=null && !korisnik.equals("nepoznato")) {
			this.korisnik=korisnik; // postavlja atribut korisnik na unetu vrednost
		} else {
			System.out.println("GRESKA");
		}
	}
	
	void postaviPoruku(String poruka) {
		if(poruka!=null && poruka.length()<140 && !poruka.isEmpty()) { // " "->prazan string
			this.poruka=poruka;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	int prebrojHash() {
		int brojac=0;
		
		for(int i=0;i<poruka.length();i++) {
			if(poruka.charAt(i)=='#') {
				brojac++;
			}
		}
		
		return brojac;
	}
	
	int prebrojReci() { // moze i preko for petlje kao u prethodnoj metodi
		String [] reci=poruka.split(" ");
		
		return reci.length;
	}
	
	void ispisi() {
		System.out.println("Korisnik: " +korisnik);
		System.out.println("Poruka: " +poruka);
		System.out.println("Vreme poruke: " +datum.getTime());
	}
	
	boolean proveriRodjendan(GregorianCalendar rodjendan) { // nije potrebno proveravati da li se i godina pokalpa
		if(rodjendan!=null && rodjendan.before(new GregorianCalendar())){
			int rodjMesec=rodjendan.get(GregorianCalendar.MONTH);  // metoda get vraca komponentu datuma
			int rodjDan=rodjendan.get(GregorianCalendar.DAY_OF_MONTH);
			
			if(datum.get(GregorianCalendar.MONTH)==rodjMesec && datum.get(GregorianCalendar.DAY_OF_MONTH)==rodjDan) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
