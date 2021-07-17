package ispravkaKoda;

public class M {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if(j==0 || j==8 || i==j || i+j==8) {
					System.out.print("0 "); //bitno je taviti space
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
