package izuzeci;

public class PremaliBrojGreska extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PremaliBrojGreska(String poruka) {
		super(poruka);
	}

}
