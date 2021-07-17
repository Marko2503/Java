package zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTastature {
	public static String ucitajIVratiString() throws IOException {
		BufferedReader br=new BufferedReader(
						  new InputStreamReader(System.in));
		
		String str=br.readLine(); //citanje jednog reda iz BufferedReader-a
	
		return str;
	}
	
	public static double ucitajBrojIVratiKvadrat() throws IOException {
		BufferedReader br=new BufferedReader(
				  new InputStreamReader(System.in));

		String str=br.readLine();
		
		double broj=Double.parseDouble(str);
		double kvadrat=broj*broj;
		
		return kvadrat;
	}
	
	public static boolean ucitajBrojIProveriParnost() throws IOException {
		BufferedReader br=new BufferedReader(
				  new InputStreamReader(System.in));

		String str=br.readLine();
		
		int broj=Integer.parseInt(str);
		
		if(broj%2==0) {
			System.out.println("Uneti broj je paran");
			return true;
		} else {
			System.out.println("Uneti broj je neparan");
			return false;
		}
	}
	
	public static int ucitajRecenicuIVratiBrojReci() throws IOException {
		BufferedReader br=new BufferedReader(
				  new InputStreamReader(System.in));

		String str=br.readLine();
		
		String[] reci =str.split(" "); //niz stringova
		
		return reci.length;
	}
}
