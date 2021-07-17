package klase;

public class Student {
	String ime;
	int index;
	int godinaUpisa;
	int p1=5;
	int p2=5;
	int spa=5; //postavlja kao default vrednost svaki put kada se napravi objekat klase Student
	Smer smer;
	
	String formatirajIndex() {
		String brojIndeksa=index+ "/" +godinaUpisa; //svako string moze da se foramtira na ovaj nacin
		
		return brojIndeksa;
	}
	
	boolean daLiJeBrucos() {
		if(godinaUpisa==2020) {
			return true;
		} else {
			return false;
		}
	}
	
	double prosecnaOcena() {
		double prosek;
		int zbir=p1+p2+spa;
		
		prosek=(double)zbir/3; //promenljiva zbir je samo u ovoj liniji koda tia double
		
		return prosek;
	}
}
