package pregatireTest2.composite.Main;

import pregatireTest2.composite.Classes.Departament;
import pregatireTest2.composite.Classes.Disciplina;
import pregatireTest2.composite.Classes.IStructuraAcademica;

public class Main {
    public static void main(String[] args) {
        // 1. Cream elementele simple / frunzele din arbore
        // Acestea sunt obiecte de tip Disciplina si NU pot contine alte elemente
        IStructuraAcademica matematica = new Disciplina("matematica");
        IStructuraAcademica fizica = new Disciplina("fizica");
        IStructuraAcademica chimie = new Disciplina("chimie");
        IStructuraAcademica romana = new Disciplina("romana");
        IStructuraAcademica franceza = new Disciplina("franceza");
        IStructuraAcademica psihologie = new Disciplina("psihologie");


        // 2. Cream un departament intermediar pentru disciplinele reale
        // Departamentul este Composite, deci poate contine discipline sau alte departamente
        Departament real = new Departament("Mate-Info");

        // Adaugam discipline simple in departamentul Mate-Info
        real.adaugareDisciplina(matematica);
        real.adaugareDisciplina(fizica);
        real.adaugareDisciplina(chimie);


        // 3. Cream un departament intermediar pentru disciplinele umaniste
        Departament uman = new Departament("Filologie");

        // Adaugam discipline simple in departamentul Filologie
        uman.adaugareDisciplina(romana);
        uman.adaugareDisciplina(franceza);
        uman.adaugareDisciplina(psihologie);


        // 4. Cream radacina structurii
        // In cazul nostru, facultatea ASE este nodul principal al arborelui
        Departament facultate = new Departament("ASE");

        // 5. Adaugam departamentele in facultate
        // Asta functioneaza deoarece Departament implementeaza IStructuraAcademica
        facultate.adaugareDisciplina(real);
        facultate.adaugareDisciplina(uman);


        // 6. Apelam afisarea doar pe radacina
        // Prin Composite, afisarea se propaga recursiv catre toate elementele din arbore
        facultate.afiseaza();

    }
}
