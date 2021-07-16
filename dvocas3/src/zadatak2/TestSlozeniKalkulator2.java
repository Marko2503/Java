package zadatak2;

public class TestSlozeniKalkulator2 {

	public static void main(String[] args) {

		int faktorijel;
		faktorijel = SlozeniKalkulator2.faktorijel(5);
		System.out.println("Faktorijel 5 je: "+faktorijel);
		
		int abn = SlozeniKalkulator2.ABN(2, 3, 2);
		System.out.println("(2+3)^2="+abn);
	}

}
