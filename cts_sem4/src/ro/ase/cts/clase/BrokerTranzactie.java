package ro.ase.cts.clase;

public class BrokerTranzactie {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	//eager initialization
	private static BrokerTranzactie broker=new BrokerTranzactie("gigica",10,100);//private static-the only instance of the class

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	private BrokerTranzactie(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactie [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	public static BrokerTranzactie getInstance() {//return the instance of the class
		return broker;
	}
	
	
	
	

}
