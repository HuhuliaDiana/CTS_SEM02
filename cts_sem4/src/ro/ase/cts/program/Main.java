package ro.ase.cts.program;
import ro.ase.cts.clase.*;
public class Main {
	
	//https://acs.ase.ro/Media/Default/documents/cts/curs/DiagrameDesignPatterns.pdf
	
	public static void main(String[] args) {
		
		BrokerTranzactie broker1=BrokerTranzactie.getInstance();
		BrokerTranzactie broker2=BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("alina");
		broker2.setNrTranzactiiEfectuate(9);
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy brokerLazy1=BrokerTranzactieLazy.getInstance("Ana", 2, 30);
		BrokerTranzactieLazy brokerLazy2=BrokerTranzactieLazy.getInstance("Bianca", 4, 60);

		System.out.println(brokerLazy1.toString());
		System.out.println(brokerLazy2.toString());


	}

}
