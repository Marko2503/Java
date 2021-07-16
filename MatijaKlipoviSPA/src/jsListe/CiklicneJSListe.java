package jsListe;

public class CiklicneJSListe {
	Cvor prvi;
	
	public CiklicneJSListe() { //genericki konstruktor
		
	}
	
	public CiklicneJSListe(int... niz) {
		for(int i=0;i<niz.length;i++) {
			ubaciNaKraj(niz[i]);
		}
	}
	
	public void ispisListe() {
		if(prvi==null) {
			System.out.println("Lista je prazna");
			return;
		}
		
		Cvor pom=prvi;
		
		System.out.print("Vasa lista je: ");
		
		do {
			System.out.print(pom.podatak+ " ");
			pom=pom.sledeci;
		} while(pom!=prvi); //jer je pom na pocetku isti kao prvi element(moze i while petlja sa dve linije koda iz petlje pre nje)
		
		System.out.println();
		
		//pom.sledeci!=prvi--->zaustavljanje na poslednjem cvoru
		
		//System.out.print("Vrednost pom posle petlje: " +pom.podatak);
	}
	
	public void ubaciNaPocetak(int noviBroj) {
		Cvor pom=prvi;
		Cvor novi=new Cvor();
		
		novi.podatak=noviBroj;
		
		if(prvi==null) { //ako je lista prazna
			prvi=novi;
			novi.sledeci=novi; //ako lista ima jedan element
			return;
		}
		
		do {
			pom=pom.sledeci;
		} while(pom.sledeci!=prvi);
		
		novi.sledeci=prvi; //povezivanje novog cvora sa prvim u listi
		pom.sledeci=novi; //povezivajne poslednjeg sa novim cvorom
		prvi=novi; //postavljanje novog cvora na prvi
	}
	
	public void ubaciNaKraj(int noviBroj) {
		Cvor pom=prvi;
		Cvor novi=new Cvor();
		
		novi.podatak=noviBroj;
		
		if(prvi==null) { //ako je lista prazna
			prvi=novi;
			novi.sledeci=novi;
			return;
		}
		
		do {
			pom=pom.sledeci;
		} while(pom.sledeci!=prvi);
		
		pom.sledeci=novi; //povezivanje poslednjeg sa novim cvorom
		novi.sledeci=prvi; //povezivanje novog sa prvim cvorom
	}
}
