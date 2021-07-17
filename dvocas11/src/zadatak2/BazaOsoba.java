package zadatak2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BazaOsoba {
	private List<Osoba> osobe=new ArrayList<Osoba>();
	
	public void dodajOsobu(Osoba novaOsoba) {
		osobe.add(novaOsoba);
	}
	
	public void sacuvajUFajl(String imeFajla) throws IOException {
		ObjectOutputStream out=new ObjectOutputStream(
							new FileOutputStream(
							new File(imeFajla)));
		
		for(Osoba os: osobe) {
			out.writeObject(os);
		}
		
		out.close();
	}
	
	public void ucitajIzFajla(String imeFajla) throws IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(
							new FileInputStream(
							new File(imeFajla)));
		
		osobe.clear(); //prazni listu
		
		while(true) { // true ne zna se do kada se izvrsava petlja
			try {
				Osoba os=(Osoba) ois.readObject(); //citanje iz fajla
				osobe.add(os);
			} catch(EOFException ex) {
				break;
			}
		}
		
		ois.close();
	}

	public List<Osoba> getOsobe() {
		return osobe;
	}
	
	public void pronadjiOsobe(String ime,String prezime) throws IOException {
		ObjectInputStream ois=new ObjectInputStream(
							new FileInputStream(
							new File("pretraga.ser")));
		
	
	}
}
