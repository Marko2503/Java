package zadatak1;

import java.util.GregorianCalendar;

public class Knjiga {
	
	private String naziv="";
	private int godina;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null) {
			this.naziv = naziv;
		} else {
			throw new RuntimeException("Naziv ne moze biti NULL");
		}
	}
	
	public int getGodina() {
		return godina;
	}
	
	public void setGodina(int godina) throws Exception {
		int tekucaGodina=new GregorianCalendar().get(GregorianCalendar.YEAR);
		
		if(godina>=1950 && godina<=tekucaGodina) {
			this.godina = godina;
		} else {
			throw new Exception("Godina nije u odgovarajucem opsegu");
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Knjiga)) {
			return false;
		}
		Knjiga other = (Knjiga) obj;
		if (godina != other.godina) {
			return false;
		}
		if (naziv == null) {
			if (other.naziv != null) {
				return false;
			}
		} else if (!naziv.equals(other.naziv)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Knjiga [naziv=" + naziv + ", godina=" + godina + "]";
	}
	
	
	
	

	
}
