package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	@Override
	public Rezervare build() {
		
		Rezervare rezervare=new Rezervare(mancareInclusa, scaunErgonomic, bauturaInclusa, muzicaAmbientala,
			genMuzica,codRezervare) ;
		return rezervare;
	}

	public RezervareBuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;

	}

	public RezervareBuilderV2 setBauturaInclusa(boolean bauturaInclusa) {
		this.bauturaInclusa = bauturaInclusa;
		return this;

	}

	public RezervareBuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;

	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;

	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;

	}

	
	// copy paste=DRY

}
