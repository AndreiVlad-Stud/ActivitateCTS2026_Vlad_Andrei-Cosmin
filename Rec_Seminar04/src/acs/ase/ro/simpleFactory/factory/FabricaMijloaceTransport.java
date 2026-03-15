package acs.ase.ro.simpleFactory.factory;

import acs.ase.ro.simpleFactory.clase.Autobuz;
import acs.ase.ro.simpleFactory.clase.MijlocTransport;
import acs.ase.ro.simpleFactory.clase.Tramvai;
import acs.ase.ro.simpleFactory.clase.Troleibuz;

public class FabricaMijloaceTransport {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare){
        if(tip == Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti,numarInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI){
            return new Tramvai(numarRoti,numarInmatriculare);
        }
        if(tip == Tipuri.TROLEIBUZ){
            return new Troleibuz(numarRoti,numarInmatriculare);
        }
        return null;
    }
}
