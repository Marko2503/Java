package nizovi;

public class Niz {
	int[] niz;
	int brElemenata;
	
	public Niz() {
		niz=new int[100]; //postavljanje kapaciteta niza 
		brElemenata=0;
	}

	public Niz(int kapacitet) {
		niz=new int[kapacitet]; //postavljanje kapaciteta niza na uneti broj 
		brElemenata=0;
	}
	
	void ispisNiza() {
		if(brElemenata==0) {
			System.out.println("Niz je prazan");
			return;
		}
		
		System.out.print("Niz je: ");
		
		for(int i=0;i<brElemenata;i++) {
			System.out.print(niz[i]+ " ");
		}
		
		System.out.println();
	}
	
	int vratiKapacitet() {
		return niz.length;
	}
	
	void ubaciElement(int element) {
		if(brElemenata==niz.length) {
			System.out.println("Greska nzi je vec pun");
			return;
		}
		
			niz[brElemenata++]=element;
	}
	
	void ispisiParne() {
		System.out.print("Parni elementi niza su: ");
		
		for(int i=0;i<brElemenata;i++) {
			if(niz[i]%2==0) {
				System.out.print(niz[i]+ " ");
			}
		}
		
		System.out.println();
	}
	
	void ispisiUnazad() {
		System.out.print("Niz ispisan unazad je: ");
		
		for(int i=brElemenata-1;i>=0;i--) {
			System.out.print(niz[i]+ " ");
		}
		
		System.out.println();
	}
	
	int zbirElemenataNiza() {
		int suma=0;
		
		for(int i=0;i<brElemenata;i++) {
			suma=suma+niz[i];
		}
		
		return suma;
	}
	
	int proizvodElemenataNiza() {
		int proizvod=1;
		
		for(int i=0;i<brElemenata;i++) {
			proizvod=proizvod*niz[i];
		}
		
		return proizvod;
	}
	
	int frekvencija(int broj) {
		int brojac=0;
		
		for(int i=0;i<niz.length;i++) {
			if(niz[i]==broj) {
				brojac++;
			}
		}
		
		return brojac;
	}
	
	int maksimum() {
		int max=niz[0];
		
		for(int i=0;i<niz.length;i++) {
			if(niz[i]>max) {
				max=niz[i];
			}
		}
		
		return max;
	}
	
	void sortiranjeNiza() { //algoritam za soriranje je uvek isti jedino se menja znak u if
		for(int i=0;i<niz.length-1;i++) {
			for(int j=i+1;j<niz.length;j++) {
				if(niz[i]<niz[j]) {
					int c=niz[i]; //pomocna promenljiva
					niz[i]=niz[j];
					niz[j]=c;
				}
			}
		}
		
		System.out.println();
	}
	
	int maxParni() {
		int maxParni=Integer.MIN_VALUE; //ne sme niz[0] jer se ne zna njegova parnost
		boolean postoji=false;
		
		for(int i=0;i<niz.length;i++) {
			if(niz[i]%2==0 && niz[i]>maxParni) {
				maxParni=niz[i];
				postoji=true;
			}
		}
		
		if(postoji) { //ako u nizu postoji paran element
			return maxParni;
		} else { //u nizu ne postoji paran element
			return -1; 
		}
	}
}
