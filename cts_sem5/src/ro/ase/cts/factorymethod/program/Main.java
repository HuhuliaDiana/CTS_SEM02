package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AsistentFactory;
import ro.ase.cts.factorymethod.clase.FactoryPersonal;
import ro.ase.cts.factorymethod.clase.InfirmierFactory;
import ro.ase.cts.factorymethod.clase.MedicFactory;
import ro.ase.cts.factorymethod.clase.PersonalSpital;

public class Main {//Clientul

	public static void printeazaPersonalSpital(FactoryPersonal factory, String nume) {
		PersonalSpital personal=factory.getPersonal(nume);
		System.out.println(personal.toString());
	}
	public static void main(String[] args) {		
		
		printeazaPersonalSpital(new MedicFactory(), "Maria");
		printeazaPersonalSpital(new AsistentFactory(), "Ion");
		printeazaPersonalSpital(new InfirmierFactory(), "Andrei");
		

	}

}
