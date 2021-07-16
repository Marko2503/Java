package jsListe;

public class JSListe {
	Cvor prvi; //pokazivac na prvi cvor liste
	
	public JSListe() { //konsturktor bez parametara
		
	}
	
	public JSListe(int... niz) { //slanje vise elemenata istovremeno
		for(int i=0;i<niz.length;i++) {
			ubaciNaKraj(niz[i]);
		}
	}
	
	void ispisListe() {
		Cvor pom=prvi; //pomocni pokazivac za prolazak kroz listu i njen ispis
		
		if(pom==null) {
			System.out.println("Lista je prazna");
			return;
		}
		
		System.out.print("Vasa lista je: ");
		
		while (pom!=null) { //ispis liste
			System.out.print(pom.podatak+ " ");
			pom = pom.sledeci; //upisivanje adrese sledeceg cvora liste u pom(pomera pom kroz listu)
		}
		
		System.out.println();
	}
	
	void ubaciNaPocetak(int noviBroj) { //radi i za praznu listu
		Cvor noviCvor=new Cvor();
		
		noviCvor.podatak=noviBroj;
		noviCvor.sledeci=prvi;
		prvi=noviCvor;
	}
	
	void ubaciNaKraj(int noviBroj) {
		Cvor noviCvor=new Cvor();
		
		noviCvor.podatak=noviBroj;
		noviCvor.sledeci=null; //nije potrebno jer je NULL podrazumevana vrednost pokazivaca
		
		if(prvi==null) { //ako je lista prazna
			prvi=noviCvor;
			return;
		}
		
		Cvor pom=prvi;
		
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		
		pom.sledeci=noviCvor;
	}
	
	int izbaciSaPocetka() {
		if(prvi==null) {
			throw new RuntimeException("GRESKA!!!Lista je prazna");
		}
		
		int izbacen=prvi.podatak;
		
		prvi=prvi.sledeci;
		
		return izbacen;
	}
	
	int izbaciSaKraja() {
		if(prvi==null) { //ako je lista prazna
			throw new RuntimeException("GRESKA!!!Lista je prazna");
		}
		
		
		if(prvi.sledeci==null) { //ako lista ima jedan element
			int izbacen=prvi.podatak;
			
			prvi=null;
			
			return izbacen;
		}
		
		Cvor pom;
		
		pom=prvi;
		
		while(pom.sledeci.sledeci!=null) { //zaustavlja se na pretposlednjem cvoru
			pom=pom.sledeci;
		}
		
		int izbacen=pom.sledeci.podatak; //pamti izbaceni element
		
		pom.sledeci=null;
		
		return izbacen;
	}
	
	int brojElemenataListe() {
		int brojac=0;
		Cvor pom=prvi;
		
		while(pom!=null) {
			pom=pom.sledeci;
			brojac++;
		}
		
		return brojac;
	}
	
	
	int elementSaPozicije(int indeks) {
		if(indeks<0 || indeks>=brojElemenataListe()) { //pokriva slucajeve da je indeks veci od broja elemenata liste,manji od 0 i ako je lista prazna
			throw new RuntimeException("Los indeks");
		}
		
		Cvor pom=prvi;
		
		for(int i=0;i<indeks;i++) {
			pom=pom.sledeci;
		}
		
		return pom.podatak;
	}
	
	void elementNaPoziciju(int indeks,int noviBr) {
		if(indeks<0 || indeks>=brojElemenataListe()) {  
			return;
		}
		
		Cvor pom=prvi;
		
		for(int i=0;i<indeks;i++) {
			pom=pom.sledeci;
		}
		
		pom.podatak=noviBr;
	}
	
	boolean sadrzi(int broj) { //radi i za praznu listu
		Cvor pom=prvi;
		
		for(int i=0;i<brojElemenataListe();i++) { //prolazak kroz listu pomocu for petlje (moze i while(pom!=null))
			if(pom.podatak==broj) {
				return true;
			}
			
			pom=pom.sledeci;
		}
		
		return false;
	}
	
