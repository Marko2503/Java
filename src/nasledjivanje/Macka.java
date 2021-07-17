package nasledjivanje;

public class Macka extends Zivotinja {

	public Macka(String ime) {
		super(ime);
	}

	@Override
	void reciNesto() {
		System.out.println("Mjau");
	}
	
	void predi() {
		System.out.println("Prrrr");
	}
	
	
	
	

}
