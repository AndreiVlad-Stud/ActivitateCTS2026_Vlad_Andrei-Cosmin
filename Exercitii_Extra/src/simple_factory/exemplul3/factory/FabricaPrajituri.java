package simple_factory.exemplul3.factory;


import simple_factory.exemplul3.classes.Amandina;
import simple_factory.exemplul3.classes.Ecler;
import simple_factory.exemplul3.classes.Prajitura;
import simple_factory.exemplul3.classes.Tort;

import java.util.List;

public class FabricaPrajituri {
    public static Prajitura crearePrajitura(TipPrajitura tip, String denumire, int gramaj, float pret, List<String> ingrediente) {
        switch (tip) {
            case TORT:
                return new Tort(denumire, gramaj, pret, ingrediente);
            case AMANDINA:
                return new Amandina(denumire, gramaj, pret, ingrediente);
            case ECLER:
                return new Ecler(denumire, gramaj, pret, ingrediente);
            default:
                throw new RuntimeException("Tip invalid");
        }
    }
}
