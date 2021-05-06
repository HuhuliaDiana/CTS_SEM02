package ro.ase.cts.program;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		

		ContClient contClient1=new ContClient("Ioana",20,120);
		ContClient contClient2=(ContClient) contClient1.copiaza();
		
		System.out.println(contClient1);
		System.out.println(contClient2);
		
		Bilet biletPrototype=new Bilet(1,"echipa1","echipa2","01 aprilie 2021");
		Bilet bilet1=(Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(101);
		
		Bilet bilet2=(Bilet) biletPrototype.copiaza();
		bilet2.setCodBilet(109);

		System.out.println(bilet1);
		System.out.println(bilet2);

	}

}
