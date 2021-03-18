package ro.ase.cts.clase;

public class Hardware {

	private String denumire;
	private float pret;
	private String utilizare;
	
	private static Hardware instance=null;
	
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	public void setUtilizare(String utilizare) {
		this.utilizare = utilizare;
	}
	private Hardware(String denumire, float pret, String utilizare) {
		super();
		this.denumire = denumire;
		this.pret = pret;
		this.utilizare = utilizare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hardware [denumire=");
		builder.append(denumire);
		builder.append(", pret=");
		builder.append(pret);
		builder.append(", utilizare=");
		builder.append(utilizare);
		builder.append("]");
		return builder.toString();
	}
	public static synchronized Hardware getInstance(String denumire, float pret, String utilizare) {
		if(instance==null) {
			instance=new Hardware(denumire, pret, utilizare);
		}
		return instance;
	}
	
	
}
