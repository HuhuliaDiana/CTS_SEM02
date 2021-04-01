package ro.ase.cts.clase;

public class Rezervare {

	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaInclusa, boolean muzicaAmbientala,
			String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaInclusa = bauturaInclusa;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturaInclusa=");
		builder.append(bauturaInclusa);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}

	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}

	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	public void setBauturaInclusa(boolean bauturaInclusa) {
		this.bauturaInclusa = bauturaInclusa;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare2) {
		this.codRezervare = codRezervare2;
	}

}
