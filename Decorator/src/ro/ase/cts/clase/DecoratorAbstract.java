package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements NotaAbstracta{//abstract- pt ca nu o fol
	private NotaAbstracta nota;//has a

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		nota.printeaza();
		
	}

	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}
	
	public abstract void printeazaFelicitare();
	

}
