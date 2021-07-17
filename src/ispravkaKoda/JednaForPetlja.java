package ispravkaKoda;

public class JednaForPetlja {

	public static void main(String[] args) {
		for(int i=1;i<=25;i++) {
			
			if(i%5==1 || i%5==0 || i<=5 || i>=21) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			
			if(i%5==0) {
				System.out.println();
			}
		}

	}

}
