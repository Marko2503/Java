package zadatak2A;

public class PotrosackaKorpa {
	private Namirnica[] namirnica;
	
	public PotrosackaKorpa(int kapacitetKorpe) {
		if(kapacitetKorpe>0 && kapacitetKorpe<20) {
			namirnica=new Namirnica[kapacitetKorpe];
		} else {
			namirnica=new Namirnica[10];
			System.out.println("GRESKA");
		}
	}
	
	public void dodajUKorpu(Namirnica novaNamirnica) {
		for(int i=0;i<namirnica.length;i++) {
			if(namirnica[i]==null) {
				namirnica[i]=novaNamirnica;
				return;
			}
		}
		
		System.out.println("NEMA MESTA");
		}
	
	public double izracunajUkupnuCenu() {
		double ukupnaCena;
		
		ukupnaCena=0;
		
		for(int i=0;i<namirnica.length;i++) {
			if(namirnica[i]!=null) {
				ukupnaCena=ukupnaCena+namirnica[i].getCena();
			}
		}
		
		return ukupnaCena;
	}
	
	public Namirnica pronadjiNajskuplju() {
		Namirnica najskuplja;
		najskuplja=null;
		
		for(int i=0;i<namirnica.length;i++) {
			if(namirnica[i]!=null) {
				if(najskuplja==null || namirnica[i].getCena()>najskuplja.getCena()) {
					najskuplja=namirnica[i];
				}
			}	
		}
		
		return najskuplja;
	}
}
