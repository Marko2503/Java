package obnavaljanjeJave;

public class Objekti_i_pokazivaci {
	public static void main(String[] args) {
	
	int a=5; //promenljiva celobrojnog tipa
	double b=5.5; //promenljiva realnog tipa
	char c='a'; //promenljiva tipa karakter
	
	int [] niz1= {1,2,3}; //struktura koja ima adresu i pokazivac na prvi element
	int [] niz2=new int[3]; //prrazan niz sa tri mestima za 3 elementa
	int [] niz3=niz1;
	
	System.out.println(niz1[0]);
	
	niz3[0]=10;
	
	System.out.println(niz1[0]);
	
	String s1="blalbalbalblabla"; //promenjiva tipa String koja cuva niz karaktera
	String s2=new String("blablalbalbl");
	
	Razlomak r1=new Razlomak(3, 2); //kreiranje objekta(r1 je pokazivac na razlomak)
	
	System.out.println("Razlomak je " +r1.brojilac+"/"+r1.imenilac);
	
	r1.brojilac=7;
	
	System.out.println("Razlomak je " +r1.brojilac+"/"+r1.imenilac);
	
	}
}
