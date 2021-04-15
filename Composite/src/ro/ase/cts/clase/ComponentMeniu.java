package ro.ase.cts.clase;


public interface ComponentMeniu {
public void adaugaNod(ComponentMeniu componentMeniu);
public void stergeNod(ComponentMeniu componentMeniu);
public ComponentMeniu getNod(int index);
public void printeaza();
}