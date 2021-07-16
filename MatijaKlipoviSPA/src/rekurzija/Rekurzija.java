package rekurzija;

public class Rekurzija {
	public void ispisi(int broj) {
		if(broj==-1) {
			return;
		}
		
		System.out.println(broj + " ");
		ispisi(broj-1);
	}
	
	public int faktorijel(int broj) {
		int faktorijel=0;
		
		if(broj==0) { //uslov za prekid
			return 1;
		} else {
			faktorijel=broj*faktorijel(broj-1);
			return faktorijel;
		}
	}
	
	public int zbirCifara(int broj) {
		int cifra=broj%10;
		int ostalo=broj/10;
		
		if(broj==0) { //uslov prekida
			return 0;
		}
		
		int zbir=cifra+zbirCifara(ostalo); //uzima se poslednja cifra
		
		return zbir;
	}
	
	public int proizvodCifara(int broj) { //enkapsulacija(sakrivanje funkcije)
		if(broj==0) {
			return 0;
		} 
		
		return proizvodCifaraR(Math.abs(broj)); //salje apsolutnu vrednot broja u rekurziju(zbog negativnih brojeva)
	}
	
	private int proizvodCifaraR(int broj) {
		int cifra=broj%10;
		int ostalo=broj/10;
		
		if(broj==0) { //uslov prekida
			return 1;
		}
		
		int proizvod=cifra*proizvodCifaraR(ostalo);
		
		return proizvod;
	}
	
	public void ispisNiza(int[] niz) {
		if(niz==null) {
			System.out.println("Niz ne postoji");
			return;
		}
		
		if(niz.length==0) {
			System.out.println("Niz je prazan");
			return;
		}
		
		System.out.print("Vas niz je: ");
		ispisNizaR(niz, 0);
	}
	
	private void ispisNizaR(int[] niz,int indeks) { //ispisuje elemente niza oocevsi od indeksa u parametru
		if(indeks==niz.length) {
			return;
		}
		
		System.out.print(niz[indeks]+ " ");
		
		ispisNizaR(niz, indeks+1);
	}
	
	public int zbirElemenata(int[] niz) {
		if(niz==null) {
			throw new RuntimeException("Niz ne postoji");
		}
		
		if(niz.length==0) {
			throw new RuntimeException("Niz je prazan");
		}
		
		return zbirElemenataR(niz, 0);
	}
	
	private int zbirElemenataR(int[] niz,int indeks) { //vraca zbir elemenata niza pocevsi pd indeksa u parametru
		int zbir;
		
		if(indeks==niz.length) {
			return 0;
		}
		
		zbir=niz[indeks]+zbirElemenataR(niz, indeks+1);
		
		return zbir;
	}
	
	/*public void ispisJSListe() {
		if(prvi==null) {
			System.out.println("Lista je prazna");
			return;
		}
		
		System.out.print("Vasa lista je: ");
		
		ispisJSListeR(prvi);
	}
	
	private void ispisJSListeR(Cvor cvor) { //ispisuje sve elemente JSListe pocevsi od nekog cvora
		if(cvor==null) {
			return;
		}
		
		System.out.print(cvor.podatak + " ");
		
		ispisJSListeR(cvor.sledeci);
	}*/
	
	/*public void ispisJSListeUNazadR(Cvor cvor) { //ispisuje sve elemente liste u nazad,poslednji element koji treba da se ispise je taj parametar cvor
		if(cvor==null) {
			return;
		}
		
		ispisJSListeUNazadR(cvor.sledeci);
		
		System.out.print(cvor.podatak + " ");
	}*/
}
