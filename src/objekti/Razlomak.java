package objekti;

public class Razlomak {
	int brojilac;
	int imenilac;
	
	public Razlomak(int br, int im) {
		brojilac = br;
		imenilac = im;
	}

	@Override
	public String toString() {
		return "Razlomak: " + brojilac + "/" + imenilac ;
	}

	

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}?????*/
		if (!(obj instanceof Razlomak)) {
			return false;
		}
		
		Razlomak noviRazlomak = (Razlomak) obj;
		if (brojilac != noviRazlomak.brojilac) {
			return false;
		}
		if (imenilac != noviRazlomak.imenilac) {
			return false;
		}
		return true;
	}
	
	
}
