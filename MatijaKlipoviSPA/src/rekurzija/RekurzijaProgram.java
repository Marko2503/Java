package rekurzija;

public class RekurzijaProgram {

	public static void main(String[] args) {
		 Rekurzija r1=new Rekurzija();
		 
		// r1.ispisi(8);
		 
		 System.out.println("Faktorijel unetog broja je: " +r1.faktorijel(5));
		 
		 System.out.println("Zbir cifara unetog broja je: " +r1.zbirCifara(1234));
		 
		 System.out.println("Proizvod cifara unetog broja je: " +r1.proizvodCifara(-225));
		 
		 int[] niz= {1,2,3,4,5};
		 
		 r1.ispisNiza(niz);
		 
		 System.out.println();
		 
		 System.out.println("Zbir elemenata niza je: " +r1.zbirElemenata(niz));
		 
		 //lista.ispisJSListe();
		 
		 //lista.ispisJSLiseUNazad(lista.prvi);
		 
	}
}
