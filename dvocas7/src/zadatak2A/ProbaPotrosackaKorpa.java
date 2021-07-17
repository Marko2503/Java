package zadatak2A;

public class ProbaPotrosackaKorpa {

	public static void main(String[] args) {
		PotrosackaKorpa pk=new PotrosackaKorpa(15);
		Namirnica n1=new Namirnica();
		Namirnica n2=new Namirnica();
		Namirnica n3=new Namirnica();
		
		n1.setNaziv("hleb");
		n1.setCena(50);
		
		n2.setNaziv("mleko");
		n2.setCena(80);
		
		n3.setNaziv("cokolada");
		n3.setCena(100);
		
		pk.dodajUKorpu(n1);
		pk.dodajUKorpu(n2);
		pk.dodajUKorpu(n3);
		
		System.out.println("Ukupna cena je: " + pk.izracunajUkupnuCenu() + " din");
		
		Namirnica najskuplja=pk.pronadjiNajskuplju(); 
		
		System.out.println("Najskuplja namirnica je: " + najskuplja.getNaziv());

	}

}
