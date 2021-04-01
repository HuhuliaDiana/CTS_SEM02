package ro.ase.cts.clase;

public class RezervareBuilder implements AbstractBuilder {
	private Rezervare rezervare;
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(false, false, false, false, "",codRezervare);
	}
	
	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(false, false, false, false, "",0);
	}


	public RezervareBuilder setMancareInclusa1(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
		
	}
	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
		
	}
	public RezervareBuilder setBauturaInclusa(boolean bauturaInclusa) {
		rezervare.setBauturaInclusa(bauturaInclusa);
		return this;
		
	}
	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
		
	}
	public RezervareBuilder setGenMuzica(String GenMuzica) {
		rezervare.setGenMuzica(GenMuzica);
		return this;
		
	}

	public RezervareBuilder setCodRezervare(int CodRezervare) {
		rezervare.setCodRezervare(CodRezervare);
		return this;
		
	}

	@Override
	public Rezervare build() {
		
		return rezervare;
	}

}
