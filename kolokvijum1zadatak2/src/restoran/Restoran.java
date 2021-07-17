package restoran;

import java.util.GregorianCalendar;

import restoran.vrsta.VrstaHrane;

public class Restoran {
	private String naziv;
	private VrstaHrane hrana;
	private int ocena;
	private GregorianCalendar datumProcene;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.isEmpty()) {
			System.out.println("GRESKA");
		} else {
			this.naziv = naziv;
		}
	}
	public VrstaHrane getHrana() {
		return hrana;
	}
	public void setHrana(VrstaHrane hrana) {
		this.hrana = hrana;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		if(ocena>=1 && ocena<=5) {
			this.ocena = ocena;
		} else {
			System.out.println("GRESKA");
		}
	}
	public GregorianCalendar getDatumProcene() {
		return datumProcene;
	}
	public void setDatumProcene(GregorianCalendar datumProcene) {
		if(datumProcene==null) {
			System.out.println("GRESKA");
		} else {
			this.datumProcene = datumProcene;
		}	
	}
	
	@Override
	public String toString() {
		return "NAZIV: " +naziv+ " OCENA: " +ocena+ " VRSTA HRANE: "
				+hrana+ " DATUM: " +datumProcene.getTime();
	}
}
