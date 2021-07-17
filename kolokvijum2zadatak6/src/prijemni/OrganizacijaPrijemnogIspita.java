package prijemni;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;


import prijemni.izuzeci.PrijemniException;

public class OrganizacijaPrijemnogIspita {
	private List<PrijemniIspit> ustanove=new LinkedList<>();
	
	public void ucitajIzFajlaUListu(String nazivFajla) {
		try (FileInputStream fis=new FileInputStream(nazivFajla); 
				 BufferedInputStream bis=new BufferedInputStream(fis);
				 ObjectInputStream ois=new ObjectInputStream(bis)) {
				
				PrijemniIspit p=new PrijemniIspit();
				
				while(true) { 
				
					
						try {
							if (p.getBrojPrijavljenih()>0) {
								PrijemniIspit prijemni = (PrijemniIspit) ois.readObject();
								System.out.println(" " + prijemni);
							}
						} catch (Exception e) {
							break;
						} 
					
				}
				
				System.out.println("Uspesno citanje");
			
		} catch (PrijemniException e) {
			System.out.println("Greska pri preacivanju podataka");
		} catch (IOException e1) {
			System.out.println("Greskica");
		}
	}
	
	public List<PrijemniIspit> vratiUspesnePrijemneIspite(){
		List<PrijemniIspit> nova=new LinkedList<>();
		
		for (PrijemniIspit prijemniIspit : ustanove) {
			if(prijemniIspit.getGodinaUpisa()==2018 ) {
				int a=prijemniIspit.getBrojPrijavljenih();
				if(prijemniIspit.getGodinaUpisa()==2017) {
					int b=prijemniIspit.getBrojPrijavljenih();
					if(a>b) {
						nova.add(prijemniIspit);
					}
				}
			}
		}
		
		
		return nova;
		
	}
}


