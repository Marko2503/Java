package ispravkaKoda;

public class PismoWhile {

	public static void main(String[] args) {
		int i=0; //mora da se inicijalizuje pre while petlje
		
		while(i<5) {
			int j=0; //mora da se inicijalizuje n pocetku spoljasnje while petlje
			
			while(j<7) {
				if(j==0 || j==6 || i==0 || i==4 || i==j || i+j==6) {
					System.out.print("0 ");
				} else {
					System.out.print("  ");
				}
				
				j++;
			}
			
			System.out.println();
			
			
			i++;
		}

	}

}
