package ro.ase.cts.clase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGrupaCUFixture {

	private Grupa grupa;//pt principiul Performance de la metoda getPromovabilitate()
	
	//setUp pregateste inputul, metoda ar fi fost apelata inainte de fiecare test, de 12 ori- 12 teste; de aceea am mutat tot aici, ca sa nu fie apelata pt restul de 11 teste
	//ne punem doar testele care vor folosi aceasta metoda setUp
	
	
	@Before
	public void setUp() {
		//initializare grupa
		
		grupa=new Grupa(1075);
		for(int i=0;i<35;i++) {
			Student student=new Student("Alinuta");
			for (int j=0;j<6;j++) {
				student.adaugaNota(7);
			}
			grupa.adaugaStudent(student);//utilizare atribut
		}
		
	}
	//performance
		//metoda determina probabil in cel mult jumate de sec
		@Test(timeout=500)
		public void testPromovabilitatePerformance() {
			
			grupa.getPromovabilitate();//metoda aceasta o testam
			//testul ar putea pica din cauza constructorilor apelati
			
			
		}
}
