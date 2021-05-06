package ro.ase.cts.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa "+masa.getNrMasa()+" nu se poate ocupa");
		}else {
			masa.setStareMasa(this);
			System.out.println("Masa "+masa.getNrMasa()+" este trecuta in starea ocupata");
		}
	}

}
