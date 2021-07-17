package nizovi;

public class NizoviStatickeMetodeProgram {

	public static void main(String[] args) {
		int[] niz= {1,2,3,4,5};
		int[] niz2= {6,7};
		
		NizoviStatickeMetode.ispisNiza(niz);
		NizoviStatickeMetode.ispisNiza(niz2);
		//NizoviStatickeMetode.ispisForEach(niz);
		
		int[] niz3=NizoviStatickeMetode.spajanjeNizova(niz, niz2);
		NizoviStatickeMetode.ispisNiza(niz3);
		
		System.out.println("Zbir elemnata niza je: " +NizoviStatickeMetode.zbir(niz) );
		
		//niz2=niz ne stvara novi niz u memoriji
		
		//int[] niz2=NizoviStatickeMetode.kopiranjeNiza(niz);
		
		//NizoviStatickeMetode.ispisNiza(niz2);
	}

}
