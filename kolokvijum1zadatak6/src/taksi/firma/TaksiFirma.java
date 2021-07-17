package taksi.firma;

import java.util.GregorianCalendar;

import taksi.TaksiVozilo;

public class TaksiFirma {
	private TaksiVozilo[] vozila=new TaksiVozilo[1000];
	
	public void unesiTaksistu(TaksiVozilo taksista) {
		if(taksista==null) {
			System.out.println("GRESKA");
			return;
		}
		
		for(int i=vozila.length-1;i>=0;i--) {  
			if(vozila[i]==null) {
				vozila[i]=taksista;
				vozila[i].setBrojPoziva(0);
				break; 
			} 
		}
		
		System.out.println("NEMA MESTA");
	}
	
	public void primiPoziv(int taksiBroj,String ime,String prezime) {
		for(int i=0;i<vozila.length;i++) {
			if(vozila[i]!=null &&
			vozila[i].getId().equals(""+taksiBroj+ " " +ime+ " " +prezime)) {
				
				if(vozila[i].getKrajSmene().before(new GregorianCalendar())) {
					System.out.println("KRAJ SMENE");
				}
				
				int p=vozila[i].getBrojPoziva();
				vozila[i].setBrojPoziva(p+1);
				vozila[i].setSlobodan(false);
				return;
			}
		}
		
		System.out.println("NE POSTOJI"); 
	}
	
	public void uredi() {
		int brojac1=0;
		int brojac2=0;
		TaksiVozilo[] novNiz=new TaksiVozilo[1000];
		
		for(int i=0;i<vozila.length;i++) {
			if(vozila[i].getBrojPoziva()==0) {
				novNiz[brojac1++]=vozila[i];
			} else {
				brojac2=0;
				novNiz[999-brojac2]=vozila[i];
				brojac2++; 
			}
		}
		
		vozila=novNiz;
	}

}
