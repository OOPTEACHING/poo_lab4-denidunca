package autovehicule;

public class TestDrive {

	public static void simulare(Autovehicul autovehicul, String comanda, int numar) {
		if (comanda.equals("Accelerare")) {
			autovehicul.accelerare(numar);
		} else if (comanda.equals("Decelerare")) {
			autovehicul.decelerare(numar);
		} else if (comanda.equals("Schimba treapta")) {
			autovehicul.trepte_de_viteza(numar);
		} else if (comanda.equals("Oprire")) {
			autovehicul.oprire();
		} else {
			System.out.println("Nu exista comanda");
		}

	}

	public static void main(String[] args) {
		Autovehicul autovehicul = new Autovehicul();
		System.out.println(autovehicul.toString());

		simulare(autovehicul, "Accelerare", 10);

		simulare(autovehicul, "Schimba treapta", 2);

		simulare(autovehicul, "Accelerare", 20);

		simulare(autovehicul, "Schimba treapta", 3);

		simulare(autovehicul, "Decelerare", 30);

		simulare(autovehicul, "Schimba treapta", 1);

		simulare(autovehicul, "Decelerare", 10);

		simulare(autovehicul, "Oprire", 0);

	}

}