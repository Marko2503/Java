package restoran.proba;

import java.util.GregorianCalendar;

import restoran.Restoran;
import restoran.vodic.VodicKrozRestorane;
import restoran.vrsta.VrstaHrane;

public class ProbaVodicKrozRestorane {

	public static void main(String[] args) {
		VodicKrozRestorane vodic1=new VodicKrozRestorane(4);
		Restoran r1=new Restoran();
		Restoran r2=new Restoran();
		
		r1.setNaziv("Makao");
		r1.setHrana(VrstaHrane.KINESKA);
		r1.setOcena(5);
		r1.setDatumProcene(new GregorianCalendar(2012, 9, 26));
		
		r2.setNaziv("Kuhinja");
		r2.setHrana(VrstaHrane.DOMACA);
		r2.setOcena(4);
		r2.setDatumProcene(new GregorianCalendar(2017, 10, 1));
		
		vodic1.unesiRestoran(r1);
		vodic1.unesiRestoran(r2);
		
		System.out.println(r1);
		System.out.println(r2);
	}

}
