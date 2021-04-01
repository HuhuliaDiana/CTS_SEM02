package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(20).setBauturaInclusa(true).build();

		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(30).setMuzicaAmbientala(true).setGenMuzica("pop")
				.build();
		Rezervare rezervare3 = new Rezervare(false, false, true, false, "", 0);
		
		RezervareBuilder newBuilder=new RezervareBuilder().setMancareInclusa1(true).setBauturaInclusa(true).setBauturaInclusa(true);
		Rezervare rezervare4=newBuilder.setCodRezervare(80).build();
		Rezervare rezervare5=newBuilder.setCodRezervare(81).build();

		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		

	}

}
