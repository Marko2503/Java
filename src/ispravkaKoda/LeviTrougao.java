package ispravkaKoda;

public class LeviTrougao {

	public static void main(String[] args) {
	 for(int i=1;i<=5;i++) { //velika for petlja pokazuje broj redova
			for(int j=0;j<i;j++) { //mala for petlja pokazuje broj * u redu (j=1;j<=i)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
