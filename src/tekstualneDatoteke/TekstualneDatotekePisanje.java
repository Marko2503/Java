package tekstualneDatoteke;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TekstualneDatotekePisanje {
	public static void upisi(String imeDatoteke)  {
		try (FileWriter fw=new FileWriter(imeDatoteke);
			 BufferedWriter bw=new BufferedWriter(fw);	
			 PrintWriter pw=new PrintWriter(bw)){
			
			pw.println("Hello world");
			
			System.out.println("Uspesno upisivanje");
			
		} catch (IOException e) {
			System.out.println("GRESKA");
		}
	}
}
