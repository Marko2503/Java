package stabla;

public class Stablo {
	CvorStabla koren;
	
	public int zbirElemenataStabla() {
		if(koren==null) {
			throw new RuntimeException("Stablo je prazno");
		}
		
		return zbirElemenataStablaR(koren);
	}
	
	public int zbirElemenataStablaR(CvorStabla cvor) { //zbir elemenata stabla u odnosu na koren
		int zbir;
		
		if(cvor==null) { //kada se dodje do lista
			return 0;
		}
		
		zbir=zbirElemenataStablaR(cvor.levoDete)+zbirElemenataStablaR(cvor.desnoDete)+cvor.podatak;
		
		return zbir;
	}
	
	public int brojElemenataStabla(CvorStabla cvor) {
		int brojac;
		
		if(cvor==null) {
			return 0;
		}
		
		brojac=brojElemenataStabla(cvor.levoDete)+brojElemenataStabla(cvor.desnoDete)+1;
		
		return brojac;
	}
	
	public double aritmetickaSredina(CvorStabla cvor) {
		double aritmetickaSredina;
		
		if(cvor==null) {
			throw new RuntimeException("Stablo je prazno");
		}
		
		aritmetickaSredina=zbirElemenataStabla()/brojElemenataStabla(cvor);
		
		return aritmetickaSredina;
	}
	
	public int maxElementStabla(CvorStabla cvor) {
		if(cvor==null) {
			throw new RuntimeException("Stablo je prazno"); 
		}
		
		return maxElementStablaR(cvor);
	}
	
	public int maxElementStablaR(CvorStabla cvor) {
		if(cvor==null) {
			return Integer.MIN_VALUE;
		}
		
		int maxLevog=maxElementStablaR(cvor.levoDete);
		int maxDesnog=maxElementStablaR(cvor.desnoDete);
		
		return max(maxLevog,maxDesnog,cvor.podatak);
	}
	
	private int max(int... niz) {
		int maxElement=niz[0];
		
		for(int i=0;i<niz.length;i++) {
			if(niz[i]>maxElement) {
				maxElement=niz[i];
			}
		}
		
		return maxElement;
	}
	
	public CvorStabla adresaMaxElementaStabla(CvorStabla cvor) {
		if(cvor==null) {
			return null;
		}
		
		CvorStabla adresaLevog=adresaMaxElementaStabla(cvor.levoDete);
		CvorStabla adresaDesnog=adresaMaxElementaStabla(cvor.desnoDete);
		
		CvorStabla adresaMax=cvor;
		
		if(adresaLevog!=null && adresaMax.podatak<adresaLevog.podatak) {
			adresaMax=adresaLevog;
		} else if(adresaDesnog!=null && adresaMax.podatak<adresaDesnog.podatak) {
			adresaMax=adresaDesnog;
		}
		
		return adresaMax;
	}
	
	public void preOrderIspis(CvorStabla cvor) {
		if(cvor==null) {
			return;
		}
		
		System.out.print(cvor.podatak + " ");
		
		preOrderIspis(cvor.levoDete);
		
		preOrderIspis(cvor.desnoDete);
	}
	
	public void inOrderIspis(CvorStabla cvor) {
		if(cvor==null) {
			return;
		}
		
		inOrderIspis(cvor.levoDete);
		
		System.out.print(cvor.podatak + " ");
		
		inOrderIspis(cvor.desnoDete);
	}
	
	public void postOrderIspis(CvorStabla cvor) {
		if(cvor==null) {
			return;
		}
		
		postOrderIspis(cvor.levoDete);
		
		postOrderIspis(cvor.desnoDete);
		
		System.out.print(cvor.podatak + " ");
	}
	
	public boolean daLiPostoji(CvorStabla cvor,int broj) {
		if(cvor==null) {
			return false;
		}
		
		if(cvor.podatak==broj || daLiPostoji(cvor.levoDete,broj) || daLiPostoji(cvor.desnoDete, broj)) {
			return true;
		}
		
		return false;
	}
	
	public boolean daLiPostojiCvor(CvorStabla cvor,CvorStabla neki) {
		if(cvor==null) {
			return false;
		}
		
		if(cvor==neki || daLiPostojiCvor(cvor.levoDete, neki) || daLiPostojiCvor(cvor.desnoDete, neki)) {
			return true;
		}
		
		return false;
	}
	
	public int brojElemenataUIntervalu(CvorStabla cvor,int dg,int gg) {
		if(dg>gg) {
			throw new RuntimeException("Pogresno unet interval");
		}
		
		if(cvor==null) {
			return 0;
		}
		
		int levo=brojElemenataUIntervalu(cvor.levoDete, dg, gg);
		int desno=brojElemenataUIntervalu(cvor.desnoDete, dg, gg);
		
		if(cvor.podatak>=dg && cvor.podatak<=gg) {
			return levo+desno+1;
		} else {
			return levo+desno;
			}
		}
		
