package nivoiPristupaPomocni;

import nivoiPristupa.Nivoi;

public class NivoiProgram2 {

	public static void main(String[] args) {
		Nivoi n2=new Nivoi();
		NivoiPomocni n3=new NivoiPomocni();
		
		System.out.println(n2.javniBroj);
		n2.ispisiPrivatan();
		n3.ispisProtectedPromenljive();
	}
}
