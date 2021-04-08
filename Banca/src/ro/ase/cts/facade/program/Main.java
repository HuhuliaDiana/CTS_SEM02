package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("2990201223332","Andreea");
		if (Facade.esteEligibil(persoana)) {
			System.out.println("oferim creditul");
		}else {
			System.out.println("nu oferim creditul");
		}

	}

}
