package autovehicule;

public class Rezervor {
	private int capacitateMaxima;
	private int nivelCurent;
	
	public Rezervor( int capacitateMaxima, int nivelCurent)
	{
		this.capacitateMaxima = capacitateMaxima;
		this.nivelCurent = nivelCurent;
		
	}
	public int getCapacitateMaxima() {
		return this.capacitateMaxima;
	}

	public void setCapacitateMaxima(int capacitateMaxima) {
		this.capacitateMaxima = capacitateMaxima;
	}
	
	public int getNivelCurent() {
		return this.nivelCurent;
	}

	public void setNivelCurent(int nivelCurent) {
		this.nivelCurent = nivelCurent;
	}

	public void umplere(int cantitate) 
	{
		if(nivelCurent + cantitate <= capacitateMaxima)
		{
			this.nivelCurent += cantitate;
			System.out.println("Nivelul curent este = " + nivelCurent);
		}
		else
		{
			System.out.println("S-a atins capacitatea maxima");
		}
		
	}

	public void golire(int cantitate)
	{
		if(nivelCurent != 0)
		{
			this.nivelCurent -= cantitate;
			if(nivelCurent <=0)
			{
				System.out.println("Rezervorul este gol");
			}
			else 
			{
				System.out.println("Rezervorul contine"+ nivelCurent);
			}
		}
		else
		{
			System.out.println("Rezervorul este deja gol");
		}
	}
}
