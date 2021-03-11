package ro.ase.cts.program;

import java.io.FileNotFoundException;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReader;

import java.util.List;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException{
		return reader.readAplicanti();
	}
	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAngajati)
				{
				System.out.println(angajat.toString());
				System.out.print("Angajatul are finantarea " + angajat.getFinantare());
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
