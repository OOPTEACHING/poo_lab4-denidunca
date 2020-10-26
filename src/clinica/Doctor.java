package clinica;

public class Doctor {
	private String nume;
	private String prenume;
	private String specializare;
	private String numarTelefon;
	private int birouSpital;

	public Doctor(String nume, String prenume, String specializare, String numarTelefon, int birouSpital) {
		this.nume = nume;
		this.prenume = prenume;
		this.specializare = specializare;
		this.numarTelefon = numarTelefon;
		this.birouSpital = birouSpital;

	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getSpecializare() {
		return this.specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	public String getTelefon() {
		return this.numarTelefon;
	}

	public void setTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public int getBirou() {
		return this.birouSpital;
	}

	public void setBirou(int birouSpital) {
		this.birouSpital = birouSpital;
	}

}
