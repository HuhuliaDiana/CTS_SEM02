package ro.ase.cts.clase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGrupa {


	
	//testam mai multe principii
	
	//right bicep
	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	//test invers direction:
	//obtinem rezultatul si ne intoarcem la input
	
	//nu putem face cross check- putem in schimb sa facem la student:avem constructor cu parametru si fara, la cel fara setam parametrul folosind setterul
	
	//e-error condition
	//eroarea IllegalArgument- cand dam un parametru gresit
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowException() {
		Grupa grupa=new Grupa(999);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowException2() {
		Grupa grupa=new Grupa(1200);
		
	}
	
	//principiul performance
	//imi creaza ob in maxim juma de secunda
	@Test(timeout=500)
	public void testConstructorPerformanta() {
		Grupa g=new Grupa(1085);
	}
	
	//unele principii din correct sunt aceleasi cu cele din right bicep
	
	//conformance- verif daca input sau output respecta anumite formate
	//am putea verif daca nr grupei are 4 cifre, am verif deja daca e mai mare ca 1000 si mai mic ca 1100
	
	//ordering: unde avem liste sau altele
	//ex:id urile sa fie in ordine
	
	
	//range- stabileste interval (1000-1100), testeaza cu valori din interiorul intervalului(am fct etstul de right mai sus), dupa sa facem teste exact pt aceste limite(am fct mai sus boundering, cele 2 teste
	//sa testam cu valori din afara intervalului(am fct la error condition cele 2 teste)- toate cele 5 teste facute intra la range
	
	//reference
	//avem ceva extern? nu! nici lista nu e extern!
	
	//existence
	//verific existenta listei de studenti, daca i s-a alocat spatiu
	
	@Test
	public void testConstructorExistenceList() {
		Grupa grupa=new Grupa(1065);
		assertNotNull(grupa.getStudenti());//trebuie sa ma asigur ca e dif de null
	
	}
	
	//cardinality
	//regula 0-1-n, cand nu avem elemente, cand avem unul sau cand avem mai multe
	//colectia doar are spatiu alocat, nu adauga studenti in lista
	
	//time
	//acopera si performane de la right bicep;nu avem ordine in realizarea constructorului
	
	//multe principii din correct se aplica pt liste!
	//mereu aplicam aceste principii si mai testam si altele pe care consideram noi ca treb sa le testam
	
	
	//luam principiile de la inceput pt metoda getPromovabilitate
	//right bicep
	
	@Test
	public void testPromovabilitateRight() {//integralisti
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<6;i++) {
			Student student=new Student("Georgel");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate=0.7f;
		assertEquals(promovabilitate,grupa.getPromovabilitate(),0.1);//pica testul, deci metoda e gresita si o corectam
	}
	//boundary
	//limtele sunt 0-niciun integrlaist; si 1-toti sunt integralisti
	
	@Test
	public void testPromovabilitateLowerBoundary() {
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);

		
		
		
	}
	@Test
	public void testPromovabilitateUpperBoundary() {
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);

		
		
	}
	
	//cross check
	
	//error condition
	//daca nu avem niciun student in lista, metoda sa arunce o exceptie
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition(){
		Grupa grupa=new Grupa(1084);
		grupa.getPromovabilitate();
		

	}
	
	//performance- vezi TestGrupaCuFixture
	
	//correct-verificat ca obtinem 0.6;0.8; verificam ca  nu pierdem acea informatie- pt ca float; e acoperit insa de right
	
	//ordering-nu conteaza lista studentilor in lista cand treb sa aflam promovabilitatea
	//range- intervalul 0 si 1, nu avem cum sa obtinem val<0 sau >1
	
	//reference
	//areRestante()- e referinta externa
	
	//existance- apelam getPromovabilitate pt o grupa fara studenti- e test de existance, l am fct deja
	
	//cardinality- test in care sa avem un sg student; promovabilitate sa dea pt acel student unic- am fct deja pt 0 studenti si n studenti, a mai ramas pt 1 student
	//time- daca apelez getpromovabilitate inainte de adaugastudent- am fct asta deja pt o grupa care nu are studenti adaugati
	
	
	
}
