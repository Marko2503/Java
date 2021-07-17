package klase;

public class Metode {
	void pozdrav() {
		System.out.println("Hello");
	}
	
	void ispisiOd0DoN(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	static int faktorijel(int broj) {
		int p=1;
		
		for(int i=broj;i>0;i--) {
			p=p*i;
		}
		
		return p;
	}
	
	int zbirCifara(int broj) {
		int zbir=0;
		int cifra;
		
		while(broj!=0) {
			cifra=broj%10;
			zbir=zbir+cifra;
			broj=broj/10;
		}
		
		return zbir;
	}
	
	int brojCifara(int broj) {
		int brojac=0;
		
		while(broj!=0){
			brojac++;
			broj=broj/10;
		}
		
		return brojac;
	}
	
	double aritmetickaSredinaCifara(int broj) { //moze i preko prethodno definisanih metoda
		int zbir=0;
		int brojac=0;
		int cifra;
		double aritmetickaSredina;
		
		while(broj!=0) {
			cifra=broj%10;
			zbir=zbir+cifra;
			broj=broj/10;
			brojac++;
		}
		
		aritmetickaSredina=(double)zbir/brojac;
		
		return aritmetickaSredina;
	}
}
