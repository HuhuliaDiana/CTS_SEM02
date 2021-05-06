package ro.ase.cts.clase;

public abstract class Comanda {
private ContBancar cont;
private float suma;
public Comanda(ContBancar cont, float suma) {
	super();
	this.cont = cont;
	this.suma = suma;
}
public ContBancar getCont() {
	return cont;
}
public void setCont(ContBancar cont) {
	this.cont = cont;
}
public float getSuma() {
	return suma;
}
public void setSuma(float suma) {
	this.suma = suma;
}

public abstract void executa();
}