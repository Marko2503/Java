package zadatak1A;

public class SlozeniKalkulator {
	
	double podeli(double a,double b) { //normalno deljenje
		double rezultat=a/b;
		return rezultat;
	}
	
	int podeli(int a,int b) { //celobrojno deljenje
		int rezultat=a/b;
		return rezultat;
	}
	
	int podeliMod(int a,int b) { //celobrjni ostatak pri deljenju
		int ostatak=a%b;
		return ostatak;
	}	
		
	void ispisi50Puta(int broj) {
		
		for(int i=1;i<=50;i++) {
			System.out.println(broj);
		}
	}
	
	void ispisi1do100() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	static int suma(int n) {
		int rezultat=0;
		
		for(int i=1;i<=n;i++) {
			rezultat=rezultat+i;
		}
		
		return rezultat;
	}
	
	static double stepenX(double x,int n) {
		double rezultat=1;
		int brojac=0;
		
		while(brojac<n) {
			rezultat=rezultat*x;
			brojac++;
		}
		
		/*for(int i=1;i<=n;i++) {
			rezultat=rezultat*x;
		}
		*/
		
		return rezultat;
	}
	
	static int minStepenDva(int n) {
		int broj=1;
		
		while(broj<n) {
			broj=broj*2;
		}
		
		return broj;
	}
	
	static void deliSaDva(int broj) {
		while(broj>1) {
			broj=broj/2;
			System.out.println(broj);
		}
	}
		
		
	
	
	
	
	
	
	
	
	

}
