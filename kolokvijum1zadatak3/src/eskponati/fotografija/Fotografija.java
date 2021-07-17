package eskponati.fotografija;

import eskponati.Eksponat;

public class Fotografija extends Eksponat {

	@Override
	public void ispisi() {
		super.ispisi();
		System.out.println("Eksponat je fotografija");
	}
}
