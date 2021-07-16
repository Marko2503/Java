package stabla;

public class StablaProgram {

	public static void main(String[] args) {
		/*CvorStabla c1=new CvorStabla(6);
		CvorStabla c2=new CvorStabla(4);
		CvorStabla c3=new CvorStabla(8);
		CvorStabla c4=new CvorStabla(2);
		CvorStabla c5=new CvorStabla(5);
		CvorStabla c6=new CvorStabla(7);
		
		c1.levoDete=c2;
		c1.desnoDete=c3;
		
		c2.levoDete=c4;
		c2.desnoDete=c5;
		
		c3.levoDete=c6;
		c3.desnoDete=null; //moze i ne mora
		
		Stablo stablo=new Stablo();
		
		stablo.koren=c1;
		
		System.out.println(stablo.koren.levoDete.podatak); //pomeranje kroz stablo
		
		Pomoc.ispisStabla(stablo);*/
		
		Stablo s1=new Stablo();
		
		Pomoc.ubaciBST(s1,50,30,80,20,40,70,90,10,25,35,45); //brojevi u nizu se salju redom po nivoima
		
		//Pomoc.ispisStabla(s1);
		
		Pomoc.zameni(s1, 20, 65); //ako nije BST stablo(menja sve brojeve u stablu koji su uneti kao parametar)
		
		//Pomoc.ispisStabla(s1);
		
		Stablo s2=new Stablo();
		
		Pomoc.ubaciBST(s2,5,3,6,2,4);
		
		/*Pomoc.ispisStabla(s2);
		
		System.out.println("Zbir elemenata stabla je: " + s2.zbirElemenataStabla());
		
		System.out.println("Broj elemenata stabla je: " + s2.brojElemenataStabla(s2.koren));
		
		System.out.println("Aritmeticka sredina stabla je: " + s2.aritmetickaSredina(s2.koren));
		
		System.out.println("Maksimalni element stabla je: " + s2.maxElementStabla(s2.koren));
		
		CvorStabla maxCvor=s2.adresaMaxElementaStabla(s2.koren);
		
		System.out.println("Maksimalni element stabla je: " +maxCvor.podatak);
		
		Stablo s3=new Stablo();
		
		Pomoc.ubaciBST(s3,8,4,10,2,6,9,11,1,3,5,7);
		
		Pomoc.ispisStabla(s3);
		
		System.out.print("Preorder ispis: ");
		
		s3.preOrderIspis(s3.koren);
		
		System.out.println();
		
		System.out.print("Inorder ispis: ");
		
		s3.inOrderIspis(s3.koren);
		
		System.out.println();
		
		System.out.print("Postorder ispis: ");
		
		s3.postOrderIspis(s3.koren);
		
		System.out.println();
		
		System.out.println("Postoji: " + s3.daLiPostoji(s3.koren, 3));
		
		System.out.println();
		
		CvorStabla neki=s3.koren.levoDete.desnoDete;
		
		System.out.println("Postoji: " + s3.daLiPostojiCvor(s3.koren,neki));*/
		
		Stablo s4=new Stablo();
		
		Pomoc.ubaciBST(s4,5,3,6,2,4);
		
		/*Pomoc.ispisStabla(s4);
		
		System.out.println("U unetom intervalu ima " + s4.brojElemenataUIntervalu(s4.koren, 3, 7) + " brojeva");
		
		System.out.println("Visina stabla je: " +s4.visinaStabla(s4.koren));*/
		
		Stablo s5=new Stablo();
		
		Pomoc.ubaciBST(s5,5,3,6,1,4,14);
		
		Pomoc.zameni(s5, 5, -10);
		
		/*Pomoc.ispisStabla(s5);
		
		System.out.println("Najveci zbir podstabla datog stabla je: " + s5.najveciZbirPodstabla(s5.koren));*/
		
		Stablo s6=new Stablo();
		
		Pomoc.ubaciBST(s6,5,3,7,1,4,6,8);
		
		Pomoc.zameni(s6, 6, -1);
		
		/*Pomoc.ispisStabla(s6);
		
		System.out.println("Najveci zbir dece je: " +s6.najveciZbirDece(s6.koren));*/
		
		Stablo s7=new Stablo();
		
		Pomoc.ubaciBST(s7,5,3,8,2,4,6,9);
		
		/*Pomoc.ispisStabla(s7);
		
		CvorStabla najlevlji=s7.najlevlji(s7.koren);
		CvorStabla najdesnji=s7.najdesnji(s7.koren);
		
		System.out.println("Najlevlji cvor je: " + najlevlji.podatak);
		System.out.println("Najdesnji cvor je: " +najdesnji.podatak);
		
		s7.ubaciBST(7);
		
		Pomoc.ispisStabla(s7);*/
		
		Stablo s8=new Stablo();
		
		Pomoc.ubaciBST(s8,5,3,8,2,4,7,9);
		
		/*Pomoc.ispisStabla(s8);
		
		CvorStabla neki=s8.koren.desnoDete.levoDete;
		
		s8.ispisiOdKorenaDo(neki);
		
		CvorStabla trezeni=s8.koren.levoDete.desnoDete;
		
		s8.ispisOdKorenaDoR(s8.koren, trezeni);
		
		CvorStabla trazeni=s8.koren.levoDete.levoDete;
		
		s8.ispisiOdTrazenogDoKorena(s8.koren, trazeni);
		
		s8.inOrderSaNivoom(s8.koren,1);*/
		
		Stablo s9=new Stablo();
		
		//Pomoc.ubaciBST(s9,6,2,9,3,10);
		
		//Pomoc.ubaciBST(s9,6,2,9,1,8);
		
		Pomoc.ubaciBST(s9,6,2,9,1,3,8,10);
		
		Pomoc.ispisStabla(s9);
		
		/*CvorStabla trazeni=s9.koren.levoDete.levoDete;
		
		s9.izbaciBST(trazeni);
		
		Pomoc.ispisStabla(s9);*/
		
		/*CvorStabla trazeni=s9.koren.desnoDete;
		
		s9.izbaciBST(trazeni);
		
		Pomoc.ispisStabla(s9);*/
		
		/*CvorStabla trazeni=s9.koren.desnoDete;
		
		s9.izbaciBST(trazeni);
		
		Pomoc.ispisStabla(s9);*/
		
		CvorStabla trazeni=s9.koren.levoDete;
		
		s9.izbaciBST(trazeni);
		
		Pomoc.ispisStabla(s9);
		
	}

}
