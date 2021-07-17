package nasledjivanje;

public class Auto extends Vozilo {
	String boja;

	public Auto(String ime, int brzina,String boja) {
		super(ime, brzina);
		this.boja=boja;
	}

	@Override
	public String toString() {
		return "\n" +super.toString()+ "\n" + "Boja: " +boja;
	}

	/*@Override
	void ispis() {
		System.out.println();
		super.ispis();
		System.out.println("Boja: " +boja);
		System.out.println();
	}
	
	void ispis2() {
		System.out.println("Ova metoda poziva metodu 1");
		
		ispis(); //metoda ispis iz klase Auto
		super.ispis(); //metoda ispis iz klase Vozilo
	}*/
	
	
}
