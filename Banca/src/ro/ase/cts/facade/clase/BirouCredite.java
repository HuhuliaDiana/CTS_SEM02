package ro.ase.cts.facade.clase;

public class BirouCredite {

	//o facem functie, adaugam static
	public static boolean areDatorii(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCNP().charAt(12))%2==0)
		{
			return false;
		}
		else return true;
	}
}
