package acs.ase.ro.FactoryMehtod.main;

import acs.ase.ro.FactoryMehtod.classes.*;

public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare(TipSupa.SUPA_CREMA, 300, "de Morcovi");
        FelDeMancare ciorba = fabrica.getFelDeMancare(TipSupa.CIORBA, 300, "Radauteana");

        FelDeMancareFabrica fabrica2 = new DesertFabrica();
        FelDeMancare papanasi = fabrica2.getFelDeMancare(TipDesert.PAPANASI, 400, "gem", 670);
        FelDeMancare clatite = fabrica2.getFelDeMancare(TipDesert.CLATITE, 200, "ciocolata", 820);

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();

    }
}
