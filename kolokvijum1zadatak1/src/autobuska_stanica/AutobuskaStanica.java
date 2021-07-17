package autobuska_stanica;

public class AutobuskaStanica {
	Polazak[] polasci=new Polazak[100];
	
	public void unesiPolazak(Polazak novPolazak) {
		if(novPolazak==null) {
			System.out.println("GRESKA");
			return;
		}
		
		for(int i=0;i<polasci.length;i++) {
			if(polasci[i]==null) {
				polasci[i]=novPolazak;
				return;
			}
		}
		
		System.out.println("GRESKA"); //ako dodje do ove linije niz je pun
	}
	
	public boolean rezervisiKarte(String destinacija,int brojKarata) {
		for(int i=0;i<polasci.length;i++) {
			if(polasci[i]!=null && polasci[i].getDestinacija().equals(destinacija) && polasci[i].getBrojSlobodnihMesta()>=brojKarata) {
				int brojMesta=polasci[i].getBrojSlobodnihMesta();
				polasci[i].setBrojSlobodnihMesta(brojMesta-brojKarata);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean proslediRezervaciju(AutobuskaStanica[] stanice,String destinacija,int brojKarata) {
		boolean status=false;
		
		for(int i=0;i<stanice.length;i++) {
			status=stanice[i].rezervisiKarte(destinacija, brojKarata);
			
			if(status==true) {
				break;
			}
		}
		
		return status;
	}

}
