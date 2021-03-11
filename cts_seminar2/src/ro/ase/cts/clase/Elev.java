package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare=10;
	
	
	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(int sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder("Elev: ");
		stringBuilder.append(super.toString());
		stringBuilder.append(" , Clasa= "+clasa);
		stringBuilder.append(" , Tutore= "+tutore);
		return stringBuilder.toString();
		
		
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	

	@Override
	public int getFinantare() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}
	
}
