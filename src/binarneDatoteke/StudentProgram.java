package binarneDatoteke;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class StudentProgram {

	public static void main(String[] args) {
		/*Student s1=new Student("Mateja",1998);
		Student s2=new Student("Ana",1999);*/
		
		List<Student> studenti=new LinkedList<>();
		
		studenti.add(new Student("Mateja", 1998));
		studenti.add(new Student("Ana", 1999));
		studenti.add(new Student("Marko", 2000));
		
		/*try (FileOutputStream fos=new FileOutputStream("izlaz.bin"); //upisvanje u binarnu datoteku
			 BufferedOutputStream bos=new BufferedOutputStream(fos);
			 ObjectOutputStream oos=new ObjectOutputStream(bos)) {
			
			//oos.writeObject(s1);
			//oos.writeObject(s2);
			
			for (Student student : studenti) { //upisivanje objekata iz liste u binarnu datoteku
				oos.writeObject(student);
			}
			
			System.out.println("Uspseno upisivanje");
			
		} catch (Exception e) {
			System.out.println("GRESKA");
		}*/
		
		System.out.println();
		
		try (FileInputStream fis=new FileInputStream("izlaz.bin"); //citanje iz binarne datoteke
			 BufferedInputStream bis=new BufferedInputStream(fis);
			 ObjectInputStream ois=new ObjectInputStream(bis)) {
			
			System.out.println("Sadrzaj datoteke: ");
			
			while(true) { //moze i cela while petlja u try catch blok
				try {
					Student student=(Student) ois.readObject();
					System.out.println(" "+student);
				} catch (Exception e) {
					break;
				}
			}
			
			System.out.println("Uspesno citanje");
			
		} catch (Exception e) {
			System.out.println("GRESKA");
		}

	}

}
