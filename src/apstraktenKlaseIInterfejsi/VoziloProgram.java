package apstraktenKlaseIInterfejsi;

public class VoziloProgram {

	public static void main(String[] args) {
		Vozilo v1=new Auto("Audi");
		Vozilo v2=new Tenk("T54");
		//Auto a2=new Auto("BMW");
		
		v1.ispis();
		v1.ubrzaj();
		v1.ubrzaj();
		
		System.out.println();
		
		v1.ispis();
		
		System.out.println();
		
		Auto a1=(Auto) v1;
		
		a1.superUbrzanje();
		a1.ispis();
		
		v2.ispis();
		v2.ubrzaj();
		v2.ubrzaj();
		
		System.out.println();
		
		v2.ispis();
		
		System.out.println();
		
		SuperAuto sa1=new Auto("Ferari");
		
		sa1.superUbrzanje();
		
		Auto a2=(Auto) sa1; //kastovanje interfejsa
		
		a2.ubrzaj();
		a2.ispis();
	}
}
