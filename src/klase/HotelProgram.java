package klase;

public class HotelProgram {

	public static void main(String[] args) {
		System.out.println("Broj hotela je: " +Hotel.brojHotela);
		
		Hotel h1=new Hotel("Metropol", 350);
		
		h1.ispisi();
		
		System.out.println("Broj hotela je: " +Hotel.brojHotela);
	}
}
