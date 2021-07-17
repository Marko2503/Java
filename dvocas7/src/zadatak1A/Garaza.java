package zadatak1A;

import zadatak1A.ParkingMesto;

public class Garaza {
	private ParkingMesto[] mesta;

	public Garaza(int kapacitet) {
		if (kapacitet > 0) {
			mesta = new ParkingMesto[kapacitet];
		} else {
			System.out.println("GRESKA");
			mesta = new ParkingMesto[40];
		}

		for (int i = 0; i < mesta.length; i++) {
			mesta[i] = new ParkingMesto();
			mesta[i].setSlobodno(true);
		}
	}

	public Garaza(ParkingMesto[] mesta) {
		if (mesta != null) {
			this.mesta = mesta;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public void ispisi() {
		for(int i=0;i<mesta.length;i++) {
			System.out.println(mesta[i]); //preko toString metode
		}
	}
	
	public void uvedi(Vozilo vozilo) {
		for(int i=0;i<mesta.length;i++) {
			if(mesta[i].isSlobodno()) {
				mesta[i].setVozilo(vozilo); //ubacuje vozilo
				mesta[i].setSlobodno(false);
				return; //moze jer ne vraca vrednost,vec prekida izvrsavanje metode
			}
		}	
		
		System.out.println("NEMA MESTA");
	}
	
	public void izvedi(Vozilo vozilo) {
		for(int i=0;i<mesta.length;i++) {
			if(mesta[i].getVozilo()!=null && mesta[i].getVozilo().equals(vozilo)) { //da li je vozilo null
				mesta[i].setVozilo(null);
				mesta[i].setSlobodno(true);
			}
		}
	}
}
