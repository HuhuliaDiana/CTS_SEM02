package ro.ase.cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare = 20;

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Angajat: ");

		stringBuilder.append(super.toString());
		stringBuilder.append(" , Salariu= " + salariu);
		stringBuilder.append(" , An studii= " + ocupatie);
		return stringBuilder.toString();

	}

	@Override
	public int getFinantare() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}

}
