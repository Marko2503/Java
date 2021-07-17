package nizovi;

public class NizProgram1 {

	public static void main(String[] args) {
		Niz n1=new  Niz(); //pravi samo objekat ne i niz
		Niz n2=new Niz(5); //pravi se nizod 5 elemenata
		
		n2.ubaciElement(1);
		n2.ubaciElement(2);
		n2.ubaciElement(3);
		n2.ubaciElement(4);
		n2.ubaciElement(5);
		
		n1.ispisNiza();
		n2.ispisNiza();
		
		n2.ispisiParne();
		n2.ispisiUnazad();
		System.out.println("Zbir elemenata niza je: " +n2.zbirElemenataNiza());
		System.out.println("Proizvod elemenata niza je: " +n2.proizvodElemenataNiza());
		System.out.println("Broj pojavljivanja unetog broja u nizu je: " +n2.frekvencija(5));
		System.out.println("Maksimalni clan niza je: " +n2.maksimum());
		n2.sortiranjeNiza();
		n2.ispisNiza();
		System.out.println("Najveci parni element niza je: " +n2.maxParni());

		System.out.println("Kapacitet prvog niza je: " +n1.vratiKapacitet());
		System.out.println("Kapacitet drugog niza je: " +n2.vratiKapacitet());
	}

}
