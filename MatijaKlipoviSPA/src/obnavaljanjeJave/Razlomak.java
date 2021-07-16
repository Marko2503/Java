package obnavaljanjeJave;

public class Razlomak {
	int brojilac;
	int imenilac;
	
	public Razlomak(int brojilac, int imenilac) { //konstuktor
		super();
		this.brojilac = brojilac;
		this.imenilac = imenilac;
	}
	
	public void ispisi() {
		System.out.println("Razlomak je " +brojilac+ "/" +imenilac);
	}
	
	public void povecaj(int a) {
		brojilac=brojilac+a;
		imenilac=imenilac+a;
	}
	
	public static Razlomak pomnozi(Razlomak r1,Razlomak r2) {
		Razlomak r3=new Razlomak(r1.brojilac*r2.brojilac, r1.imenilac*r2.imenilac);
		
		return r3;
	}
	
	

}
