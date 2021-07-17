package izuzeci;

public class Student {
	private String ime;
	private int godiste;
	private String smer;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime==null || ime.isEmpty()) {
			throw new RuntimeException("Uneto ime je null");
		} else {
			this.ime = ime;
		}
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		if(godiste<1920) {
			throw new PremaliBrojGreska("Premali broj");
		}
		
		if(godiste>2021) {
			throw new ArithmeticException("Prevelik broj");
		}
		this.godiste = godiste;
	}
	
	public String getSmer() {
		return smer;
	}
	public void setSmer(String smer) throws Exception {
		if(smer==null) {
			throw new Exception();
		} else {
			this.smer = smer;
		}
	}
	
	
	
	
}
