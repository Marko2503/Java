package ispravkaKoda;

public class A {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if(i==j-4 || i+j==4 || 
						(i==2 && j>2 && j<6)) { //moguca je i ovakva kombinacija uslova
					System.out.print("0"); 
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	}

