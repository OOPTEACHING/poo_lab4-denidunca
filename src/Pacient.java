
public class Pacient {
	private String nume;
	private String prenume;
	public String diagnostic;
	private String telefon;
	private int id;
	private Doctor doctor;
	
	public Pacient( String nume, String prenume, String diagnostic, String telefon, int id, Doctor doctor)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.diagnostic = diagnostic;
		this.telefon = telefon;
		this.id = id;
		this.doctor = doctor;
	}

	
	public String getNume()
	{
		return this.nume;
	}
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	
	public String getPrenume()
	{
		return this.prenume;
	}
	public void setprenume(String prenume)
	{
		this.prenume = prenume;
	}
	
	public String getDiagnostic()
	{
		return this.diagnostic;
	}
	public void setDiagnostic(String diagnostic)
	{
		this.diagnostic = diagnostic;
	}
	
	public String getTel()
	{
		return this.telefon;
	}
	public void setTel(String telefon)
	{
		this.telefon = telefon;
	}
	
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id= id;
	}
	
	public Doctor getDoctor()
	{
		return this.doctor;
	}
	public void setDoctor(Doctor doctor)
	{
		this.doctor= doctor;
	}
	
	@Override
	public String toString()
	{
		return this.diagnostic.toString();
	}
	
}
