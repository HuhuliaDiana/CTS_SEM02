package ro.ase.cts.program;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new Rezervare(5,2,14);
		Rezervare rezervare2=new Rezervare(1,2,14);
		Rezervare rezervare3=new Rezervare(9,2,13);
		
		
		FlyweightFactory fabrica=new FlyweightFactory();
		fabrica.getClient("0720878738").printeazaRezervare(rezervare1);
		fabrica.getClient("0722222222").printeazaRezervare(rezervare1);;
		fabrica.getClient("0721111111").printeazaRezervare(rezervare1);;
		
		//concatenam simplefactory si flyweight n cadrul existentei unei companii


		


	}
}
