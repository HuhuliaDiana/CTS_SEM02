package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentDummy;
//avantaj-folosim cand nu avem clasa student si se asteapta crearea acesteia ulterior
//nu ocupa spatiu
//dummy object fol cand nu apelam vreo functionalitate pt acea referinta
public class TestGrupaWithDummy {

	private IStudent studentDummy;
	
	public void testAdaugaStudent() {
		
		studentDummy=new StudentDummy();
		Grupa grupa=new Grupa(1000);
		grupa.adaugaStudent(studentDummy);
		assertEquals(1, grupa.getStudenti().size());
	}
	

}
