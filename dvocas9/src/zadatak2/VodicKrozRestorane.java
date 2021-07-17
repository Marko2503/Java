package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class VodicKrozRestorane {
	private List<Restoran> restorani;

	public VodicKrozRestorane() {
		restorani=new ArrayList<>();
	}
	
	public void dodajNaPocetak(Restoran noviRestoran) {
		restorani.add(0, noviRestoran); //ubacivanje na pocetak liste
	}
	
	public void ispisiRestoraneSaOcenom(int ocena) {
		for(Restoran restoran:restorani) {
			if(restoran.getOcena()==ocena) {
				System.out.println(restoran.getNaziv());
			}
		}
	}
	
	public void obrisiLoseRestorane() {
		int i=0;
		
		while(restorani.size()>i) {
			Restoran tekuciRestoran=restorani.get(i);
			
			if(tekuciRestoran.getOcena()==1) {
				restorani.remove(tekuciRestoran);
			} else {
				i++;
			}
		}
	}
}
