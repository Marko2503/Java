package zadatak2A;

public class SlozeniKalkulator2 {
	
	void ispisi55Do0() {
		for(int i=55;i>=0;i--) {
			System.out.println(i);
		}
	}
	
	static int faktorijel(int broj) {
		int faktorijel=1;
		
		for(int i=1;i<=broj;i++) {
			faktorijel=faktorijel*i;
		}
		
		return faktorijel;
	}
	
	static int ABN(int a,int b,int n) {
		int suma;
		int stepen=1;
		int brojac=1;
		
		suma=a+b;
		
		while(brojac<=n) {
			stepen=stepen*suma;
			brojac++;
		}
		
		return stepen;
	}

}
