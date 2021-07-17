package zadatak1;

public class ProbaUcitavanjaSaTastature2 {

	public static void main(String[] args) {
		//String str=UcitavanjeSaTastature2.ucitajIVratiString();
		//System.out.println("Ucitan je: " +str);
		
		System.out.print("Unesite broj: ");
		double kvadrat=UcitavanjeSaTastature2.ucitajBrojIVratiKvadrat();
		System.out.println("Kvadrat unetog broja je: " +kvadrat);
		
		System.out.print("Unesite broj: ");
		UcitavanjeSaTastature2.ucitajBrojIProveriParnost();
		
	}
}
