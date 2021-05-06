package ro.ase.cts.adapter.clase;

public class AdaptorCredit implements CreditAbstract {

	private Leasing leasing;
	
	public AdaptorCredit(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit(float suma) {
		leasing.imprumuta();
	}
	

}
