package ro.ase.cts.clase;

public class Client {
	
	private Strategy strategy;
	private String numeClient;
	public Client(Strategy strategy, String numeClient) {
		super();
		this.strategy = strategy;
		this.numeClient = numeClient;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void platesteNota(float suma) {
		System.out.println();
	}
}
