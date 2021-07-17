package tekstualneDatoteke;
import java.io.BufferedReader;
import java.io.FileReader;

public class TekstualneDatotekeCitanje {
	public static void procitaj(String imeDatoteke) {
		try (FileReader fr=new FileReader(imeDatoteke); // try with recourses osigurava zatvaranje toka podataka iako dodje do greska
			 BufferedReader br=new BufferedReader(fr)) {
			
			String tekst="";
			String red;
			
			while(true) {
				
				red=br.readLine(); //cita red po red iz datoteke
				
				if(red==null) { // dok se ne dodje do kraja fajla
					break;
				}
				
				tekst=tekst+red+"\n"; // \n da se tekst ne bi spojio
			}
			
			System.out.println(tekst);
			
		} catch (Exception e) {
			System.out.println("GRESKA");
		}
	}
}
