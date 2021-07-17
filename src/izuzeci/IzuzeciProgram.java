package izuzeci;

public class IzuzeciProgram {

	public static void main(String[] args) {
		/*String rec=null;
		
		try {
			System.out.println(rec.length());
			System.out.println("Ovo je try blok");
		} catch (Exception e) { //tip greske koji se hvata
			System.out.println("GRESKA");
		}
		
		System.out.println("Program nije pukao");*/
		
		Student s1=new Student();
		
		try {
			//s1.setIme(null);
			s1.setGodiste(1500);
			System.out.println("Nema greske");
		} /*catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //ispis detalja o izuzetku
		}*/
		
		catch (NullPointerException e1) {
			System.out.println(e1.getMessage());
		}
		
		catch (ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
		
		catch (Exception e) {
			
		}
		
		finally {
			System.out.println("Finally blok");
		}
		
		try {
			s1.setSmer(null);
			System.out.println("Nema greske");
		} catch (Exception e) {
			System.out.println("GRESKA");
		}
	}
}	
