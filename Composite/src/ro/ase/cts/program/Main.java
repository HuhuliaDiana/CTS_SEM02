package ro.ase.cts.program;

import ro.ase.cts.clase.ComponentMeniu;

public class Main {
	private void psvm() {
		// TODO Auto-generated method stub

		ComponentMeniu meniu=new Sectiune("meniu");
		ComponentMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentMeniu sectiuneDesert=new Sectiune("desert");
		ComponentMeniu elementCafea=new Element("cafea");
		ComponentMeniu elementFrappe=new Element"frappe");
		ComponentMeniu elementTiramisu=new Element("tiramisu");
		
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
