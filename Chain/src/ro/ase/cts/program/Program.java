package ro.ase.cts.program;

import ro.ase.cts.clase.Cont;
import ro.ase.cts.clase.ContCredit;
import ro.ase.cts.clase.ContCurent;
import ro.ase.cts.clase.ContEconomii;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cont contEconomii=new ContEconomii(100);
		Cont contCurent=new ContCurent(400);
		Cont contCredit=new ContCredit(300);

		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(50);
		contCurent.plateste(340);
		contCurent.plateste(50);

		contCurent.plateste(200);
		contCurent.plateste(120);


		

		
	}

}
