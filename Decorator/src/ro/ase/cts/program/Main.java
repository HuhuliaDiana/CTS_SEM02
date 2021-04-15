package ro.ase.cts.program;
//seminar  8!!!
import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.clase.DecoratorNotePasteFericit;
import ro.ase.cts.clase.NotaAbstracta;
import ro.ase.cts.clase.NotaDePlata;

//decorator-adauga functionalitati noi la run-time
//in ex nostru: runtime=la printare

//exercitiul: printare nota cu felicitare
public class Main {

	public static void main(String[] args) {


		NotaAbstracta nota=new NotaDePlata(100);
		DecoratorAbstract decorator=new DecoratorNotaLaMultiAni(nota);
		decorator.printeaza();
		decorator.printeazaFelicitare();
		
		System.out.println();
		
		DecoratorAbstract decorator2=new DecoratorNotePasteFericit(nota);
		decorator2.printeaza();
		decorator2.printeazaFelicitare();
		
		
		
		
		//decorare multipla= lma + paste fericit:
		
		NotaAbstracta nota2=new NotaDePlata(300);
		DecoratorAbstract decorator3=new DecoratorNotaLaMultiAni(nota2);
		DecoratorAbstract decorator4=new DecoratorNotePasteFericit(decorator3);
		System.out.println();
		System.out.println();

		decorator4.printeaza();//apelez si din parinte(decorator3)
		
		
		
	}

}
