package ro.ase.cts.clase;

public abstract class TemplateSpectator {
    public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLocul();
	
	public final void intrareaPeStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlulCorporal();
		ocupaLocul();
	}

}
