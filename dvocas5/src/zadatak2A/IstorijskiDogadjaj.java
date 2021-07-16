package zadatak2A;

import java.util.GregorianCalendar;

public class IstorijskiDogadjaj {
	String naziv;
	GregorianCalendar datum;
	
	IstorijskiDogadjaj(String naziv,int a,int b,int c) {
		if(naziv.length()>=5 && naziv!=null && a!=0 && b!=0 && c!=0) {
			this.naziv=naziv;
			datum=new GregorianCalendar();
			datum.set(a, b-1, c);
		} else {
			System.out.println("GRESKA! Pogresan unos datuma ili naziva");
		}
	}
		
	int vratiPreKoliko() {
		GregorianCalendar danas=new GregorianCalendar();
		
		int trenutnaGodina=danas.get(GregorianCalendar.YEAR);
		
		return trenutnaGodina-datum.get(GregorianCalendar.YEAR);
	}
	
	String vratiNaopako() {
		String naopako="";
		
		for(int i=naziv.length()-1;i>=0;i--) {
			naopako=naopako+naziv.charAt(i);
		}
		
		return naopako;
	}
}