	void ubaciNaIndeks(int indeks,int broj) { //radi i za ubacivanje na poslednje mesto
		if(indeks<0 || indeks>brojElemenataListe()) {  
			return;
		}
		
		/*if(indeks==0) {
			ubaciNaPocetak(broj);
			return;
		}
		
		if(indeks==brojElemenataListe()-1) {
			ubaciNaKraj(broj);
			return;
		}*/
		
		Cvor novi=new Cvor();
		Cvor pom=prvi;
		
		novi.podatak=broj;
		
		if(indeks==0) { //za ubacivanje na pocetak
			novi.sledeci=prvi;
			prvi=novi;
			return;
		}
		
		for(int i=0;i<indeks-1;i++) {
			pom=pom.sledeci;
		}
		
		novi.sledeci=pom.sledeci; //pravi vezu sa novim cvorom i njegovim sledbenikom
		pom.sledeci=novi; //pravi vezu sa novim cvorom i njegovim prethodnikom
	}
	
	int izbaciSaIndeksa(int indeks) {
		if(indeks<0 || indeks>=brojElemenataListe()) {  
			throw new RuntimeException("GRESKA!!!Los indeks");
		}
		
		if(indeks==0) {
			int izbacen=prvi.podatak;
			
			prvi=prvi.sledeci; //ne moze pozviv metode izaci sa kraja
			
			return izbacen;
		}
		
		Cvor pom=prvi;
		
		for(int i=0;i<indeks-1;i++) {
			pom=pom.sledeci;
		}
		
		int izbacen=pom.sledeci.podatak;
		
		pom.sledeci=pom.sledeci.sledeci;
		//pom.sledeci.sledeci=null;--->nije potrebno zbog Java Garbage Colector-a
		
		return izbacen;
	}
	
	void sotiranje() { //logika je ista kao zasortiranje nizova(selection sort)
		Cvor spori=prvi;
		Cvor brzi=prvi.sledeci;
		
		while(spori.sledeci!=null) {
			while(brzi!=null) {
				if(spori.podatak>brzi.podatak) { //< za opadajuce sortiranje
					int c=spori.podatak;
					spori.podatak=brzi.podatak;
					brzi.podatak=c;
				}
				
				brzi=brzi.sledeci;
			}
			
			spori=spori.sledeci;
			brzi=spori.sledeci; //pomera brzi na jedno mesto desno od sporog(da brzi ne bi isao od pocetka liste)
		}
	}
	
	void ubaciSotirano(int broj) { //lista mora da bude sortirana
		Cvor novi=new Cvor();
		
		novi.podatak=broj;
		
		if(prvi==null) { //ako je lista prazna
			prvi=novi;
			return;
		}
		
		//ubacivanje na pocetak
		if(prvi.podatak>=broj) { 
			novi.sledeci=prvi;
			prvi=novi; //novi cvor postaje prvi
			return;
		}
		
		//ubacivanje u sredinu
		Cvor p1=prvi;
		Cvor p2=prvi.sledeci; //dva pomocna pokazivaca koja porede vrednosti corova sa unetim brojem
		
		while(p2!=null) {
			if(p2.podatak>broj) {
				p1.sledeci=novi;
				novi.sledeci=p2;
				return;
			}
			
			p1=p1.sledeci;
			p2=p2.sledeci;
		}
		
		/*
		Cvor pom=prvi;
		
		 while(pom.sledeci!=null) {
			 if(pom.sledeci.podatak>broj) {
				novi.sledeci=pom.sledeci;
				pom.sledeci=novi;
				return;
			 }
			 
			 pom=pom.sledeci;
		 }*/
		
		//ubacivanje na kraj
		p1.sledeci=novi; //nije se ispunio uslov za ubacivanje elementa u sredinu
	}
	
	void izbaciSve(int broj){ //iz liste izbacuje sve brojeve koji su prosledjeni kao parametar(najcesca metoda,varijacije se podesavaju u if)
		if(prvi==null) { //ako je lista prazna
			return;
		}
		
		//izbacivanje sa pocetka
		while(prvi.podatak==broj) { //while ako se broj koji treba da se izbaci ponavlja vise puta na pocetku liste
			prvi=prvi.sledeci;
			
			if(prvi==null) { //ako su svi elementi liste broj koji treba da se izbaci
				return;
			}
		}
		
		//izbacivanje iz sredine
		Cvor pom=prvi;
		
		while(pom.sledeci!=null) {
			if(pom.sledeci.podatak==broj) {
				pom.sledeci=pom.sledeci.sledeci; //automatski se brise odgovarajuci cvor zbog Java Garbage Colectora-a
			} else { //pom se pomera u napred samo ako element nije obrisan iz liste
				pom=pom.sledeci;
			}
		}
	}
}