		public int visinaStabla(CvorStabla cvor) {
			if(cvor==null) {
				return 0;
			}
			
			int visinaLevog=visinaStabla(cvor.levoDete);
			int visinaDesnog=visinaStabla(cvor.desnoDete);
			
			return Math.max(visinaLevog, visinaDesnog)+1;
		}
		
		public int najveciZbirPodstabla(CvorStabla cvor) {
			if(cvor==null) {
				throw new RuntimeException("Prazno stablo");
			}
			
			return najveciZbirPodstablaPriv(cvor);
		}
		
		private int najveciZbirPodstablaPriv(CvorStabla cvor) {
			if(cvor==null) {
				return Integer.MIN_VALUE;
			}
			
			int najveciZbirLevog=najveciZbirPodstablaPriv(cvor.levoDete);
			int najveciZbirDesnog=najveciZbirPodstablaPriv(cvor.desnoDete);
			int zbirTrenutnog=zbirElemenataStablaR(cvor);
			
			return max(najveciZbirDesnog,najveciZbirLevog,zbirTrenutnog);
		}
		
		public int najveciZbirDece(CvorStabla cvor) {
			if(cvor==null) {
				throw new RuntimeException("Stablo je prazno");
			}
			
			if(cvor.levoDete==null && cvor.desnoDete==null) {
				throw new RuntimeException("U stablu nema dece");
			}
			
			return najveciZbirDecePriv(cvor);
		}
		
		private int najveciZbirDecePriv(CvorStabla cvor) {
			if(cvor==null) {
				return Integer.MIN_VALUE;
			}
			
			int najveciZbirLevo=najveciZbirDecePriv(cvor.levoDete);
			int najveciZbirDesno=najveciZbirDecePriv(cvor.desnoDete);
			
			if(cvor.levoDete==null && cvor.desnoDete==null) {
				return Integer.MIN_VALUE;
			}
			
			int levoDete;
			int desnoDete;
			
			if(cvor.levoDete!=null) {
				levoDete=cvor.levoDete.podatak;
			} else {
				levoDete=0;
			}
			
			if(cvor.desnoDete!=null) {
				desnoDete=cvor.desnoDete.podatak;
			} else {
				desnoDete=0;
			}
			
			int trenutniZbirDece=levoDete+desnoDete;
			
			return max(najveciZbirDesno,najveciZbirLevo,trenutniZbirDece);
		}
		
		public CvorStabla najlevlji(CvorStabla cvor) {
			if(cvor==null) {
				return null;
			}
			
			CvorStabla pom=cvor;
			
			while(true) {
				if(pom.levoDete==null) {
					return pom;
				} else {
					pom=pom.levoDete;
				}
			}
		}
		
		public CvorStabla najdesnji(CvorStabla cvor) {
			if(cvor==null) {
				return null;
			}
			
			CvorStabla pom=cvor;
			
			while(true) {
				if(pom.desnoDete==null) {
					return pom;
				} else {
					pom=pom.desnoDete;
				}
			}
		}
		
		public void ubaciBST(int broj) {
			CvorStabla noviCvor=new CvorStabla(broj);
			
			if(koren==null) {
				koren=noviCvor;
				return;
			}
			
			CvorStabla pom=koren;
			
			while(true){
				if(broj<pom.podatak) { //idem levo
					if(pom.levoDete==null) {
						pom.levoDete=noviCvor;
						return;
					} else {
						pom=pom.levoDete;
					}
				} else { //idem desno
					if(pom.desnoDete==null) {
						pom.desnoDete=noviCvor;
						return;
					} else {
						pom=pom.desnoDete;
					}
				}
			}
		}
		
		public void ubaciBST(int...niz) {
			for(int i=0;i<niz.length;i++) {
				ubaciBST(niz[i]);
			}
		}
		
		public void ispisiOdKorenaDo(CvorStabla trazeni) {
			if(!daLiPostojiCvor(koren, trazeni)) {
				System.out.println("Poslati cvor se ne nelazi u stablu");
				return;
			}
			
			System.out.print("Ispis od korena do trazenog cvora: ");
			
			CvorStabla pom=koren;
			
			while(true) {
				System.out.print(pom.podatak + " ");		
				
				if(pom==trazeni) {
					return;
				}
				
				if(daLiPostojiCvor(pom.levoDete, trazeni)) { //neki je levo
					pom=pom.levoDete;
				} else { //neki je desno
					pom=pom.desnoDete;
				}
			}
		}
		
