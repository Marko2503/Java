package stabla;

public class Pomoc {
	
	/////////// BST ubacivanje ////////////
	
	private static void ubaciBST(Stablo stablo, int podatak) {
		CvorStabla noviCvor = new CvorStabla(podatak);
		
		if (stablo.koren == null) {
			stablo.koren = noviCvor;
			return;
		}
		
		CvorStabla trenutni = stablo.koren;
		
		while (true) {
			if (noviCvor.podatak < trenutni.podatak) {
				if (trenutni.levoDete == null) {
					trenutni.levoDete = noviCvor;
					return;
				}
				else {
					trenutni = trenutni.levoDete;
				}
				
			}
			else {
				if (trenutni.desnoDete == null) {
					trenutni.desnoDete = noviCvor;
					return;
				}
				else {
					trenutni = trenutni.desnoDete;
				}
				
			}
		}
		
		
	}
	
	public static void ubaciBST(Stablo stablo, int... niz) {
		for (int x : niz) {
			ubaciBST(stablo, x);
		}
	}
	
	
	
	/////////// ZAMENA ////////////
	
	public static void zameni(Stablo stablo, int zameniOvaj, int ovim) {
		
		zameniR(stablo.koren, zameniOvaj, ovim);
		
	}
	
	private static void zameniR(CvorStabla cvor, int zameniOvaj, int ovim) {
		if (cvor == null) {
			return;
		}
		
		if (cvor.podatak == zameniOvaj) {
			cvor.podatak = ovim;
		}
				
		zameniR(cvor.levoDete, zameniOvaj, ovim);
		zameniR(cvor.desnoDete, zameniOvaj, ovim);
	}
	
	
	
	/////////// ISPIS STABLA ////////////
	
	private static final int PRAZNO_MESTO = Integer.MIN_VALUE;
	// Broj koji je u PRAZNO_MESTO ne sme da ubde u stablu
	
	private static final int ZAUZETO_MESTO = 0; 
	// Ovo moze biti bilo sta osim PRAZNO_MESTO, nema nikakav uticaj
	
	public static void ispisStabla(Stablo stablo) {
		CvorStabla koren = stablo.koren;
		
		if (koren == null) {
			System.out.println("Stablo je prazno");
			return;
		}
		
		int visina = visina(koren);
		
		int[] niz = nizNivoPoNivo(koren);
		
		int[][] mat = konacnaMatrica(visina);
		
		nizUMatricu(mat, niz);
		
		mat = smanjiMatricuSLeva(mat);
		
		konacniPrint(mat);
	}

	
	
	
	private static int visina(CvorStabla koren) {
		if (koren == null) {
			return 0;
		}
		
		return 1 + Math.max(visina(koren.levoDete), visina(koren.desnoDete));        
		
	}
	
	
	private static int[] nizNivoPoNivo(CvorStabla koren) {
		int visina = visina(koren);
		int brElemenata = (int) (Math.pow(2, visina) -1);
//		int brListova = (int) Math.pow(2, visina-1);
		int velicinaNizova = (int) Math.pow(2, visina); // kao br listova za stablo koje je vise za 1
		
		CvorStabla[] niz1 = new CvorStabla[velicinaNizova];
		int n1 = 0;
		
		CvorStabla[] niz2 = new CvorStabla[velicinaNizova];
		int n2 = 0;
		
		CvorStabla[] pomocni;
		
		int[] konacniNiz = new int[brElemenata];
		int nKonacnog = 0;
		
		niz1[n1++] = koren;
		
		for (int z = 0; z<visina; z++) {
			
			for (int i =0; i<n1; i++) {
				
				if (niz1[i] != null) {
					konacniNiz[nKonacnog++] = niz1[i].podatak;
					
					niz2[n2++] = niz1[i].levoDete;
					
					niz2[n2++] = niz1[i].desnoDete;
				}
				else {
					konacniNiz[nKonacnog++] = PRAZNO_MESTO;
					
					niz2[n2++] = null;
					
					niz2[n2++] = null;
				}
				
				
				
			}
			
			pomocni = niz1;
			
			niz1 = niz2;
			n1 = n2;
			
			niz2 = pomocni;
			n2 = 0;
		}
		
		return konacniNiz;
	}

	
	private static void popuniMatricuPraznimMestima(int[][] mat) {
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[0].length; j++) {
				mat[i][j] = PRAZNO_MESTO;
				
			}
			
		}
		
	}
	
	private static void popuniRedZauzetimMestima(int[][] mat, int red, int poc, int kraj) {
		if (red == mat.length) {
			return;
		}
		
		int pola = (kraj - poc)/2 + poc;
		
		mat[red][pola] = ZAUZETO_MESTO;  
		
		popuniRedZauzetimMestima(mat, red+1, poc, pola-1);
		popuniRedZauzetimMestima(mat, red+1, pola+1, kraj);
		
	}
	
	private static void napraviMatricu(int[][] mat) {
		
		popuniMatricuPraznimMestima(mat);
		popuniRedZauzetimMestima(mat, 0, 0, mat[0].length-1);
		
	}
	
	private static int[][] konacnaMatrica(int visina) {
		
		int brListova = (int) Math.pow(2, visina-1);
		
		int brRedova = visina;
		int brKolona = brListova*2 - 1;
		 
		int[][] mat = new int[brRedova][brKolona];
		
		napraviMatricu(mat);
		
		return mat;
		
	}



	private static void nizUMatricu(int[][] mat, int[] niz) {
		
		int n = 0;
		
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[0].length; j++) {
				if (mat[i][j] == ZAUZETO_MESTO) {
					mat[i][j] = niz[n++];
				}
				
			}
		}
		
		
	}

	
	private static int[][] smanjiMatricuSLeva(int[][] mat) {
		int brRedova = mat.length;
		int brKolona = mat[0].length;
		boolean imaNesto;
		
		int prvaKolona = 0;
		
		for (int j = 0; j<brKolona; j++) {
			imaNesto = false;
			
			for (int i = 0; i<brRedova; i++) {
				if (mat[i][j] != PRAZNO_MESTO) {  
					imaNesto = true;
				}
			}
			
			if (imaNesto) {
				prvaKolona = j;
				break;
			}
			
		}
		
		int noviBrKolona = brKolona - prvaKolona;
		
		int[][] novaMat = new int[brRedova][noviBrKolona];
		int novoJ = 0;
		
		for (int i = 0; i<brRedova; i++) {
			novoJ = 0;
			for (int j = prvaKolona; j<brKolona; j++) {
				novaMat[i][novoJ++] = mat[i][j];
				
			}
			
		}
		
		return novaMat;
	}

	
	private static void konacniPrint(int[][] mat) {
		
		System.out.println("\nStablo:\n");
		
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[0].length; j++) {
				
				if (mat[i][j] == PRAZNO_MESTO) {
					System.out.print("  ");
				}
				else {
					System.out.printf("%2d", mat[i][j]);
				}
				
			}
			
			System.out.println("\n");
		}
		
	}
	
	
	
	

	
	
}
