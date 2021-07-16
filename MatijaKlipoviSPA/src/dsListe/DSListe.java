package dsListe;

public class DSListe {
	DSCvor prvi; //pokazivac na prvi cvor u listi
	
	public DSListe() { //genericki konstruktor
		
	}
	
	public DSListe(int... niz){
		for(int i=0;i<niz.length;i++) {
			ubaciNaKraj(niz[i]);
		}
	}
	
	public void ispisListe() {
		if(prvi==null) {
			System.out.println("Lista je prazna");
			return;
		}
		
		DSCvor pom=prvi;
		
		System.out.print("Vasa lista je: ");
		
		while(pom!=null) {
			System.out.print(pom.podatak+ " ");
			pom=pom.sledeci;
		}
		
		System.out.println();
	}
	
	public void ispisListeUNazad() { //neophodna povera za ispravnost DSListe
		if(prvi==null) {
			System.out.println("Lista je prazna");
			return;
		}
		
		DSCvor pom=prvi;
		
		while(pom.sledeci!=null) { //zaustavlja se na poslednjem elementu liste
			pom=pom.sledeci;
		}
		
		System.out.print("Lista ispisana u nazad: ");
		
		while(pom!=null) { //za prolazak od kraja do pocetka liste
			System.out.print(pom.podatak+ " ");
			pom=pom.prethodni;
		}
		
		System.out.println();
	}
	
	public void ubaciNaPocetak(int noviBroj) {
		DSCvor novi=new DSCvor();
		
		novi.podatak=noviBroj;
		
		novi.sledeci=prvi; //povezuje novi cvor sa prvim u listi
		
		if (prvi!=null) { //ako lista nije prazna
			prvi.prethodni = novi; //povezuje prethodni sa novim cvorom(povezivanje u nazad)
		}
		
		prvi=novi; //prvi cvor u listi postaje novi dodati cvor
	}
	
	public void ubaciNaKraj(int noviBroj) {
		DSCvor novi=new DSCvor();
		DSCvor pom=prvi;
		
		novi.podatak=noviBroj;
		
		if(prvi==null) { //ako je lista prazna
			prvi=novi;
			return;
		}
		
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		
		pom.sledeci=novi; //povezivanje poslednjeg sa novim cvorom liste
		novi.prethodni=pom; //povezuje novi i poslednji cvor(povezivanje u nazad)
		//novi.sledeci=null;--->moze i bez ovoga
	}
	
	public void izbaciSve(int broj) {
		if(prvi==null) { //ako je lista prazna
			System.out.println("GRESKA!!!Lista je prazna");
			return;
		}
		
		//izbacivaje sa pocetka
		while(prvi.podatak==broj) {
			prvi=prvi.sledeci; //izbacivanje prvog elementa
			
			if(prvi==null) { //ako su svi elementi liste broj koji treba da se izbaci
				return;
			}
			
			prvi.prethodni=null; 
		}
		
		//izbacivanje iz sredine i sa kraja
		DSCvor pom=prvi; 
		
		while(pom.sledeci!=null) {
			if(pom.sledeci.podatak==broj) {
				pom.sledeci=pom.sledeci.sledeci; //povezivanje u napred
				if(pom.sledeci!=null) { //ako je broj koji se izbacuje na poslednjem mestu
					pom.sledeci.prethodni=pom; //povezivanje u nazad
				}
			} else { //ako su brojevi koji se izbacuju jedan do drugog u listi
				pom=pom.sledeci;
			}
		}
	}

}
