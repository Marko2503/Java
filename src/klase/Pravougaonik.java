package klase;

public class Pravougaonik {
	int sirina;
	int duzina;
	
	void prikazi() {
		System.out.println(sirina + "x" +duzina);
	}
	
	int povrsinaPravougaonika() {
		int povrsina;
		povrsina=duzina*sirina;
		return povrsina;
	}

}
