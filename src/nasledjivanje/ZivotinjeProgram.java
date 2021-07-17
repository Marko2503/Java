package nasledjivanje;

public class ZivotinjeProgram {

	public static void main(String[] args) {
		Zivotinja z1=new Zivotinja("Micko");
		Zivotinja z2=new Pas("Dzeki"); //polimorfizam
		Zivotinja z3=new Macka("Zuca");
		
		z1.reciNesto();
		z2.reciNesto();
		z3.reciNesto();
		
		Pas pas1=(Pas) z2; //kastovanje(promena tipa podataka) da bi se omogucio pristup odgovarajucim podacima
		
		pas1.donesi();
	}

}
