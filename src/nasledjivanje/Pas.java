package nasledjivanje;

public class Pas extends Zivotinja {

	public Pas(String ime) {
		super(ime);
	}

	@Override
	void reciNesto() {
		System.out.println("Av av");
	}
	
	void donesi() {
		System.out.println("Donesi stap");
	}
	
	
	

}
