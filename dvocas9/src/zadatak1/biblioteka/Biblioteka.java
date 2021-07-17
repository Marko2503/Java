package zadatak1.biblioteka;

import java.util.List;

import zadatak1.Knjiga;

import java.util.LinkedList;

public class Biblioteka {
	private List<Knjiga> knjige=new LinkedList<>();
	
	public void dodajKnjigu(Knjiga novaKnjiga) {
		knjige.add(novaKnjiga); //ubacivanje novog objekta na kraj liste
	}
	
	public boolean daLiPostoji(Knjiga nekaKnjiga) {
		return knjige.contains(nekaKnjiga); //provera da li objekat postoji u listi
	}
	
	public void obrisiKnjigu(Knjiga nekaKnjiga) {
		if(daLiPostoji(nekaKnjiga)) {
			knjige.remove(nekaKnjiga);
		} else {
			System.out.println("Uneti objekat ne postoji u listi");
		}
	}
	
	public List<Knjiga> pretraziKnjige(String kljucnaRec) {
		List<Knjiga> rezultatiPretrage=new LinkedList<>();
		
		for(Knjiga knjiga:knjige) {
			if(knjiga.getNaziv().toLowerCase().startsWith(kljucnaRec.toLowerCase())) {
				rezultatiPretrage.add(knjiga);
			}
		}
		
		return rezultatiPretrage;
	}
	
	public void arhivirajKnjige(int godina) {
		int i=0;
		
		while(i<knjige.size()) { //mora while zbog promene velicine liste
			Knjiga tekucaKnjiga=knjige.get(i);
			
			if(tekucaKnjiga.getGodina()<=godina) {
				knjige.remove(tekucaKnjiga);
			} else {
				i++;
			}
		}
	}
	
	public void ispisi() {
		for(Knjiga knjiga:knjige) {
			System.out.println(knjiga);
			
		}
	}
}
