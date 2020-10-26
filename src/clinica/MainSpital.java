package clinica;

public class MainSpital {

	public static void main(String[] args) {

		Doctor doctor = new Doctor("Ionescu", "Viorica", "Oftalmolog", "078888856", 22);

		Pacient pacient = new Pacient("Pop", "Gigel", "Miopie", "0722333433", 123, doctor);
		Pacient pacient2 = new Pacient("Popescu", "Gigela", "Astigmatism", "0725555433", 523, doctor);

		Spital spital = new Spital();

		spital.addPacient(pacient);
		System.out.println(spital.getIndex());

		spital.addPacient(pacient2);
		System.out.println(spital.getIndex());

	}

}
