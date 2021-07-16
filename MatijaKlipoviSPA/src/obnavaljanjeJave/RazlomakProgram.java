package obnavaljanjeJave;

public class RazlomakProgram {
	public static void main(String[] args) {
		Razlomak r1=new Razlomak(4, 7);
		Razlomak r2=new Razlomak(1, 3);
		
		r1.ispisi(); //metode se pozivaju nad objektom
		r2.ispisi();
		
		r1.povecaj(2);
		
		System.out.print("Posle povacanja: ");
		r1.ispisi();
		
		Razlomak r3=Razlomak.pomnozi(r1, r2); //poziv staticke metode
		
		r3.ispisi();
		
	}

}
