package ro.ase.cts.clase.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent{

	private String valnume;
	private float valmedie;
	private boolean valareRestanta;
	
	public StudentFake(String valnume, float valmedie, boolean valareRestanta) {
		super();
		this.valnume = valnume;
		this.valmedie = valmedie;
		this.valareRestanta = valareRestanta;
	}

	public StudentFake() {
		
	}


	public void setValnume(String valnume) {
		this.valnume = valnume;
	}

	public void setValmedie(float valmedie) {
		this.valmedie = valmedie;
	}

	public void setValareRestanta(boolean valareRestanta) {
		this.valareRestanta = valareRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valnume;
	}

	

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valmedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valareRestanta;
	}



	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

}
