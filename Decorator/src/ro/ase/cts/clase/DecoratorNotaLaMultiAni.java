package ro.ase.cts.clase;

public class DecoratorNotaLaMultiAni extends DecoratorAbstract {

	public DecoratorNotaLaMultiAni(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("Felicitare - La multi ani!");//ne intoarce doar o felicitare, fata suma de plata
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");//cee ce se adauga in plus
	}

}
