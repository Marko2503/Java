package zadatak1.poslovna_logika;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TekstDemo {
	public String ucitajTekst(String imeFajla) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(imeFajla));
		String red="";
		String tekst="";
		
		while(red!=null) {
			red=br.readLine();
			
			if(red!=null) {
				tekst=tekst+red+"\r\n";
			}
		}
		
		br.close();
		
		return tekst;
	}
	
	public void upisiTekst(String nazivFajla,String tekst) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter(nazivFajla));
		
		pw.write(tekst);
		pw.close();
	}

}
