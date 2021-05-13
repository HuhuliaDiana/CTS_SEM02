package ro.ase.cts.clase;

public class Client implements Observer {
	
	private String name;

	public Client(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receptioneazaMesaj(String text) {
		// TODO Auto-generated method stub
		System.out.println(name +" ai primit mesajul "+ text);

		
	}
	

}
