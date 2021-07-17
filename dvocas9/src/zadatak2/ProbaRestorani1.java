package zadatak2;

public class ProbaRestorani1 {

	public static void main(String[] args) {
		Restoran r1=new Restoran();
		Restoran r2=new Restoran();
		Restoran r3=new Restoran();
		
		r1.setNaziv("Blue Hill");
		r1.setOcena(4);
		
		r2.setNaziv("Per Se");
		r2.setOcena(1);
		
		r3.setNaziv("Daniel");
		r3.setOcena(4);
		
		VodicKrozRestorane v=new VodicKrozRestorane();
		
		v.dodajNaPocetak(r1);
		v.dodajNaPocetak(r2);
		v.dodajNaPocetak(r3);
		
		v.ispisiRestoraneSaOcenom(4);
		
		v.obrisiLoseRestorane();
	}
}
