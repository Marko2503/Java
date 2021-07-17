package zadatak1A;

public class Televizor extends KucniAparat {
	private int program;

	public Televizor() { //nasledjuje osobine konstuktora iz apstrakcije
		super();
		this.program=1;  //mora zbog donjeg konstruktora
	}

	public Televizor(boolean ukljucen, String markaIModel,int program) {
		super(ukljucen, markaIModel);
		
		if(program<1 || program>40) {
			System.out.println("GRESKA");
			this.program=1;
		} else {
			this.program=program;
		}
	}
	
	public Televizor(int program) {
		super();
		this.program = program;
	}

	public void promeniProgram(int noviProgram) {
		if(noviProgram>=1 && noviProgram<=40) {
			program=noviProgram;
		} 
	}
	
	public String toString() {
		return super.toString() + " PROGRAM: " +program; //pozivanje metoda iz klase kucni aparat
	}
}

