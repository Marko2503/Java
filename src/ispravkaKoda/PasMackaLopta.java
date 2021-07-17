package ispravkaKoda;

public class PasMackaLopta {

	public static void main(String[] args) {
		String[] nizStringova= {"pas","macka","lopta"};
		
		for(int j=0;j<5;j++) { 
			for(int i=0;i<nizStringova.length;i++) {
				if(j<nizStringova[i].length()) {
					System.out.print(nizStringova[i].charAt(j)+ " ");
				} else {
					System.out.print("- ");
				}
			}
			
			System.out.println();
		}

	}

}
