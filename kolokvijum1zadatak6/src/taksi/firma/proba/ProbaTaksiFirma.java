package taksi.firma.proba;

import java.util.GregorianCalendar;

import taksi.TaksiVozilo;
import taksi.firma.TaksiFirma;

public class ProbaTaksiFirma {

	public static void main(String[] args) {
		TaksiVozilo tv1=new TaksiVozilo();
		TaksiVozilo tv2=new TaksiVozilo();
		TaksiFirma tf=new TaksiFirma();
		GregorianCalendar datum1=new GregorianCalendar();
		GregorianCalendar dat2=new GregorianCalendar();
		
		tv1.setId("122 Marko Markovic");
		tv1.setBrojPoziva(0);
		tv1.setSlobodan(true);
		
		datum1.set(datum1.get(GregorianCalendar.YEAR), 
				datum1.get(GregorianCalendar.MONTH),
				datum1.get(GregorianCalendar.DAY_OF_MONTH), 
				23, 59, 0);
		
		tv1.setKrajSmene(datum1);
		
		tv2.setId("333 Zika Petrovic");
		tv2.setBrojPoziva(7);
		tv2.setSlobodan(false);
		
		dat2 = new GregorianCalendar();
		dat2.set(dat2.get(GregorianCalendar.YEAR), 
				dat2.get(GregorianCalendar.MONTH),
				dat2.get(GregorianCalendar.DAY_OF_MONTH), 
				22, 22, 0);
		tv2.setKrajSmene(dat2); 
		
		tf.unesiTaksistu(tv2);


	}

}
