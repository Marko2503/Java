package stringovi;

public class StringoviProgram {

	public static void main(String[] args) {
		String s1="recenica";
		String s2="recenica";
		String s3;
		int duzina=s1.length();
		char prviKarakter=s1.charAt(0);
		
		if(s1.equals(s2)) {
			System.out.println("Stringvi su isti");
		}
		
		//s1=s1+s2; //spajanje stringova(+ ima isto znacenje kao System.out.println() )
		s1=s1+15;
		s3=""+15+true; //"" se dodaje jer makar jedan element mora da bude string(moze i u deklaraciji s3 da se dodaju "")
		
		//s1="neka druga recenica"; //pravi se nov objekat u memoriji
		
		System.out.println(duzina);
		System.out.println(s3);
		System.out.println(prviKarakter);
		
		//VAZNE METODE
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('c', 3));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.lastIndexOf('e', 7));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace('e', 'R'));
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("15"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		//
		
		String s4="Ivanovic";
		String s5="Djordjevic";
		
		if(s4.compareTo(s5)>0) {
			System.out.println(s5+"je po abecednom redu ispred " +s4);
		} else if(s4.compareTo(s5)<0) {
			System.out.println(s4+"je po abecednom redu ispred " +s5);
		} else {
			System.out.println("Stringovi su isti");
		}
		
		System.out.println(s1.substring(3));
		
		String[]  nizStringova= { //niz stringova
				"Prvi string",
				"Drugi sring",
				"Treci string"
		};
		
		for(int i=0;i<nizStringova.length;i++){
			System.out.println(nizStringova[i]);
		}
		
		String s6="ove je neki string";
		String[] nizReci=s6.split(" ");
		
		for(int i=0;i<nizReci.length;i++) {
			System.out.println(nizReci[i]);
		}
		
	}

}
