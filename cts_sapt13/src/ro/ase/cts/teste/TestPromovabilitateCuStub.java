package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.StudentStub;

public class TestPromovabilitateCuStub {
	

	@Test
	public void testGetPromovabilitate() {
		Grupa grupa=new Grupa(1083);
		IStudent studentStub=new StudentStub();
		grupa.adaugaStudent(studentStub);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
