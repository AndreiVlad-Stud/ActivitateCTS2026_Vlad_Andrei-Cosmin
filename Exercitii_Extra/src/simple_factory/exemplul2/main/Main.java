package simple_factory.exemplul2.main;

import simple_factory.exemplul2.clase.Produs;
import simple_factory.exemplul2.fabrica.FabricaProdus;
import simple_factory.exemplul2.fabrica.TipProdus;

public class Main {
    public static void main(String[] args) {
        FabricaProdus fabricaProdus = new FabricaProdus();
        Produs telefon = fabricaProdus.getProdus(TipProdus.TELEFON, "Samsung S25 Ultra", 2250);
        Produs tableta = fabricaProdus.getProdus(TipProdus.TABLETA, "Samsung Tab Ultra 7", 1500);
        Produs laptop = fabricaProdus.getProdus(TipProdus.LAPTOP, "Acer Ultra i7", 3600);

        telefon.detaliiProdus();
        tableta.detaliiProdus();
        laptop.detaliiProdus();
    }
}
