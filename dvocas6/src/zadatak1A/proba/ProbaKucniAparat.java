package zadatak1A.proba;

import zadatak1A.Televizor;
import zadatak1A.KucniAparat;

public class ProbaKucniAparat{

	public static void main(String[] args) {
		KucniAparat ka1=new KucniAparat(true, "Laptop Acer A315");
		KucniAparat ka2=new KucniAparat(true, "Laptop Acer A315");
		
		ka1.ukljuciIskljuci();
		//ka1.ispisi();
		//ka2.ispisi();
		
		System.out.println(ka1);
		System.out.println(ka2);
		
		if(ka1.equals(ka2)) {
			System.out.println("Aparati su isti");
		} else {
			System.out.println("Aparati nisu isti");
		}
		
		Televizor tv=new Televizor(true, "Samsung UE40", 1);
		
		tv.ukljuciIskljuci();
		tv.promeniProgram(5);
		System.out.println(tv);
		//tv.ispisi();
		
		KucniAparat ka3=tv; //referenca (promenljiva) klase kucni aparat pokazuje na isti objekat kao tv (ovo je moguce jer tv nasledjuje kucni aparat)
		ka3.ukljuciIskljuci();
		//ka3.ispisi();
		
		//System.out.println(ka1);
		
	}

}
