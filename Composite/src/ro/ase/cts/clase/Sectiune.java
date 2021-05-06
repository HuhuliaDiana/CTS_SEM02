package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentMeniu{

	private List<ComponentMeniu> listaComponente;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		super();
		this.listaComponente=new ArrayList<>();
		this.numeSectiune=numeSectiune;
	}

	@Override
	public void adaugaNod(ComponentMeniu componentMeniu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stergeNod(ComponentMeniu componentMeniu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ComponentMeniu getNod(int index) {
		return null;
	}

	@Override
	public void printeaza() {
		
	}
}
