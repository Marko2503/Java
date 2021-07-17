package nizovi;

public class NizoviStatickeMetode {
	static void ispisNiza(int[] niz) {
		System.out.print("Niz je: ");
		
		for(int i=0;i<niz.length;i++) {
			System.out.print(niz[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
	
	static int[] kopiranjeNiza(int[] niz) {
		int[] noviNiz=new int[niz.length];
		
		for(int i=0;i<niz.length;i++) {
			noviNiz[i]=niz[i];
		}
		
		return noviNiz;
	}
	
	static void ispisForEach(int[] niz) {
		System.out.print("Niz preko for each je: ");
		
		for(int element:niz) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}
	
	static int zbir(int[] niz) {
		int zbir=0;
		
		for(int element:niz) {
			zbir=zbir+element;
		}
		
		return zbir;
	}
	
	static int[] spajanjeNizova(int[] niz1,int[] niz2) {
		int[] niz3=new int[niz1.length+niz2.length];
		int pozicija=0;
		
		for(int i=0;i<niz1.length;i++) {
			niz3[pozicija++]=niz1[i];
		}
		
		for(int i=0;i<niz2.length;i++) {
			niz3[pozicija++]=niz2[i];
		}
		
		return niz3;
	}
}
