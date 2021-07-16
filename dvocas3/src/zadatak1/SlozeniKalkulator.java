package zadatak1;

class SlozeniKalkulator {

	double podeli(double a, double b) {
		return a / b;
	}

	int podeli(int a, int b) {
		return a / b;
	}

	int podeliMod(int a, int b) {
		return a % b;
	}

	void ispisi50Puta(int x) {
		for (int i = 1; i <= 50; i++)
			System.out.println(x);
	}

	void ispisi1Do100() {
		for (int i = 1; i <= 100; i++)
			System.out.println(i);
	}

	static int suma(int n) {
		int suma = 0;

		for (int i = 1; i <= n; i++)
			suma = suma + i;

		return suma;
	}

	static double stepenX(double x, int n) {
		double st = 1;

		for (int i = 1; i <= n; i++)
			st = st * x;

		return st;
	}

	static int minStepenDva(int broj) {
		int rezultat = 1;

		while (rezultat < broj)
			rezultat = rezultat * 2;

		return rezultat;
	}

	static void deliSaDva(int broj) {

		while (broj > 1) {
			broj = broj / 2;
			System.out.println(broj);
		}

	}

}
