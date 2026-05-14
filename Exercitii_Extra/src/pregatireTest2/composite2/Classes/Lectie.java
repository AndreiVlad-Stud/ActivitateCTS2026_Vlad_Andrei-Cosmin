package pregatireTest2.composite2.Classes;

public class Lectie implements IStructura{
    private String denumireLectie;

    public Lectie(String denumireLectie) {
        this.denumireLectie = denumireLectie;
    }

    @Override
    public void afiseazaStructura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Denumire Lectie: ").append(denumireLectie).append("\n");
        System.out.println(sb);
    }
}
