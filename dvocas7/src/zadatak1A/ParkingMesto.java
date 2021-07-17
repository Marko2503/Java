package zadatak1A;

public class ParkingMesto {
	private boolean slobodno;
	private Vozilo vozilo;
	
	public boolean isSlobodno() { //geter sa atribute tipa boolean
		return slobodno;
	}
	public void setSlobodno(boolean slobodno) {
		this.slobodno = slobodno;
	}
	public Vozilo getVozilo() {
		return vozilo;
	}
	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}
	
	@Override
	public String toString() {
		if(slobodno) {
			return "SLOBODNO";
		} else {
			return "ZAUZETO, " + vozilo; //vraca toString klase vozilo
		}
	}
	
	
	
	

}
