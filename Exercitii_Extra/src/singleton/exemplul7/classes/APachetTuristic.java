package singleton.exemplul7.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class APachetTuristic implements IPachetTuristic {
    protected String agentieTurism;
    protected String destinatie;
    protected List<String> coduriPacheteVandute;
    protected float pretBaza;

    public APachetTuristic(String agentieTurism, String destinatie, float pretBaza) {
        this.agentieTurism = agentieTurism;
        this.destinatie = destinatie;
        this.pretBaza = pretBaza;
        this.coduriPacheteVandute = new ArrayList<>();
    }
}