package zadatak1A;

public class KucniAparat {
	private boolean ukljucen;
	private String markaIModel;
	
	public KucniAparat () { //da u klasi koja nasledjuje ovu ne bi bilo gresaka
		ukljucen=false;
		markaIModel="nepoznato";
	}
	
	public KucniAparat(boolean ukljucen,String markaIModel) {
		this.ukljucen=true; 
		this.markaIModel=markaIModel; //atributu se dodeljuje vrednost parametra
	}
	
	public void ukljuciIskljuci() {
		if(ukljucen==true) { 
			ukljucen=false;
		} else {
			ukljucen=true;
		}
	}
	
	public void ispisi() {
		System.out.println(markaIModel);
		System.out.println("Ukljucen: " +ukljucen);
	}

	public String toString() { //redefinisana metoda toString
		return "MARKA I MODEL: " +markaIModel+ " UKLJUCEN: "+ukljucen;
	}
	
	public boolean equals(Object obj) { //redefinisana metoda equals
		if(!(obj instanceof KucniAparat)) {
			return false;
		} 
		
		KucniAparat ka=(KucniAparat)obj; //kastovanje
		
		if(this.markaIModel.equals(ka.markaIModel)) { //ne moze obj umesto ka(iz tog razloga se vrsi kastovanje)
			return true;
		} 
		
		return false;
		}
}
