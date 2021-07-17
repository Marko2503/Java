package zadatak2A;

import zadatak1A.KucniAparat;

public class Radio extends KucniAparat{
	private double frekvencija;
	
	public Radio(boolean ukljucen,String markaIModel,double frekvencija) {
		if(frekvencija<87.5 || frekvencija>107.9) {
			System.out.println("GRESKA");
			this.frekvencija=87.5;
		} else {
			this.frekvencija=frekvencija;
		}
	}

	public double getFrekvencija() {
		return frekvencija;
	}

	public void setFrekvencija(double frekvencija) {
		if(frekvencija<87.5 || frekvencija>107.9) {
			System.out.println("GRESKA");
		} else {
			this.frekvencija = frekvencija;
		}
	}
	
	public String toString() {
		return "RADIO FREKVENCIJA: " + frekvencija + " Mhz";
	}
}
