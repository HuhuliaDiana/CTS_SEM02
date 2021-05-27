package ro.ase.cts.clase;


import java.util.ArrayList;
import java.util.List;

//O grupa contine maxim 35 de studenti
// Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public List<IStudent> getStudenti() {
		return studenti;
	}

	public int getNrGrupa() {
		return nrGrupa;
	}
	
	//nu pun <= sau >= !! va pica testul de limita inferioara/superioara

	public Grupa(int nrGrupa){
		if(nrGrupa<1000 || nrGrupa>1100) {
			throw new IllegalArgumentException();
		}
        this.nrGrupa=nrGrupa;
        studenti=new ArrayList<>();
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    //pondere intre 0 si 1 returneaza, nr integralisti din grupa; 6 din 10-> 0.6
    public float getPromovabilitate(){
    	if(studenti.size()==0) {
    		throw new IndexOutOfBoundsException();
    	}
        float nrRestantieri=0;
        //sau puteam sa numerotam nr de integralisti ca sa nu mai facem diferenta de la return
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return (studenti.size()-nrRestantieri)/studenti.size();
    }
    
    
    
}