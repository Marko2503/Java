package ispravkaKoda;

public class ObrnutiLeviTrougao {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<6-i;j++) { //za uslov se moze koristiti i sam broj koji je granica velike for petlje
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
