package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		
		//pb 3 E.Sportiv
		RezervareBuilder rb=new RezervareBuilder();
		Rezervare rezervare1 =rb.setCodRezervare(20).setBauturaInclusa(true).build();

		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(30).setMuzicaAmbientala(true).setGenMuzica("pop")
				.build();
		Rezervare rezervare3 = new Rezervare(false, false, true, false, "", 0);
		
		RezervareBuilder newBuilder=new RezervareBuilder().setMancareInclusa1(true).setBauturaInclusa(true).setBauturaInclusa(true);
		//shallow copy avem
		Rezervare rezervare4=newBuilder.setCodRezervare(80).build();
		Rezervare rezervare5=newBuilder.setCodRezervare(81).build();

		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		System.out.println(rezervare5);


		
		//nu mai avem shallow
		RezervareBuilderV2 builderV2=new RezervareBuilderV2().setMancareInclusa(true)
				.setBauturaInclusa(true).setScaunErgonomic(true).setMuzicaAmbientala(true).setBauturaInclusa(true);
		
		Rezervare rezervare6=builderV2.setCodRezervare(100).build();//datorita constructrului default, de fiecare data
		//se instantiaza un nou obiect tip rezervare
		Rezervare rezervare7=builderV2.setCodRezervare(101).build();
		
		System.out.println(rezervare6);
		System.out.println(rezervare7);
		

		//pb 4 E.Sportiv

		

			
	}

}
