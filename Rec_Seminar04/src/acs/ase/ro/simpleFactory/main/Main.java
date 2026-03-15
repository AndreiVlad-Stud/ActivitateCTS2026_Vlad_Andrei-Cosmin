package acs.ase.ro.simpleFactory.main;

import acs.ase.ro.simpleFactory.clase.MijlocTransport;
import acs.ase.ro.simpleFactory.factory.FabricaMijloaceTransport;
import acs.ase.ro.simpleFactory.factory.Tipuri;

public class Main {
    public static void main(String[] args) {
        FabricaMijloaceTransport fabrica  = new FabricaMijloaceTransport();
        MijlocTransport autobuz = fabrica.getMijlocTransport(Tipuri.AUTOBUZ,4,"B124ADB");
        MijlocTransport tramvai = fabrica.getMijlocTransport(Tipuri.TRAMVAI,20,"B456ARCV");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
