package nizoviObjekata;

import objekti.Razlomak;

public class KlasaNiz {
	Razlomak[] nizRazlomaka;

	public KlasaNiz() {
		nizRazlomaka=new Razlomak[10]; //inicijalizacija niza
	}

	public KlasaNiz(int kapacitet) {
		nizRazlomaka=new Razlomak[kapacitet];
	}
	
	void ispisNiza() {
		int brojPopunjenih=0;
		
		for(int i=0;i<nizRazlomaka.length;i++) {
			if(nizRazlomaka[i]!=null) {
				brojPopunjenih++;
			}
		}
		
		if(brojPopunjenih==0) {
			System.out.println("Niz je prazan");
			return;
		}
		
		System.out.println("Niz je: ");
		
		for(int i=0;i<nizRazlomaka.length;i++) {
			if(nizRazlomaka[i]!=null) { //da se ne bi ispisivao null
				System.out.println(nizRazlomaka[i]);
			}
		}
		
		System.out.println();
	}
	
	public void unesiRazlomak(Razlomak novi) {
		
		for(int i=0;i<nizRazlomaka.length;i++) {
			if(nizRazlomaka[i]==null) {
				nizRazlomaka[i]=novi;
				return; //da bi se popunilo samo prvo slobodno mesto
			}
		}
		
		System.out.println("Niz je pun");
		
	}
	
}
	
	
	
	
	

