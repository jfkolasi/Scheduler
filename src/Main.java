import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <Zadanie> lista = new ArrayList<Zadanie>();
		
		Zadanie zadanie = new Zadanie("Zadanie z matematyki");
		lista.add(zadanie);
		lista.add(new Zadanie("Zadanie z polskiego"));
		
		for (Zadanie z: lista)
		{
			z.print();	
		}

}

}
