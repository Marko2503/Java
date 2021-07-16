package zadatak1A;

public class TezineClanovaEkipe {
	
	double [] nizTezina;
	int brojac=0; //broj trenutnih elemenata niza(pokazivac na prvu sledecu slobodnu poziciju)

	TezineClanovaEkipe(){
		nizTezina=new double[20]; //inicijalizacija niza
		
		for(int i=0;i<nizTezina.length;i++) {
			nizTezina[i]=-1;
		}
	}
	
	TezineClanovaEkipe(int brojClanova){
		nizTezina=new double[brojClanova];
		
		for(int i=0;i<nizTezina.length;i++) {
			nizTezina[i]=-1;
		}
	}
	
	void unesi(double tezina) {
		if(tezina>40.5 && brojac<nizTezina.length) {  //bitn je da postoji drugi uslov u if petlji zbog mogucih gresaka ArrayInexOutOfBounds
			nizTezina[brojac]=tezina;
			brojac++;
		} else {
		System.out.println("GRESKA");
		}
	}
	
	void ispisi() {
		for(int i=0;i<brojac;i++) { //ide do brojaca jer niz ne mora da bude popunjen do pune velicine
			System.out.println(nizTezina[i]);
		}
	}
	
	boolean pronadjiTezinu(double tezina) {
		for(int i=0;i<brojac; i++) {
			if(nizTezina[i]==tezina) {
				return true;
			} 
		}
		
		return false;  //ne moze preko else, jer ce se onda proveriti uslov samo za prvi element niza
	}
	
	double pronadjiNajlakseg() {
		if(brojac==0) {
			return -1;
		}
		
		double min=nizTezina[0]; //Integer.MAX_VALUE
		
		for(int i=0;i<brojac;i++) {
			if(nizTezina[i]<min) {
				min=nizTezina[i];
			}
		}
		
		return min;
	}
	
	void ispisiKategorije() {
		int laka=0;
		int srednja=0;
		int teska=0;
		
		
		for(int i=0;i<brojac;i++) {
			if(nizTezina[i]<65) {
				laka++;
			} else if(nizTezina[i]<85) {
				srednja++;
			} else {
				teska++;
			}
		}
		
		System.out.println("Laka:" +laka);
		System.out.println("Srednja:" +srednja);
		System.out.println("Teska:" +teska);
		
	}
	
}
