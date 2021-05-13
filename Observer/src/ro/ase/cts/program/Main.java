package ro.ase.cts.program;



import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ManagerSala;
import ro.ase.cts.clase.Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observer client1=new Client("ALIN");
		Observer client2=new Client("ALINA");
		Observer client3=new Client("ALINUTA");
		

		ManagerSala managerSala=new ManagerSala("sala nr 3");
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.trimiteAnuntImportant("Volei");
		
		managerSala.stergereAbonat(client3);
		managerSala.trimiteAnuntImportant("Handbal");


	}

}
