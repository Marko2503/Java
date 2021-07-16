package zadatak2A;

public class BMIKalkulator {
	double vrednost=0.0;
	BMIKategorija status;

	void izracunajBMI(double visina,double tezina) {
		
		
		if(visina>=1.20 && visina<=2.40 && tezina>=30 && tezina<=240) {
			 vrednost=tezina/(visina*visina);
		}
		else {
			System.out.println("GRESKA");
		}
	}
	
	void postaviBMIStatus() {
		
		if(vrednost<=15) {
			status=BMIKategorija.ANOREKSICAN;
		}
		else if(vrednost>15 && vrednost<=18.5) {
			status=BMIKategorija.MRSAV;
		}
		else if(vrednost>18.5 && vrednost<=25) {
			status=BMIKategorija.NORMALAN;
		}
		else if(vrednost>25 && vrednost<=30) {
			status=BMIKategorija.DEBEO;
		}
		else {
			status=BMIKategorija.GOJAZAN;
		}
	}
	
	void ispisi() {
		System.out.println("BMI je " + vrednost + " a kategorija je " + status);
	}
}
