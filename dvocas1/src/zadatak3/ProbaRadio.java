package zadatak3;

public class ProbaRadio {
	
	public static void main(String [] args) {
		Radio r=new Radio();
		
		r.ispisi();
		r.ukljuci();
		r.trenutnaFrekvencija=96.9; //r.postaviFrekenciju(96.9);
		r.ispisi();
		r.promeniFrekvencijaNavise();
		r.ispisi();
		r.promeniFrekvencijuNanize();
		r.ispisi();
		r.ukljuci();
		r.ispisi();
		r.iskljuci();
		r.ispisi();
		
		double trenutnaFrekvencija=r.vratiTrenutnuFrekvenciju();
		
		System.out.println("Trenutna frekvencija je: " + trenutnaFrekvencija);
		
		boolean trenutnoUkljucen=r.daLiJeUkljucen();
		
		System.out.println("Radio je trenutno ukljucne: " + trenutnoUkljucen);
	}

}
