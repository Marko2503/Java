package ispravkaKoda;

public class TestProgram {

	public static void main(String[] args) {
		/*for(int i=0;i<5;i++) {
			System.out.println("i= "+i);
			for(int j=0;j<5;j++) {
				System.out.println(" j= " +j);
			}
		}*/
	
		int mat[][]= {
			{1,2,3,4,5},
		    {6,7,8,9,1},
		    {2,3,4,5,6},
		    {7,8,9,1,2},
		    {3,4,5,6,7}
		};
	
		System.out.println(mat[0][0]);
		System.out.println();
	
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i<j) {
					mat[i][j]=0;
				}
			}
		}
		
		ispisMatrice(mat, 5);
	}
	
	static void ispisMatrice(int mat[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println(); //za ispis sledeceg reda matrice
		}
		
		System.out.println();
	}
}

