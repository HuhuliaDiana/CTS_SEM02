package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject{

	
	private List<Observer> clienti;
	private String numeSala;
	
	
	public ManagerSala( String numeSala) {
		super();
		this.clienti=new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		// TODO Auto-generated method stub
		clienti.add(observer);
	}

	@Override
	public void stergereAbonat(Observer observer) {
		// TODO Auto-generated method stub
		clienti.remove(observer);
		
	}

	@Override
	public void trimitereMesaj(String text) {
		// TODO Auto-generated method stub
		clienti.forEach(item->item.receptioneazaMesaj(text));
		
	}
	
	public void trimiteAnuntImportant(String tipMeci) {
		trimitereMesaj("astazi se va juca un meci de "+tipMeci);
	}

}
