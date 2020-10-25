
public class Spital {
	public static final int locuri = 2;
	public Pacient[] pacienti;
	private int locLiberIndex;
	
	public Spital()
	{
		pacienti = new Pacient[locuri];
	}
	
	public int getIndex()
	{
		return this.locLiberIndex;
	}
	public void setIndex(int locLiberIndex)
	{
		this.locLiberIndex = locLiberIndex;
	}
	
	public void addPacient(Pacient pacient)
	{
		if(locLiberIndex < locuri )
		{
			this.pacienti[locLiberIndex] = pacient;
			this.locLiberIndex++;
		}
		else
		{
			System.out.println("Pacientul nu a putut fi adaugat");
		}
	}
}
