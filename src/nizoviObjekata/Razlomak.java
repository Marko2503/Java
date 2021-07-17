package nizoviObjekata;

public class Razlomak {
	private int brojilac;
	private int imenilac;
	
	public Razlomak(int brojilac, int imenilac) {
		this.brojilac = brojilac;
		this.imenilac = imenilac;
	}

	public int getBrojilac() {
		return brojilac;
	}
	
	public void setBrojilac(int brojilac) {
		this.brojilac = brojilac;
	}
	
	public int getImenilac() {
		return imenilac;
	}
	
	public void setImenilac(int imenilac) {
		this.imenilac = imenilac;
	}

	@Override
	public String toString() {
		return brojilac+ "/" +imenilac;
	}
}
