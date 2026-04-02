package simple_factory.exemplul3.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Prajitura {
    protected String denumire;
    protected int gramaj;
    protected float pret;
    protected List<String> ingrediente;

    public Prajitura(String denumire, int gramaj, float pret, List<String> ingrediente) {
        if (denumire == null || denumire.trim().isEmpty()) {
            throw new RuntimeException("Denumirea este invalida");
        }
        if (gramaj <= 0) {
            throw new RuntimeException("Gramajul trebuie sa fie pozitiv");
        }
        if (pret <= 0) {
            throw new RuntimeException("Pretul trebuie sa fie pozitiv");
        }
        if (ingrediente == null || ingrediente.size() < 2) {
            throw new RuntimeException("Lista trebuie sa contina cel putin 2 ingrediente");
        }

        this.denumire = denumire;
        this.gramaj = gramaj;
        this.pret = pret;
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    public abstract void afiseazaDetalii();

}
