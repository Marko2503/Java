package zadatak1;

import zadatak1.finansije.ObracunPlataInterfejs;
import zadatak1.finansije.Racunovodstvo;

public class ProbaZaposleni {

	public static void main(String[] args) {
		Zaposleni zaposleni1=new PogonskiRadnik();  //zaposelni 1 i zaposleni 2 su reference tipa zaposleni
		Zaposleni zaposleni2=new Komercijalista();  //zaposleni da ne bi zavisili od vrste radnika
	// ne moze->Zaposleni zaposleni3=new Zaposleni(); 
				
		zaposleni1.setSatnica(450);
		zaposleni2.setSatnica(450);
		
		System.out.println("Plata radnika: " +zaposleni1.izracunajPlatu(176));
		System.out.println("Plata komercijaliste: " +zaposleni2.izracunajPlatu(176));
		
		//Zaposleni[] zaposleniNiz= {zaposleni1,zaposleni2}; //kreiranje niza
		Zaposleni[] zaposleniNiz=new Zaposleni[2];
		zaposleniNiz[0]=zaposleni1;
		zaposleniNiz[1]=zaposleni2;
		 
		ObracunPlataInterfejs obracunPlata=new Racunovodstvo();
		
		Racunovodstvo racunovodtvo=(Racunovodstvo) obracunPlata; //kastovanje
		racunovodtvo.setStanje(1000000);
		
		obracunPlata.isplatiPlate(zaposleniNiz, 176);
		System.out.println("Stanje: " +racunovodtvo.getStanje());;
	}

}
