package ro.ase.cts.program;
import ro.ase.cts.clase.*;
public class Main {
	
	//https://acs.ase.ro/Media/Default/documents/cts/curs/DiagrameDesignPatterns.pdf
	
	public static void main(String[] args) {
		
		BrokerTranzactie broker1=BrokerTranzactie.getInstance();//getinstance()- vzibil din exteriorul clasei pt ca e public
		BrokerTranzactie broker2=BrokerTranzactie.getInstance();
		
		System.out.println(broker1.toString());//gigica 10 100
		System.out.println(broker2.toString());//gigica 10 100
		
		broker1.setNume("alina");//alina 10 100
		broker2.setNrTranzactiiEfectuate(9);//gigica 10 9?NU- alina 10 9- referinta!
		
		System.out.println(broker1.toString());//alina 10 9-referinta!
		System.out.println(broker2.toString());//broker2 se schimba cu broker1
		
		BrokerTranzactieLazy brokerLazy1=BrokerTranzactieLazy.getInstance("Ana", 2, 30);//borkertrlzay devine ana,2,30
		BrokerTranzactieLazy brokerLazy2=BrokerTranzactieLazy.getInstance("Bianca", 4, 60);//nu se modifica deoarece ne folosim de aceeasi clasa BrokerTrLazy
		//careia i-am setat deja atributul brokertrlazy

		System.out.println(brokerLazy1.toString());
		System.out.println(brokerLazy2.toString());//ana 2 30, pt ca brokertrlazy nu e null si se intoarce brokertrlazy
		
		//
		Hardware hardware1=Hardware.getInstance("monitor", 550, "calculator");
		Hardware hardware2=Hardware.getInstance("placa video", 680 , "laptop");

		System.out.println(hardware1.toString());
		System.out.println(hardware2.toString());

	}

}
