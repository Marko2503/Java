package eskponati.slika;

import eskponati.Eksponat;

public class Slika extends Eksponat{
	private String tehnika;

	public String getTehnika() {
		return tehnika;
	}

	public void setTehnika(String tehnika) {
		this.tehnika = tehnika;
	}

	@Override
	public void ispisi() {
		super.ispisi();
		System.out.println("TEHNIKA: " +tehnika);
	}
}
