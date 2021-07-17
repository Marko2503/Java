package zadatak1.biblioteka;

import zadatak1.Knjiga;

public class ProbaBiblioteka {

	public static void main(String[] args) {
		Biblioteka b=new Biblioteka();
		Knjiga k1=new Knjiga();
		Knjiga k2=new Knjiga();
		
		k1.setNaziv("Znakovi pored puta");
		
		try {
			k1.setGodina(1976);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		k2.setNaziv("Mansarda");
		
		try {
			k2.setGodina(1960);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		}
		
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);
		
		b.ispisi();
		
		b.arhivirajKnjige(2010);
		System.out.println("Posle arhiviranja");
		
		b.ispisi();
	}
}
