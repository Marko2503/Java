package zadatak2;

public class ProbaBankomat {

	public static void main(String[] args) {
		AutomatNovcaInterfejs a1=new Bankomat();
		
		a1.uloziNovac(250);
		a1.podigniNovac(500);
		
		Bankomat b1=(Bankomat) a1; //pretvara automat u bankomat
		
		b1.ispisiStanje();
		
		b1.uloziNovac(750);
		b1.podigniNovac(500);
		b1.ispisiStanje();
	}

}
