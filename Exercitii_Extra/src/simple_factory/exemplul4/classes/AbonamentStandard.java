package simple_factory.exemplul4.classes;

import java.util.List;

public class AbonamentStandard extends Abonament{
    public AbonamentStandard(String numeAbonat, float pretBaza, List<String> beneficiiIncluse) {
        super(numeAbonat, pretBaza, beneficiiIncluse);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Numele Abonatului: " ).append(numeAbonat);
        builder.append(", pretul de baza este: ").append(pretBaza);
        builder.append(" iar optiunile incluse sunt: ").append(beneficiiIncluse);
        System.out.println(builder);
    }

    @Override
    public float calculeazaPretFinal() {
        return this.pretBaza +35;
    }
}
