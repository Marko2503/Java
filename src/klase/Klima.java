package klase;

public class Klima {
	String proizvodjac;
	int temperatura;
	boolean ukljucen;
	
	public Klima() { //prazan konstuktor za pravljenje praznog objekta ove klase
		
	}
	
	public Klima(String naziv,int novaTemperatura,boolean ukljucena) {
		proizvodjac=naziv; //this.proizvodjac=proizvodjac
		temperatura=novaTemperatura;
		ukljucen=ukljucena;
	}
	
	void iskljuci() {
		ukljucen=false;
	}
	
	void ukljuci() {
		ukljucen=true;
	}
	
	void povecajTemperaturu() {
		temperatura++;
	}
	
	void smanjiTemperaturu() {
		temperatura--;
	}
	
	void ispis() {
		System.out.println("Proizvodjac: " +proizvodjac);
		System.out.println("Temperatura= " +temperatura);
		System.out.println("Ukljucen: " +ukljucen);
		System.out.println();
	}
	
	void postaviTemperaturu(int novaTemperatura) {
		temperatura=novaTemperatura;
	}
	
	void postaviPodatke(String naziv,int novaTemperatura,boolean ukljucena) {
		proizvodjac=naziv;
		temperatura=novaTemperatura;
		ukljucen=ukljucena;
	}
}

