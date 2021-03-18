package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare = 30;

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getanStudii() {
		return anStudii;
	}

	public void setanStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Student: ");
		stringBuilder.append(super.toString());
		stringBuilder.append(" , An studii= " + anStudii);
		stringBuilder.append(" , Facultate= " + facultate);
		return stringBuilder.toString();

	}

	@Override
	public int getFinantare() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}

}
