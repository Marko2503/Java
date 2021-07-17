package nivoiPristupa;

public class NivoiProgram {

	public static void main(String[] args) {
		Nivoi n1=new Nivoi();
		
		n1.paketskiBroj=5;
		n1.ispisiPrivatan();
		n1.javniBroj=65;
		n1.zasticeniBroj=60;
		
		System.out.println(n1.javniBroj);
		System.out.println(n1.zasticeniBroj);

	}

}
