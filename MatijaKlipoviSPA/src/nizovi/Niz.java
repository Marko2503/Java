package nizovi;

public class Niz {
	int niz []; //kreiranje niza
	
	//int niz []=new int [10]--->kreiranje praznog niza(svi elementi su 0)
	
	int n=0; //trenutni broj elemenata u nizu

	public Niz(int kapacitet) { //konsturktor za kreiranje niza svaki put pri kreiranju objekta
		niz=new int[kapacitet];
	}
	
	void ubaciNaKraj(int noviBroj) {
		if(niz.length==n) {
			System.out.println("Niz je pun");
			return;
		}
		
		niz[n++]=noviBroj;
	}
	
	void ubaciNaKraj(int... nekiNiz) { //metoda prima neodredjen broj ulaznih parametara
		for(int i=0;i<nekiNiz.length;i++) {
			ubaciNaKraj(nekiNiz[i]);
		}
	}
	
	void ispisNiza() {
		if(n==0) {
			System.out.println("Niz je prazan");
			return;
		}
		
		System.out.print("Vas niz je: ");
		
		for(int i=0;i<n;i++) {
			System.out.print(niz[i]+ " ");
		}
		
		System.out.println();
	}
	
	int maxNiza() {
		if(n==0) {
			throw new RuntimeException("Niz je pun ne moze se naci maksimalni element");
		}
		
		int max=niz[0];
		
		for(int i=0;i<n;i++) {
			if(niz[i]>max) {
				max=niz[i];
			}
		}
		
		return max;
	}
	
	int maxNegativan() {
		int max=Integer.MIN_VALUE; //najmanja moguca vrednost za int
		boolean uspesno=false;
		
		for(int i=0;i<n;i++) {
			if(niz[i]<0 && niz[i]>max) {
				max=niz[i];
				uspesno=true;
			}
		}
		
		if(uspesno) {
			return max;
		} else {
			throw new RuntimeException("U nizu nema negativnih elemenata");
		}
	}

	void ubaciNaPocetak(int noviBroj) {
		if(n==niz.length) {
			System.out.println("Niz je pun");
			return;
		}
		
		for(int i=n;i>0;i--) {
			niz[i]=niz[i-1];
		}
		
		niz[0]=noviBroj;
		
		n++;
	}
	
	void ubaciNaIndeks(int noviBroj,int indeks) {
		if(indeks>n || indeks<0) {
			System.out.println("Indeks mora biti manji od broja elemenata niza,a veci od 0");
			return;
		}
		
		if(n==niz.length) {
			System.out.println("Niz je pun");
			return;
		}
		
		for(int i=n;i>indeks;i--) {
			niz[i]=niz[i-1];
		}
		
		niz[indeks]=noviBroj;
		
		n++;
	}
	
	void ubaciSortirano(int noviBroj) { //pretpotavka je da je niz vec sortiran
		if(n==niz.length) {
			System.out.println("Greska niz je pun");
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(noviBroj<niz[i]) {
				ubaciNaIndeks(noviBroj, i);
				return;
			}
		}
		
		ubaciNaKraj(noviBroj);
	}
	
	void sortiraj() { //selection sort
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(niz[j]<niz[i]) { //za opadajuci niz >
					int pomocna=niz[i];
					niz[i]=niz[j];
					niz[j]=pomocna;
				}
			}
		}
	}
	
	int frekvencija(int element) {
		int brojac=0;
		
		for(int i=0;i<n;i++) {
			if(niz[i]==element) {
				brojac++;
			}
		}
		
		return brojac;
	}
	
	static int frekvencija(int element,int [] niz) { //moze nad bilo kojim nizom
		int brojac=0;
		
		for(int i=0;i<niz.length;i++) {
			if(element==niz[i]) {
				brojac++;
			}
		}
		
		return brojac;
	}
	
	void unijaNizova(int [] niz1,int [] niz2) {
		niz=new int [niz1.length+niz2.length];
		n=0;
		
		for(int i=0;i<niz1.length;i++) {
			if(frekvencija(niz1[i])==0) {
				niz[n++]=niz1[i];
			}
		}
		
		for(int j=0;j<niz2.length;j++) {
			if(frekvencija(niz2[j], niz)==0) {
				niz[n++]=niz2[j];
			}
		}
	}
	
	void spajanjeSotiranih(int [] niz1,int [] niz2) { //nizovi koji se salju moraju biti sortirani rastuce
		niz=new int[niz1.length+niz2.length];
		n=0;
		
		int brojac1=0;
		int brojac2=0;
				
		while(!(brojac1==niz1.length && brojac2==niz2.length)){ //za istovremeni prolazak kroz oba niza(moze i brojac1!=niz1.length || brojac2!=niz2.length)
			if(niz1.length==brojac1) { //ako se proslo kroz ceo prvi niz
				niz[n++]=niz2[brojac2];
				brojac2++;
				continue; //prelazi u sledecu iteracju petlje
			} 
			
			if(niz2.length==brojac2) { //ako se proslo kroz ceo drugi niz
				niz[n++]=niz1[brojac1];
				brojac1++;
				continue; 
			}
			
			if(niz1[brojac1]<niz2[brojac2]) {
				niz[n++]=niz1[brojac1];
				brojac1++;
			} else {
				niz[n++]=niz2[brojac2];
				brojac2++;
			}
		}
	}
	
	int zbir3Maxa() {
		if(n<3) {
			throw new RuntimeException("Uneti niz ima manje od 3 elementa");
		}
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		int indexMax1=-1; //da bi se osiguralo kojim redosledom idu maksimalni elementi
		int indexMax2=-1;
		
		for(int i=0;i<n;i++) {
			if(max1<niz[i]) {
				max1=niz[i];
				indexMax1=i;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(max2<niz[i] && i!=indexMax1) {
				max2=niz[i];
				indexMax2=i;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(max3<niz[i] && i!=indexMax1 && i!=indexMax2) {
				max3=niz[i];
			}
		}
		
		return max1+max2+max3;
	}
	
	int zbir3MaxaJedanProlaz() {
		if(n<3) {
			throw new RuntimeException("Uneti niz ima manje od 3 elementa");
		}
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(niz[i]>=max1) {
				max3=max2; //pomeranje elemenata
				max2=max1;
				max1=niz[i];
			} else if(niz[i]>=max2) {
				max3=max2;
				max2=niz[i];
			} else if(niz[i]>=max3) {
				max3=niz[i];
			}
		}
		
		return max1+max2+max3;
	}
}
