package ro.ase.cts.clase;

public class BrokerTranzactieLazy {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	private static BrokerTranzactieLazy brokerLazy=null;//amanam apelul constructorului, static e imp ca sa chemam brokertrazy in getinstance()
	
	
	private BrokerTranzactieLazy(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public int getNrTranzactiiEfectuate() {
		return nrTranzactiiEfectuate;
	}
	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactieLazy [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	public static synchronized BrokerTranzactieLazy getInstance(String nume, int vechime, int nrTranzactiiEfectuate) {
		if(brokerLazy==null) {
			brokerLazy=new BrokerTranzactieLazy(nume, vechime, nrTranzactiiEfectuate);//obiectul este creat atunci cand este necesar!
		}
		return brokerLazy;
	}

}
