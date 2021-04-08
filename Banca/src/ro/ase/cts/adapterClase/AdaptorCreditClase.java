package ro.ase.cts.adapterClase;

public class AdaptorCreditClase extends Leasing implements CreditAbstract {
//adaptez intreaga clasa, am nev de intreaga clasa in spate, de aceea o mostenesc
	public AdaptorCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}

	@Override
	public void oferaCredit() {
		super.imprumuta();
	}

}
