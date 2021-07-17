package ucitavanjeSaTastature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UcitavanjeProgram {

	public static void main(String[] args) {
		String brojStr="123";
		try {
			int broj=Integer.parseInt(brojStr); //pretvara string u ceo broj
			System.out.println("Broj je: " +broj);
		} catch (NumberFormatException e) {
			System.out.println("GRESKA");
		}
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); 
		
		String ime;
		int godiste;
		
		System.out.print("Unesite ime: ");
		
		try {
			ime=in.readLine(); //omogucava unos sve dok se ne stisne ENTER
			System.out.println("Vase ime je: " +ime);
		} catch (IOException e) {
			System.out.println("GRESKA");
		} 
		
		System.out.println();
		System.out.print("Unesite godiste: ");
		
		try {
			String godisteStr=in.readLine();
			godiste=Integer.parseInt(godisteStr);
			
			System.out.println("Vase godiste je: " +godiste);
		} catch (Exception e) {
			System.out.println("GRESKA");
		}
		
		Scanner sc=new Scanner(System.in);
		
		String nadimak;
		int brojKarte;
		
		System.out.print("Unesite nadimak: ");
		nadimak=sc.nextLine(); //cita uneti tekst sve dok se ne pritine ENTER
		
		System.out.println("Vas nadimak je: " +nadimak);
		
		System.out.println();
		
		try {
			System.out.print("Unesite broj karte: ");
			brojKarte=sc.nextInt(); //cita uneti tekst kao ceo broj
			
			System.out.println("Broj karte je: " +brojKarte);
		} catch (Exception e) {
			System.out.println("GRESKA");
		}
		
		sc.close();
	}

}
