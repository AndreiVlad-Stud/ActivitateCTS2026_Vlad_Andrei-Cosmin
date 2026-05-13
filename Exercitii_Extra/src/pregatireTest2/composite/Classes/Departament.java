package pregatireTest2.composite.Classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructuraAcademica{
    private String denumireDepartament;
    private List<IStructuraAcademica> discipline = new ArrayList<>();

    public Departament(String denumireDepartament) {
        this.denumireDepartament = denumireDepartament;
    }

    public void adaugareDisciplina(IStructuraAcademica disciplina){
        discipline.add(disciplina);
    }

    public void stergereDisciplina(IStructuraAcademica disciplina){
        discipline.remove(disciplina);
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamentul ").append(denumireDepartament);
        sb.append(" guverneaza peste urmatoarele discipline: \n");
        System.out.println(sb);

        for(IStructuraAcademica disciplina:discipline){
            disciplina.afiseaza();
        }
    }
}
