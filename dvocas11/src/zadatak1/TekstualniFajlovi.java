package zadatak1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TekstualniFajlovi {
	public static String ucitajIVratiTekst(String nazivFajla) throws IOException { //citanje iz fajlova
		BufferedReader br=new BufferedReader(
						new FileReader(
						new File(nazivFajla)));
		
		String tekst="",red;
		StringBuilder sb=new StringBuilder();
		
		do {
			red=br.readLine(); //cita karktere u jednom redu teksta
			
			if(red!=null) {
				//tekst=tekst + "\r\n" + red; //dodaje novi red (moze i System.lineSeparator())
				sb.append(red).append(System.lineSeparator());
			}
		} while(red!=null);
		
		br.close();
		
		return sb.toString(); //return tekst
	}
	
	public static void upisiTekst(String nazivFajla,String tekst) throws IOException {
		PrintWriter pw=new PrintWriter(
					new FileWriter(
					new File(nazivFajla)));
		
		pw.println(tekst);
		//pw.println("Danas je lep dan");
		//pw.println("Mozda ce temperatura biti iznad nule");
		pw.close(); //zatvara tok podataka
	}
}
