package ro.ase.cts.clase;

public class DecoratorNotePasteFericit extends DecoratorAbstract {
	
	public DecoratorNotePasteFericit(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("Felicitare - paste fericit");//ne intoarce doar o felicitare, fara suma de plata
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("paste fericit!");//cee ce se adauga in plus
	}


}