		public void ispisOdKorenaDoR(CvorStabla cvor,CvorStabla trazeni) {
			if(daLiPostojiCvor(cvor, trazeni)) {
				System.out.print("Od korena do trazenog: ");
				ispisiOdKorenaDoRPriv(cvor, trazeni);
			} else {
				System.out.println("Uneti cvor ne postoji u stablu");
			}
		}
		
		private void ispisiOdKorenaDoRPriv(CvorStabla cvor,CvorStabla trazeni) {
			System.out.print(cvor.podatak + " ");
			
			if(cvor==trazeni) {
				return;
			}
			
			if(daLiPostojiCvor(cvor.levoDete, trazeni)) {
				ispisiOdKorenaDoRPriv(cvor.levoDete, trazeni);
			} else {
				ispisiOdKorenaDoRPriv(cvor.desnoDete, trazeni);
			}
		}
		
		public void ispisiOdTrazenogDoKorena(CvorStabla cvor,CvorStabla trazeni) {
			if(daLiPostojiCvor(cvor, trazeni)) {
				ispisiOdTrazenogDoKorenaPriv(cvor, trazeni);
			} else {
				System.out.println("Uneti cvor ne postoji u stablu");
			}
		}
		
		private void ispisiOdTrazenogDoKorenaPriv(CvorStabla cvor,CvorStabla trazeni) {
			if(cvor==trazeni) {
				System.out.print(cvor.podatak + " ");
				return;
			}
			
			if(daLiPostojiCvor(cvor.levoDete, trazeni)) {
				ispisiOdTrazenogDoKorenaPriv(cvor.levoDete, trazeni);
			} else {
				ispisiOdTrazenogDoKorenaPriv(cvor.desnoDete, trazeni);
			}
			
			System.out.print(cvor.podatak + " ");
		}
		
		public void inOrderSaNivoom(CvorStabla cvor,int nivo) {
			if(cvor==null) {
				return;
			}
			
			inOrderSaNivoom(cvor.levoDete,nivo+1);
			
			System.out.println(cvor.podatak + " nivo: " + nivo);
			
			inOrderSaNivoom(cvor.desnoDete,nivo+1);
		}
		
		public void izbaciBST(CvorStabla trazeni) {
			if(!daLiPostojiCvor(koren, trazeni)) {
				return;
			}
			
			CvorStabla pom=koren;
			CvorStabla roditelj=null;
			
			while(true) {
				if(pom==trazeni) {
					break;
				}
				
				if(daLiPostojiCvor(pom.levoDete, trazeni)) {
					roditelj=pom;
					pom=pom.levoDete;
				} else {
					roditelj=pom;
					pom=pom.desnoDete;
				}
			}
			
			if(trazeni==koren) { //uslov za koren
				if(koren.levoDete==null && koren.desnoDete==null) { //koren je jedini element u stablu
					koren=null;
					return;
				}
				
				if(koren.levoDete==null) { //koren je polulist
					koren=koren.desnoDete;
					return;
				}
				
				if(koren.desnoDete==null) {
					koren=koren.levoDete;
					return;
				}
				
				CvorStabla najdesniji=najdesnji(trazeni.levoDete); //koren je unutrasnji cvor
				
				trazeni.podatak=najdesniji.podatak;
				
				izbaciBST(najdesniji);
			}
			
			boolean jeLevoDete=true; 
			
			if(roditelj.desnoDete==trazeni) {
				jeLevoDete=false;
			}
			
			//Izbacivanje lista
			
			if(trazeni.levoDete==null && trazeni.desnoDete==null) { //uslov za list
				if(jeLevoDete) {
					roditelj.levoDete=null;
					return;
				} else {
					roditelj.desnoDete=null;
					return;
				}
			}
			
			//Izbacivanje polulista
			
			if(trazeni.levoDete==null) { //polulist nema levo dete
				if(jeLevoDete) { //polulist je levo dete
					roditelj.levoDete=trazeni.desnoDete;
					return;
				} else { //polulist je desno dete
					roditelj.desnoDete=trazeni.desnoDete;
					return;
				}
			}
			
			if(trazeni.desnoDete==null) { //polulist nema desno dete
				if(jeLevoDete) { //polulist je levo dete
					roditelj.levoDete=trazeni.levoDete;
					return;
				} else { //polulist je desno dete
					roditelj.desnoDete=trazeni.levoDete;
					return;
				}
			}
			
			//Izbacivanje unutrasnjeg cvora
			
			CvorStabla najdesniji=najdesnji(trazeni.levoDete);
			
			trazeni.podatak=najdesniji.podatak;
			
			izbaciBST(najdesniji);
			
		}
	}
	
