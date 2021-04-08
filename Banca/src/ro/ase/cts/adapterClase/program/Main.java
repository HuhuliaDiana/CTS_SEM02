package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.AdaptorCreditClase;
import ro.ase.cts.adapterClase.CreditAbstract;

public class Main {

	public static void afiseazaInfomratiiCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		
		AdaptorCreditClase adaptor=new AdaptorCreditClase(50, "Ana");//creez automat si un leasing, nu mai treb sa creez ob intermediar
		afiseazaInfomratiiCredit(adaptor);
		//fol adapter de obiecte cand creditabstract e clasa abstracta pt ca adaptorcreditclase nu poate mosteni 2 clase
	}

}
