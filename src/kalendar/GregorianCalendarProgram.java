package kalendar;

import java.util.GregorianCalendar;

public class GregorianCalendarProgram {

	public static void main(String[] args) {
		GregorianCalendar datum=new GregorianCalendar(2000,2,25); //postavljanje datuma preko konstruktora
		GregorianCalendar danas=new GregorianCalendar();
		
		if(danas.before(datum)) {
			System.out.println("Datume je bio pre danasnjeg dana");
		} else {
			System.out.println("Datum nije pre danasnjeg dana");
		}
		
		datum.set(2007, 9, 12); //postavljanje datuma preko setera
		
		datum.set(GregorianCalendar.YEAR,2020); //postavaljanje pojedinacnih komponenti datuma
		
		//MODIFIKACIJE POVRATNE VREDNOSTI
		
		//GregorianCalendar.DAY_OF_MONTH
		//GregorianCalendar.MONTH
		//GregorianCalendar.YEAR
		//GregorianCalendar.HOUR_OF_DAY
		//GregorianCalendar.MINUTE
		//GregorianCalendar.SECOND
		
		int dan=datum.get(GregorianCalendar.DAY_OF_MONTH);
		int mesec=datum.get(GregorianCalendar.MONTH)+1; //+1 jer vrednosti za mesece pocinju od 0
		int godina=datum.get(GregorianCalendar.YEAR);
		
		System.out.println(datum.getTime());
		System.out.println(dan);
		System.out.println(mesec);
		System.out.println(godina);

	}

}
