package nizoviObjekata;

public class RazlomakProgram {

	public static void main(String[] args) {
		Razlomak r1=new Razlomak(1, 2);
		Razlomak r2=new Razlomak(1, 3);
		Razlomak r3=new Razlomak(1, 4);
		
		Razlomak[] nizRazlomaka= {r1,r2,r3};
		
		System.out.println(nizRazlomaka[0]);
		
		r1.setImenilac(10); //menja se i nizu jer se menja sadrzaj memorijske lokacije(pokazuje na nesto sto vec postoji u memoriji)
		
		System.out.println(nizRazlomaka[0]);
		
		nizRazlomaka[0].setBrojilac(5);
		
		System.out.println(nizRazlomaka[0]);

	}

}
