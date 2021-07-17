package nizovi;

public class NizProgram {

	public static void main(String[] args) {
		int niz[]=new int [5]; //deklarisnje niza
		int niz1[]= {1,2,3,4,5}; //deklrisaje niza sa elementima(kada se zna broj elemenata i koji su totacno elementi)
		int niz2[]=new int[50];
		int brElemenata=0; //trenutni broj elemenata niza
		
		int n=niz.length; //vraca duzinu niza
		System.out.println("Kapacitet niza je: " +n);
		
		niz[0]=5; //dodela vrednosti elemntu na navedenoj poziciji
		niz2[0]=3;
		niz2[1]=7;
		brElemenata=2;
		
		for(int i=0;i<brElemenata;i++) {
			System.out.println(niz2[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<niz1.length;i++) {
			System.out.println(niz1[i]);
			
		}

	}

}
