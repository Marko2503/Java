package autobuska_stanica.proba;

import java.util.GregorianCalendar;

import autobuska_stanica.AutobuskaStanica;
import autobuska_stanica.Polazak;

public class ProbaAutobuskaStanica {

	public static void main(String[] args) {
		AutobuskaStanica a1=new AutobuskaStanica();
		Polazak p1=new Polazak();
		
		
		p1.setDestinacija("Novi Sad");
		p1.setBrojSlobodnihMesta(55);
		p1.setVreme(new GregorianCalendar(2018, 11, 31, 23, 59, 59));
		
		a1.unesiPolazak(p1);
		System.out.println(p1);
		
		
		
		
	}

}
