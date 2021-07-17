package klase;

public class MetodeProgram {

	public static void main(String[] args) {
		Metode o=new Metode();
		
		//o.pozdrav();
		//o.ispisiOd0DoN(10);
		//System.out.println("Faktorijel unetog broj je: " +o.faktorijel(6));
		System.out.println("Zbir cifara unetog broja je: " +o.zbirCifara(121));
		System.out.println("Broj cifara unetog broja je: " +o.brojCifara(121));
		System.out.println("Aritemticka sredina unetog broja je: " +o.aritmetickaSredinaCifara(125));
		System.out.println("Faktorijel unetog broja je: " +Metode.faktorijel(4)); //poziv staticke metode
	}
}
