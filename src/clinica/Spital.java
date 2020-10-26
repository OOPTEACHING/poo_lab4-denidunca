package clinica;
public class Spital {
	public static final int LOCURI = 2;
	public Pacient[] pacienti;
	private int locLiberIndex;

	public Spital() {
		pacienti = new Pacient[LOCURI];
	}

	public int getIndex() {
		return this.locLiberIndex;
	}

	public void setIndex(int locLiberIndex) {
		this.locLiberIndex = locLiberIndex;
	}

	public void addPacient(Pacient pacient) {
		if (locLiberIndex < LOCURI) {
			this.pacienti[locLiberIndex] = pacient;
			this.locLiberIndex++;
		} else {
			System.out.println("Pacientul nu a putut fi adaugat");
		}
	}
}
