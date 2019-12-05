
public class Zadanie {

	private String nazwa;
		
	Zadanie (String nazwa)
	{
		this.nazwa = nazwa;
	}
		
	public void zmienNazwe(String nazwa)
	{
		this.nazwa = nazwa;
	}
	
	public void print()
	{
		System.out.println("Zadanie nazwa: "+ this.nazwa);
	}
}
