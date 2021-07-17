package javaBeans;

public class TelevizorProgram {

	public static void main(String[] args) {
		Televizor t1=new Televizor();
		
		t1.setMarka("Samsung");
		t1.setProgram(5);
		t1.setUkljucen(true);
		
		System.out.println(t1.getMarka());
		System.out.println(t1.getProgram());
		System.out.println(t1.isUkljucen());
		
		
	}
}
