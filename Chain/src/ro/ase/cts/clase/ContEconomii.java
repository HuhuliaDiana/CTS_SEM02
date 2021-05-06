package ro.ase.cts.clase;

public class ContEconomii extends Cont {


		public ContEconomii(float sold) {
			super(sold);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void plateste(float suma) {
			if(super.getSold()>suma) {
				System.out.println("ai platit cu contul de economii");
				super.setSold(super.getSold()-suma);
			}else {
				
				if(super.getSuccesor()==null) {
				System.out.println("nu se poate efectua plata!");
				
				}else {
					super.getSuccesor().plateste(suma);
					
				}
			}
		

	}


}
