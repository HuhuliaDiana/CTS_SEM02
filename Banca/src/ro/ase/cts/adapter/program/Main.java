package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdaptorCredit;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

	public static void afiseazaInfomratiiCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}
	public static void main(String[] args) {
		
		Leasing leasing=new Leasing(100,"Ion");//il voi adapta dandu l ca param adaptorului meu
		//afiseazaInfomratiiCredit(leasing, leasing.getSuma());//nu se poate pt ca leasing nu e de tip creditabstract, deci e nev de un adapter
		AdaptorCredit adaptor=new AdaptorCredit(leasing);
		adaptor.oferaCredit(100);//nu cont ce dau ca param pt ca oricum nu-l foloseste
		

	}

}
