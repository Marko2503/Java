package klase;

public class PravougaonikProgram {

	public static void main(String[] args) {
		Pravougaonik p1=new Pravougaonik();
		
		p1.duzina=5;
		p1.sirina=3;
		p1.prikazi();
		
		System.out.println("Povrsina pravugaonika je: " +p1.povrsinaPravougaonika());
	}
}
