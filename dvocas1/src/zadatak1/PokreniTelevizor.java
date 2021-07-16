package zadatak1;

public class PokreniTelevizor {
	
	public static void main(String[] args) {
		Televizor t=new Televizor();
		Televizor t2=new Televizor();
		
		t.ukljuci();
		t.pojacajTon();
		t.promeniProgram(5);
		t.ispisi();
		
		t2.ispisi();
	}

}
