
public class Doctor {
	private String nume;
	private String prenume;
	private String specializare;
	private String numarTelefon;
	private int birouSpital;
	
	
	public Doctor( String nume, String prenume, String specializare, String numarTelefon, int birouSpital)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.specializare = specializare;
		this.numarTelefon = numarTelefon;
		this.birouSpital = birouSpital;
		
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
	
	public String getSpeci()
	{
		return this.specializare;
	}
	public void setSpeci(String specializare)
	{
		this.specializare = specializare;
	}
	
	public String getTel()
	{
		return this.numarTelefon;
	}
	public void setTel(String numarTelefon)
	{
		this.numarTelefon = numarTelefon;
	}
	
	public int getBirou()
	{
		return this.birouSpital;
	}
	public void setBirou(int birouSpital)
	{
		this.birouSpital = birouSpital;
	}
		
	
}
