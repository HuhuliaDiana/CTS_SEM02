package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String,Flyweight> clienti;
	public Flyweight getClient(String nrTelefon) {
		Flyweight client=clienti.get(nrTelefon);
		if(client==null) {
			client=new Client("Ana",nrTelefon,"dh@gmail.com");
			clienti.put(nrTelefon,client);
		}
		return client;
		
	}
	public FlyweightFactory() {
		super();
		this.clienti=new HashMap<String,Flyweight>();
	}
	

}
