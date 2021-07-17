package eskponati;

public class Eksponat {
	private String naziv;
	private String autor;
	
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor==null || autor.isEmpty() || autor.length()<5) {
			System.out.println("GRESKA");
		} else {
			this.autor = autor;
		}
	}
	
	public void ispisi() {
		System.out.println("NAZIV EKSPONATA: " +naziv);
		System.out.println("AUTOR: " +autor);
	}
	
	

}
