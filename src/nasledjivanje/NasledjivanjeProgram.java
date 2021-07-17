package nasledjivanje;

public class NasledjivanjeProgram {

	public static void main(String[] args) {
		Vozilo v1=new Vozilo("bicikl",80);
		Auto a1=new Auto("audi",150,"crvena");
		
		System.out.println(v1);
		System.out.println(a1);
		//a1.ispis();
		//a1.ispis2();
	}
}
