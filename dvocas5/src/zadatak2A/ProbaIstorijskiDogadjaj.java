package zadatak2A;

public class ProbaIstorijskiDogadjaj {

	public static void main(String[] args) {
		IstorijskiDogadjaj id=new IstorijskiDogadjaj("Bombardovanje Beograda u II svetskom ratu", 1941, 4, 6);
		
		
		System.out.println("Dogadjaj se odigrao pre " +id.vratiPreKoliko()+ " godina"); //ne trebaju objekti jer se radi preko konstruktora
		System.out.println(id.vratiNaopako());
		}
}
