package izlozba;

import java.util.GregorianCalendar;

import eskponati.Eksponat;
import eskponati.slika.Slika;

public class Izlozba {
	private GregorianCalendar datumOtvaranja;
	private Eksponat[] eksponati; //samo slike i fotke
	
	public Izlozba(GregorianCalendar datum) {
		eksponati=new Eksponat[50];
		datumOtvaranja = datum;
	}
	
	public void unesiEksponat(Eksponat novEksponat) {
		if(novEksponat==null) {
			System.out.println("GRESKA");
			return;
		}
		
		for(int i=0;i<eksponati.length;i++) {
			if(eksponati[i]==null) {
				eksponati[i]=novEksponat;
				return;
			}
		}
		
		System.out.println("GRESKA");
	}
	
	public void ispisiSveEksponate(String autor) {
		System.out.println(datumOtvaranja.getTime());
		
		for(int i=0;i<eksponati.length;i++) {
			if(eksponati[i]!=null && eksponati[i].getAutor().equals(autor)) {
				eksponati[i].ispisi();
			}
		}
	}
	
	/*public Eksponat[] (String prezime){
		int brojac=0;
		
		for(int i=0;i<eksponati.length;i++){
			if(eksponati[i].getAutor().endsWith(prezime) && 
					eksponati[i] instanceof Slika &&
					eksponati.) {
				 
			}
		}
	}*/
}
