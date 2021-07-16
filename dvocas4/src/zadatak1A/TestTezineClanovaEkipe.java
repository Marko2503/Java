package zadatak1A;

public class TestTezineClanovaEkipe {

	public static void main(String[] args) {
		TezineClanovaEkipe tezineClanova1=new TezineClanovaEkipe();
		//TezineClanovaEkipe tezineClanova2=new TezineClanovaEkipe(10);
		
		tezineClanova1.unesi(65.2);
		tezineClanova1.unesi(56.2);
		tezineClanova1.unesi(39);
		tezineClanova1.unesi(45.8);
		tezineClanova1.unesi(95.6);
		tezineClanova1.unesi(102);
		tezineClanova1.unesi(73.4);
		tezineClanova1.ispisi();
		
		boolean daLiSadrzi=tezineClanova1.pronadjiTezinu(45.8);
		System.out.println("Odgovor: " +daLiSadrzi);
		
		System.out.println("Najlaksi bokser ima: " +tezineClanova1.pronadjiNajlakseg());
		
		tezineClanova1.ispisiKategorije();
	}

}
