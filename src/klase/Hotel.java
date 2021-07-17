package klase;

public class Hotel {
	String ime;
	int brojSoba;
	static int brojHotela;
		
	public Hotel(String novoIme,int noviBrojSoba) {
		ime=novoIme;
		brojSoba=noviBrojSoba;
		brojHotela++;
	}
	
	void ispisi() {
		System.out.println("Hotel " +ime+ " ima " +brojSoba+ " soba");
	}

}
