package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.dubluri.StudentFake;

public class TestPromovabilitateCuFake {

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1083);
		for(int i=0;i<8;i++) {
			StudentFake student=new StudentFake();
			student.setValareRestanta(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			StudentFake student=new StudentFake();
			student.setValareRestanta(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}

}
