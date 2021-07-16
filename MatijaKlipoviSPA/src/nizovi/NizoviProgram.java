package nizovi;

public class NizoviProgram {

	public static void main(String[] args) {
		Niz niz1=new Niz(100);
		Niz niz2=new Niz(100);
		
		niz1.ispisNiza();
		
		niz1.ubaciNaKraj(5);
		niz1.ubaciNaKraj(9);
		
		niz1.ispisNiza();
		
		niz1.ubaciNaKraj(5);
		
		niz1.ubaciNaKraj(1,2,3,4,5,-5);
		
		niz1.ispisNiza();
		
		/*System.out.println("Maksimalni element niza je " +niz1.maxNiza());
		
		System.out.println("Maksimalni negativni element niza je " +niz1.maxNegativan());*/
		
		niz1.ubaciNaPocetak(2);
		
		niz1.ispisNiza();
		
		niz1.ubaciNaIndeks(5, 2);
		
		niz1.ispisNiza();
		
		niz2.ubaciNaKraj(1,2,3,5,6);
		
		niz2.ispisNiza();
		
		niz2.ubaciSortirano(4);
		
		niz2.ispisNiza();
		
		niz2.ubaciSortirano(9);
		
		niz2.ispisNiza();
		
		niz1.sortiraj();
		
		niz1.ispisNiza();
		
		System.out.println("Broj se u nizu pojavljuje " +niz1.frekvencija(5)+ " puta");
		
		int [] niz3= {1,2,2,2,3,3};
		
		System.out.println(Niz.frekvencija(2, niz3));
		
		int [] niz4= {1,2,2,3,4};
		int [] niz5= {4,5,6};
		
		Niz niz=new Niz(100);
		
		niz.unijaNizova(niz4, niz5);
		
		niz.ispisNiza();
		
		int [] niz6= {1,3,6,7,9};
		int [] niz7= {2,4,5,8,10,11,12};
		
		Niz niz8=new Niz(100);
		
		niz8.spajanjeSotiranih(niz6, niz7);
		
		niz8.ispisNiza();
		
		Niz niz9=new Niz(100);
		
		niz9.ubaciNaKraj(1,2,5,9,6);
		
		niz9.ispisNiza();
		
		System.out.println("Zbir tri najveca elementa niza je " +niz9.zbir3Maxa());
		
		System.out.println("Zbir tri najveca elementa niza je " +niz9.zbir3MaxaJedanProlaz());
		
		
	}
}
