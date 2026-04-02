package simple_factory.exemplul4.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Abonament implements IAbonament{
    protected String numeAbonat;
    protected float pretBaza;
    protected List<String> beneficiiIncluse;

    public Abonament(String numeAbonat, float pretBaza, List<String> beneficiiIncluse) {
        this.numeAbonat = numeAbonat;
        this.pretBaza = 50;
        this.beneficiiIncluse = new ArrayList<>(beneficiiIncluse);
    }

}
