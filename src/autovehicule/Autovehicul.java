package autovehicule;

public class Autovehicul {

	private final String motor = "Diesel";
	private String marca;
	private String culoare;
	private int vitezaCurenta;
	private int treapta;
	private int vitezaMaxima;
	private int numarulDeTrepte;
	private Sofer sofer;
	private Rezervor rezervor;

	public Autovehicul(String marca, String culoare, int vitezaCurenta, int treapta, int vitezaMaxima,
			int numarulDeTrepte, Sofer sofer, Rezervor rezervor) {
		this.marca = marca;
		this.culoare = culoare;
		this.vitezaCurenta = vitezaCurenta;
		this.treapta = treapta;
		this.vitezaMaxima = vitezaMaxima;
		this.numarulDeTrepte = numarulDeTrepte;
		this.sofer = sofer;
		this.rezervor = rezervor;
	}

	public Autovehicul() {
		this("Dacia", "Alb", 10, 1, 200, 5, new Sofer("Pop", "Viorel", 53, 123), new Rezervor(100, 20));
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return this.culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public Sofer getSofer() {
		return this.sofer;
	}

	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}

	public Rezervor getRezervor() {
		return this.rezervor;
	}

	public void setRezervor(Rezervor rezervor) {
		this.rezervor = rezervor;
	}

	public void accelerare(int vitezaAccelerare) {
		if (vitezaCurenta + vitezaAccelerare <= vitezaMaxima) {
			this.vitezaCurenta += vitezaAccelerare;
			System.out.println("Viteza curenta = " + vitezaCurenta);
		} else {
			System.out.println("Depaseste viteza maxima");
		}

	}

	public void decelerare(int vitezaDecelerare) {
		if (vitezaCurenta - vitezaDecelerare >= 0) {
			this.vitezaCurenta -= vitezaDecelerare;
			System.out.println("Viteza curenta = " + vitezaCurenta);

		} else {
			System.out.println("Masina nu a decelerat");
		}

	}

	public void trepte_de_viteza(int treaptaSchimbata) {
		if (treapta != treaptaSchimbata && treaptaSchimbata <= numarulDeTrepte) {
			this.treapta = treaptaSchimbata;
			System.out.println("Treapta de viteza actuala este " + treapta);
		} else {
			System.out.println("Treapta de viteza nu se schimba sau nu exista");
		}
	}

	public void oprire() {
		if (vitezaCurenta == 0) {
			System.out.println("Masina este oprita");
		}
	}

	@Override
	public String toString() {
		return this.marca + " " + this.culoare.toString();
	}
}
