package javaBeans;

public class Televizor {
	private String marka;
	private int program;
	private boolean ukljucen;
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public int getProgram() {
		return program;
	}
	
	public void setProgram(int program) {
		if(program>=0 && program<=50) {
			this.program = program;
		} else {
			System.out.println("GRESKA");
		}
	}
	
	public boolean isUkljucen() {
		return ukljucen;
	}
	
	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	
	

}
