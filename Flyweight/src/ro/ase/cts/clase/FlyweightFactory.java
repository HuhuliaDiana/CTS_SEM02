package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

//bd a restaurantului
public class FlyweightFactory {
	
	private Map<String,Flyweight> clienti;
	
	//cautam clientul dupa nr de telefon
	public Flyweight getClient(String nrTelefon) {//dc de tip Flyweight?:-?
		
		Flyweight client=clienti.get(nrTelefon);
		
		if(client==null) {
			client=new Client("Ana",nrTelefon,"dh@gmail.com");//pt nrTelefon primit creaza clientul Ana
			clienti.put(nrTelefon,client);
		}
		return client;
		
	}
	
	public FlyweightFactory() {
		super();
		this.clienti=new HashMap<String,Flyweight>();
	}
	

}
