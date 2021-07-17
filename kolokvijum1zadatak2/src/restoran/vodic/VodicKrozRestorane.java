package restoran.vodic;

import java.util.GregorianCalendar;

import restoran.Restoran;
import restoran.vrsta.VrstaHrane;

public class VodicKrozRestorane {
	private Restoran[] restorani;

	public VodicKrozRestorane(int kapacitet) {
		if(kapacitet>0) {
			restorani=new Restoran[kapacitet];
		} else {
			restorani=new Restoran[20];
		}
	}
	
	public void unesiRestoran(Restoran noviRestoran) {
		if(noviRestoran==null) {
			System.out.println("GRESKA");
			return;
		}
		
		for(int i=0;i<restorani.length;i++) {
			if(restorani[i]==null) {
				restorani[i]=noviRestoran;
				return;
			}
		}
		
		System.out.println("GRESKA");
	}
	
	//int godina=GregorianCalendar.YEAR;
	
	public void napraviTopListu(VrstaHrane hrana,int godina) {
		for(int i=0;i<restorani.length;i++) {
			if(restorani[i].getHrana()==hrana && restorani[i].getOcena()==5 //obrati paznju na kalendar 
					&& restorani[i].getDatumProcene().get(GregorianCalendar.YEAR)==godina) {
				System.out.println(restorani[i]);
			}
		}
	}
	
	public Restoran[] napraviTopListu(VrstaHrane hrana) {
		Restoran[] topLista=new Restoran[10];
		
		int godina=new GregorianCalendar().get(GregorianCalendar.YEAR); //zapamti
		int brojac=0;
		
		for(int i=0;i<restorani.length;i++) {
			if(restorani[i]==null && restorani[i].getOcena()==5
				&&	restorani[i].getHrana()==hrana && restorani[i].getDatumProcene().get(GregorianCalendar.YEAR)==godina
				&& brojac<10) {
				
				restorani[brojac++]=restorani[i];
			}
		}
		
		for(int i=0;i<restorani.length;i++) {
			if(restorani[i]==null && restorani[i].getOcena()==4
				&&	restorani[i].getHrana()==hrana && restorani[i].getDatumProcene().get(GregorianCalendar.YEAR)==godina
				&& brojac<10) {
				
				restorani[brojac++]=restorani[i];
			}
		}
		
		return topLista;
	}
	
}	

	
	


