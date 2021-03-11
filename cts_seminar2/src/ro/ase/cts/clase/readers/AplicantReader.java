package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName;
	
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	 public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	 
	 public void readAplicant(Scanner input2, Aplicant aplicant) {
		 
		 String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nr = input2.nextInt();
			String[] vect = new String[nr];
			for (int i = 0; i < nr; i++)
				vect[i] = input2.next();
			
			aplicant.setNume(nume);
			aplicant.setPrenume(prenume);
			aplicant.setPunctaj(punctaj);
			aplicant.setVarsta(varsta);
			aplicant.setDenumiriProiecte(nr,vect);
			
			
	 }
	
	

}
