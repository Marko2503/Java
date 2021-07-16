package zadatak2A;

import zadatak2.VisineClanovaEkipeTest;

public class TestVisineClanovaEkipe {

	public static void main(String[] args) {
		VisinaClanovaEkipe visineClanova1=new VisinaClanovaEkipe(20);
		VisinaClanovaEkipe visineClanova2=new VisinaClanovaEkipe(30);
		VisinaClanovaEkipe visineClanova3=new VisinaClanovaEkipe(40);
		
		visineClanova2.unesi(186);
		visineClanova2.unesi(169);
		visineClanova2.unesi(224);
		
		System.out.println("Prosecna visina druge ekipe je: " +visineClanova2.vratiProsek());

	}

}
