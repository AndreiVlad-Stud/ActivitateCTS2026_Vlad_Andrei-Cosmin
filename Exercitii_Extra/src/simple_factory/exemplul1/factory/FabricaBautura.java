package simple_factory.exemplul1.factory;

import simple_factory.exemplul1.clase.Bauturi;
import simple_factory.exemplul1.clase.Cafea;
import simple_factory.exemplul1.clase.Ceai;
import simple_factory.exemplul1.clase.CiocolataCalda;

public class FabricaBautura {
    public Bauturi getBautura (ListaBauturi tipBautura, String nume, float pret){
        if (tipBautura == ListaBauturi.Cafea){
            return new Cafea(nume, pret);
        }
        if (tipBautura == ListaBauturi.CiocolataCalda){
            return new CiocolataCalda(nume, pret);
        }
        if (tipBautura == ListaBauturi.Ceai){
            return new Ceai(nume, pret);
        }
        else {
            throw new IllegalArgumentException("Tipul de bautura nu este corect");
        }
    }
}
