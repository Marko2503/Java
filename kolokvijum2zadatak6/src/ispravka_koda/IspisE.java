package ispravka_koda;

public class IspisE {
	public static void ispisE() {
		for(int i=1;i<=15;i++) {
			if(((i-1)%3)==0 || ((i-2)%6)==0 || ((i-3)%6)==0) {
				System.out.print('0');
			} else {
				System.out.print(' ');
			}
			
			if(i%3==0) {
				System.out.println();
			}
		}
	}

}
