package klase;

public class RazlomakProgram {

	public static void main(String[] args) {
		Razlomak r1=new Razlomak(); //pravi se promenljiva(objekat) tipa razlomak(r1 je pokazivac na Razlomak)
		
		r1.brojilac=2;
		r1.imenilac=5;
		
		System.out.println(r1.brojilac + "/" +r1.imenilac);
	}

}
