package jsListe;

public class CiklicneJSListeProgram {
	
	public static void main(String[] args) {
		Cvor c1=new Cvor();
		Cvor c2=new Cvor();
		Cvor c3=new Cvor();
		Cvor c4=new Cvor();
		
		c1.podatak=1;
		c1.sledeci=c2;
		
		c2.podatak=2;
		c2.sledeci=c3;
		
		c3.podatak=3;
		c3.sledeci=c4;
		
		c4.podatak=4;
		c4.sledeci=c1; //povezivanje poseldnjeg cvora sa prvim
		
		CiklicneJSListe lista=new CiklicneJSListe();
		
		lista.prvi=c1;
		
		lista.ispisListe();
		
		lista.ubaciNaPocetak(0);
		
		lista.ispisListe();
		
	    CiklicneJSListe lista1=new CiklicneJSListe();
	    
	    lista1.ispisListe();
	    
	    lista1.ubaciNaPocetak(5);
	    
	    lista1.ispisListe();
	    
	    lista1.ubaciNaKraj(6);
	    
	    lista1.ispisListe();
	    
	    CiklicneJSListe lista2=new CiklicneJSListe(1,2,3,4);
	    
	    lista2.ispisListe();
	    
	    lista2.ubaciNaKraj(4);
	    
	    lista2.ispisListe(); 
	}
}
