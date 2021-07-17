package zadatak1;

import java.util.Scanner;

public class UcitavanjeSaTastature2 {
	public static String ucitajIVratiString() {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		
		return str;
	}
	
	public static double ucitajBrojIVratiKvadrat() {
		Scanner scanner=new Scanner(System.in);
		double broj=scanner.nextDouble();
		
		return broj*broj;
	}
	
	public static boolean ucitajBrojIProveriParnost() {
		Scanner scanner=new Scanner(System.in);
		int broj=scanner.nextInt();
		
		if(broj%2==0) {
			System.out.println("Uneti broj je paran");
			return true;
		} else {
			System.out.println("Uneti broj je neparan");
			return false;
		}
	}

}
