package singleton.exemplul6.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class ARezervareSala {
    protected String numeSala;
    protected List<String> intervaleRezervate;
    protected int capacitate;

    public ARezervareSala(String numeSala, int capacitate) {
        this.numeSala = numeSala;
        this.capacitate = capacitate;
        this.intervaleRezervate = new ArrayList<>();
    }

    public abstract void adaugaRezervare(String interval);
    public abstract void afiseazaRezervari();

}
