package zadatak1;

public class ProbaKnjiga {

	public static void main(String[] args) {
		Knjiga k1=new Knjiga();
		
		k1.setNaziv("Hobit");
		
		try {
			k1.setGodina(2020);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //ispisuje podatke o izuzetku
		}
		
		//System.out.println(k1.getNaziv().length());

	}

}
