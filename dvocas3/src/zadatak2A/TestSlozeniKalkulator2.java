package zadatak2A;

public class TestSlozeniKalkulator2 {

	public static void main(String[] args) {
		SlozeniKalkulator2 kalkulator2=new SlozeniKalkulator2();
		
		//kalkulator2.ispisi55Do0();
		
		int faktorijel=SlozeniKalkulator2.faktorijel(6);
		System.out.println("Faktorijel unteog broja je: " +faktorijel );
		
		int stepen=SlozeniKalkulator2.ABN(2, 3, 3);
		System.out.println("Vrednost stepena zbira je: " +stepen);
	}

}
