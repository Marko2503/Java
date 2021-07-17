package prijemni;

import java.io.Serializable;

import prijemni.izuzeci.PrijemniException;

public class PrijemniIspit implements Serializable{
	private String nazivUstanove;
	private int godinaUpisa;
	private int brojMesta;
	private int brojPrijavljenih;
	
	public String getNazivUstanove() {
		return nazivUstanove;
	}
	public void setNazivUstanove(String nazivUstanove) {
		if(nazivUstanove==null || nazivUstanove.length()<5) {
			throw new PrijemniException("Los unos");
		} else {
			this.nazivUstanove = nazivUstanove;
		}
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		if(godinaUpisa<0) {
			throw new PrijemniException("Los unos");
		} else {
			this.godinaUpisa = godinaUpisa;
		}
	}
	public int getBrojMesta() {
		return brojMesta;
	}
	public void setBrojMesta(int brojMesta) {
		if(brojMesta<0) {
			throw new PrijemniException("Los unos");
		} else {
			this.brojMesta = brojMesta;
		}
	}
	public int getBrojPrijavljenih() {
		return brojPrijavljenih;
	}
	public void setBrojPrijavljenih(int brojPrijavljenih) {
		if(brojPrijavljenih<0) {
			throw new PrijemniException("Los unos");
		} else {
			this.brojPrijavljenih = brojPrijavljenih;
		}
	}
	
	@Override
	public String toString() {
		double odnos=(double)brojPrijavljenih/brojMesta;
		
		return "PrijemniIspit [nazivUstanove=" + nazivUstanove + ", godinaUpisa=" + godinaUpisa + ", brojMesta="
				+ brojMesta + ", brojPrijavljenih=" + brojPrijavljenih + "odnos=" +odnos+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PrijemniIspit)) {
			return false;
		}
		PrijemniIspit other = (PrijemniIspit) obj;
		if (brojMesta != other.brojMesta) {
			return false;
		}
		if (brojPrijavljenih != other.brojPrijavljenih) {
			return false;
		}
		if (godinaUpisa != other.godinaUpisa) {
			return false;
		}
		if (nazivUstanove == null) {
			if (other.nazivUstanove != null) {
				return false;
			}
		} else if (!nazivUstanove.equals(other.nazivUstanove)) {
			return false;
		}
		return true;
	}
}
