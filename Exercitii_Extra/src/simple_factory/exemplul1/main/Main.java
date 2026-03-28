package simple_factory.exemplul1.main;

import simple_factory.exemplul1.clase.Bauturi;
import simple_factory.exemplul1.clase.Cafea;
import simple_factory.exemplul1.factory.FabricaBautura;
import simple_factory.exemplul1.factory.ListaBauturi;

public class Main {
    public static void main(String[] args) {
        FabricaBautura fabrica = new FabricaBautura();
        Bauturi cafea = fabrica.getBautura(ListaBauturi.Cafea, "Espresso.", 12);
        Bauturi ciocolataCalda = fabrica.getBautura(ListaBauturi.CiocolataCalda, "Alba cu Bezele.", 21);
        Bauturi ceai = fabrica.getBautura(ListaBauturi.Ceai, "Tei.", 8);

        cafea.afisareBautura();
        ciocolataCalda.afisareBautura();
        ceai.afisareBautura();

    }
}
