package liste;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentProgram {

	public static void main(String[] args) {
		Student s1=new Student("Marko Markovic", 1998);
		Student s2=new Student("Pera Peric", 1999);
		Student s3=new Student("Mira Miric", 2000);
		Student s4=new Student("Petar Petrovic", 1999);
		Student s5=new Student("Luka Lukic", 2001);
		
		List<Student> studenti=new LinkedList<>(); //pravljenje liste
		
		studenti.size();  
		
		studenti.add(s1); 
		studenti.add(s2);
		studenti.add(s3); //studeni.add(new Student("Mira Miric", 2000))
		studenti.add(s4);
		studenti.add(s5);
		studenti.add(s1);
		/*studenti.add(s1);
		studenti.add(s1);*/
		
		//System.out.println(studenti.size());
		
		Student.ispisListe(studenti);
		
		studenti.add(0, new Student("Miilos Petrovic", 1997));
		
		Student.ispisListe(studenti);
		
		/*studenti.clear();
		
		Student.ispisListe(studenti);*/
		
		//System.out.println(studenti.isEmpty());
		
		System.out.println();
		System.out.println(studenti.get(0));
		
		while(studenti.remove(s1)) { //uklanja sve iste elemente iz liste
			
		}
		
		Student.ispisListe(studenti);
		
		studenti.remove(2);
		
		Student.ispisListe(studenti);
		
		System.out.println(studenti.contains(s1));
		
		/*studenti.remove(s1);
		
		Student.ispisListe(studenti);*/
		
		//s1.setGodiste(2001);
		
		Iterator<Student> iterator=studenti.iterator(); //uvodjenje iteratora
		
		while(iterator.hasNext()) {
			Student student; //pomocna promenljiva za rad sa iteratorom
			student=iterator.next(); //vraca objekat na koji iterator trenutno pokazuje
			
			if(student.getGodiste()>=1998) {
				iterator.remove();
			}
			
		}
		
		System.out.println(studenti);
	}

}
