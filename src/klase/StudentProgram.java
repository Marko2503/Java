package klase;

public class StudentProgram {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.index=211;
		s1.godinaUpisa=2019;
		s1.formatirajIndex();
		s1.smer=Smer.ISIT;
		System.out.println("Broj indeksa je: " +s1.formatirajIndex());
		
		if(s1.smer==Smer.MENADZMENT) {
			System.out.println("Uneti student je na menadzmentu");
		} else {
			System.out.println("Uneti student je na ISIT-u");
		}
		
		if(s1.daLiJeBrucos()) { //if(true)
			System.out.println("Uneti student je brucos");
		} else {
			System.out.println("Uneti student nije brucos");
		}
		
		s1.p1=8;
		s1.p2=9;
		s1.spa=7;
		
		System.out.println("Prosecna ocena je: " +s1.prosecnaOcena());
	}

}
