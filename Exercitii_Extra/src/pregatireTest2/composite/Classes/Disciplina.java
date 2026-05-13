package pregatireTest2.composite.Classes;

public class Disciplina implements IStructuraAcademica{
    private String denumireDisciplina;

    public Disciplina(String denumireDisciplina) {
        this.denumireDisciplina = denumireDisciplina;
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append(" -> Denumire disciplina: ").append(denumireDisciplina).append("\n");
        System.out.println(sb);

    }
}
