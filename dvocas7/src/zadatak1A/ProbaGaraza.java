package zadatak1A;

public class ProbaGaraza {

	public static void main(String[] args) {
		Vozilo a1=new Vozilo();
		Vozilo a2=new Vozilo();
		
		a1.setRegistarskiBroj("BG123-AB");
		System.out.println(a1); //kada se dobije objekat klase object ide preko metode toString(moze i a1.toString())
		
		a2.setRegistarskiBroj("NS456-CD");
		System.out.println(a2);
		
		Garaza g=new Garaza(10);
		
		g.uvedi(a1);
		g.uvedi(a2);
		g.ispisi();
		
		System.out.println("----------------------");
		
		g.izvedi(a1);
		g.ispisi();
	}
}
