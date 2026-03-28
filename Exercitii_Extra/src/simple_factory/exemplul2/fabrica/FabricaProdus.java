package simple_factory.exemplul2.fabrica;

import simple_factory.exemplul2.clase.Laptop;
import simple_factory.exemplul2.clase.Produs;
import simple_factory.exemplul2.clase.Tableta;
import simple_factory.exemplul2.clase.Telefon;

public class FabricaProdus {
    public Produs getProdus (TipProdus tipProdus, String denumire, int pret){
        switch (tipProdus){
            case LAPTOP: return new Laptop(denumire,pret);
            case TELEFON: return new Telefon(denumire,pret);
            case TABLETA: return new Tableta(denumire,pret);
            default:
                throw new IllegalArgumentException("Tipul de produs introdus este gresit");
        }
    }
}
