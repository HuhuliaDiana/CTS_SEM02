package ro.ase.cts.program;

import ro.ase.cts.clase.ComponentMeniu;
import ro.ase.cts.clase.Element;
import ro.ase.cts.clase.Sectiune;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComponentMeniu meniu= new Sectiune("meniu");
		
		ComponentMeniu sectiuneBauturi=new Sectiune("bauturi");
		
		ComponentMeniu sectiuneDesert=new Sectiune("desert");
		
		ComponentMeniu elementCafea=new Element("cafea");
		
		ComponentMeniu elementFrappe=new Element("frappe");
		
		ComponentMeniu elementTiramisu=new Element("tiramisu");
		
		//
		
		sectiuneBauturi.adaugaNod(elementCafea);
		
		sectiuneBauturi.adaugaNod(elementFrappe);
		
		sectiuneDesert.adaugaNod(elementTiramisu);
		
		meniu.adaugaNod(sectiuneBauturi);
		
		meniu.printeaza();
		
		sectiuneBauturi.stergeNod(elementFrappe);
		
		sectiuneDesert.adaugaNod(elementFrappe);
		
		meniu.printeaza();


		
	}

}
