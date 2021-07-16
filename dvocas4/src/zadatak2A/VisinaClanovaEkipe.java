package zadatak2A;

public class VisinaClanovaEkipe {
	int [] nizVisina;
	int brojac=0;
	
	VisinaClanovaEkipe(int brojClanova){
		if(brojClanova>0) {
			nizVisina=new int[brojClanova];
		} else {
			nizVisina=new int[20];
		}
		
		for(int i=0;i<nizVisina.length;i++) {
			nizVisina[i]=0;
		}
	}
	
	void unesi(int visina) {
		if(visina>=160 && visina<=250 && brojac<nizVisina.length) {
			nizVisina[brojac]=visina;
			brojac++;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	int vratiProsek() {
		int prosek;
		int suma=0;
		
		for(int i=0;i<brojac;i++) {
			suma=suma+nizVisina[i];
		}
		
		prosek=suma/brojac;
		
		return prosek;
	}
	
	int vratiNajvecuRazliku() {
		int min=nizVisina[0];
		int max=nizVisina[0];
		int najvecaRazlika;
		
		for(int i=0;i<brojac;i++) {
			if(nizVisina[i]<min) {
				min=nizVisina[i];
			}
		}
		
		for(int i=0;i<brojac;i++) {
			if(nizVisina[i]>max) {
				max=nizVisina[i];
			}
		}
		
		najvecaRazlika=max-min;
		
		return najvecaRazlika;
	}
}
