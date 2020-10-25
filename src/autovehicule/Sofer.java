package autovehicule;

public class Sofer {
	private String nume;
	private String prenume;
	private int varsta;
	private int numarPermis;
	
	public Sofer(String nume, String prenume, int varsta, int numarPermis)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.numarPermis = numarPermis;
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
	public void setPrenume (String prenume) {
		this.prenume = prenume;
	}
	
	public int getVartsa() {
		return this.varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public int getNumarPermis() {
		return this.numarPermis;
	}
	public void setNumarPermis(int numarPermis) {
		this.numarPermis = numarPermis;
	}

	@Override
	public String toString()
	{
		return this.nume + " "+ this.prenume.toString();
	}
}
