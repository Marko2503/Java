package ispravkaKoda;

public class Pismo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<7;j++) {
				if(j==0 || j==6 || i==0 || i==4 || i==j || i+j==6) {
					System.out.print("0 "); 
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
