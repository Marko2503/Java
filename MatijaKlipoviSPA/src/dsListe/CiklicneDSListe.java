package dsListe;

public class CiklicneDSListe {
	DSCvor prvi; //pokazivac na prvi cvor u listi
	
	public void ispisListe() {
		if(prvi==null) { //ako je prazna
			System.out.println("Lista je prazna");
			return;
		}
		
		DSCvor pom=prvi;
		
		System.out.print("Vasa lista je: ");
		
		do {
			System.out.print(pom.podatak+ " ");
			pom=pom.sledeci;
		} while(pom!=prvi);
		
		System.out.println();
	}
	
	public void ubaciNaPocetak(int noviBroj) {
		DSCvor pom=prvi;
		DSCvor novi=new DSCvor();
		
		novi.podatak=noviBroj;
		
		if(prvi==null) { //ako je lista prazna
			prvi=novi;
			novi.sledeci=novi; //pokazuje na sebe u napred
			novi.prethodni=novi; //pokazuje na sebe u nazad
			return;
		}
		
		novi.sledeci=prvi; //povrzuje novi sa prvim cvorom u listi
		
		do {
			pom=pom.sledeci;
		} while(pom.sledeci!=prvi); //zaustavlja se na poslednjem elementu liste
		
		pom.sledeci=novi; //povezuje poslednji sa novim cvorom u napred
		novi.prethodni=pom; //povezuje novi sa poseldnjim cvorom u naad
		prvi=novi; //novi cvor postaje prvi u listi
		
		
		/*DSCvor polednji=prvi.prethodni;--->dolazak do poslednjeg cvora DS liste
		
		novi.sledeci=prvi;
		prvi.prethodni=novi;
		
		polednji.sledeci=novi;
		novi.prethodni=polednji;
		
		prvi=novi;*/
	}

}
