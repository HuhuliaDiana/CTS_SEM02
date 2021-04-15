package ro.ase.cts.clase;

public class NotaDePlata implements NotaAbstracta {

	private float suma;
	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		System.out.println("Suma de plata este "+suma);
		
	}
	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}

}
