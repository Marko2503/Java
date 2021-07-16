package dsListe;

public class DSListeProgram {

	public static void main(String[] args) {
		DSCvor c1=new DSCvor();
		DSCvor c2=new DSCvor();
		DSCvor c3=new DSCvor();
		
		c1.podatak=1;
		c1.prethodni=null; //moze i bez ovoga(podrazumevana vrednost je null)
		c1.sledeci=c2;
		
		c2.podatak=2;
		c2.prethodni=c1;
		c2.sledeci=c3;
		
		c3.podatak=3;
		c3.prethodni=c2;
		c3.sledeci=null;
		
		DSListe lista=new DSListe();
		
		lista.prvi=c1; //povezivanje liste sa prvim cvorom
		
		lista.ispisListe();
		lista.ispisListeUNazad();
		
		lista.ubaciNaPocetak(0);
		
		lista.ispisListe();
		lista.ispisListeUNazad();
		
		DSListe lista1=new DSListe();
		
		lista1.ispisListe();
		lista1.ispisListeUNazad();
		
		lista1.ubaciNaPocetak(1);
		
		lista1.ispisListe();
		lista1.ispisListeUNazad();
		
		lista.ubaciNaKraj(4);
		
		lista.ispisListe();
		lista.ispisListeUNazad();
		
		DSListe lista2=new DSListe();
		
		lista2.ispisListe();
		lista2.ispisListeUNazad();
		
		lista2.ubaciNaKraj(2);
		
		lista2.ispisListe();
		lista2.ispisListeUNazad();
		
		DSListe lista3=new DSListe(2,2,2,1,2,2,3,2,4,2,2);
		
		lista3.ispisListe();
		lista3.ispisListeUNazad();
		
		lista3.izbaciSve(2);
		
		lista3.ispisListe();
		lista3.ispisListeUNazad();
		
		

	}

}
