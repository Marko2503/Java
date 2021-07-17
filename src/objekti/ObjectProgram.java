package objekti;

public class ObjectProgram {

	public static void main(String[] args) {
		Object obj=new Razlomak(1, 5);
		
		if(obj instanceof Razlomak) {
			System.out.println("pokazuje");
		}
		
		System.out.println(obj);

	}

}
