package ispravkaKoda;

public class MatricaKaraktera {

	public static void main(String[] args) {
		String [] nizStringova= {"abcde","fghij","klmno","pqrst","uvyxy"};
		
		//System.out.println(nizStringova[1]);
		
		/*for(int i=0;i<nizStringova.length;i++) {
			System.out.println(nizStringova[i]);
		}*/
		
		System.out.println(nizStringova[0].charAt(0)); //brojevi u zagradama predstavljaju indekse elemenata u matrici karaktera
		
		for(int i=0;i<nizStringova.length;i++) {
			for(int j=0;j<nizStringova[i].length();j++) {     //j<5, if(j<nizStringova[i].length()) {ispis} else{drugi ispis}
				System.out.print(nizStringova[i].charAt(j));
			}
			
			System.out.println();
		}
	}

}
