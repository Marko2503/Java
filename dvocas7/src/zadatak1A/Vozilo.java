package zadatak1A;

public class Vozilo {
	private String registarskiBroj;

	public String getRegistarskiBroj() {
		return registarskiBroj;
	}

	public void setRegistarskiBroj(String registarskiBroj) {
		this.registarskiBroj = registarskiBroj;
	}

	@Override
	public String toString() {
		return "Registarski broj: " + registarskiBroj;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //provera da li se objekat poredi sa samim sobom
			return true;
		if (obj == null) //provera da li objkat postoji
			return false;
		if (getClass() != obj.getClass()) //poredi klasu objekta metode equals i klasu objekta prosledjenog kao parametar(slicno kao instanceoff)
			return false;
		
		Vozilo other = (Vozilo) obj;
		if (registarskiBroj == null) {
			if (other.registarskiBroj != null)
				return false;
		} else if (!registarskiBroj.equals(other.registarskiBroj)) //provera da li su registarski brojevi razliciti
			return false;
		return true;
	}
	
	
	
	
}
