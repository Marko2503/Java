package jsListe;

public class JSLIsteProgram {

	public static void main(String[] args) {
		Cvor c1=new Cvor();
		Cvor c2=new Cvor();
		Cvor c3=new Cvor();
		
		c1.podatak=1;
		c1.sledeci=c2; //upisivanje adrese u pokazivac
		
		c2.podatak=2;
		c2.sledeci=c3;
		
		c3.podatak=3;
		c3.sledeci=null;
		
		JSListe lista=new JSListe(); //spajanje prvog cvora liste sa klasom JSListe
		
		lista.prvi=c1;
		
		lista.ispisListe();
		
		lista.ubaciNaPocetak(8);
		
		lista.ispisListe();
		
		lista.ubaciNaKraj(4);
		
		lista.ispisListe();
		
		JSListe lista1=new JSListe(1,2,3,4);
		
		lista1.ispisListe();
		
		System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaPocetka());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaPocetka());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaPocetka());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaPocetka());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaPocetka());
		
		lista1.ispisListe();
		
		System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaKraja());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaKraja());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaKraja());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaKraja());
		//System.out.println("Iz iste je izbacen broj " +lista1.izbaciSaKraja());
		
		lista1.ispisListe();
		
		System.out.println("Broj elemenata liste: " +lista1.brojElemenataListe());
		
		JSListe lista2=new JSListe(1,2,3,4,5);
		
		lista2.ispisListe();
		
		System.out.println("Element na trazenoj poziciji: " +lista2.elementSaPozicije(0));
		
		lista2.elementNaPoziciju(3, 10);
		
		lista2.ispisListe();
		
		System.out.println(lista2.sadrzi(3));
		
		lista2.ubaciNaIndeks(4, 6);
		
		lista2.ispisListe();
		
		System.out.println("Izbaceni element: " +lista2.izbaciSaIndeksa(4));
		
		lista2.ispisListe();
		
		lista2.sotiranje();
		
		lista2.ispisListe();
		
		lista2.ubaciSotirano(11);
		
		lista2.ispisListe();
		
		JSListe lista3=new JSListe(2,2,2,2,1,2,3,4,2,2,5);
		
		lista3.ispisListe();
		
		lista3.izbaciSve(2);
		
		lista3.ispisListe();
	}
}
