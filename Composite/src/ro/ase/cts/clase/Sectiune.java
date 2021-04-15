package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune {

	private List<ComponentMeniu> listaComponente;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		super();
		this.listaComponente=new ArrayList<>();
		this.numeSectiune=numeSectiune;
	}
}
