package acs.ase.ro.FactoryMehtod.classes;

public abstract class Supa implements FelDeMancare{
    //diff intre clasa abstracta si interfata e ca aici putem pune atribute

    protected float gramaj;
    protected String denumire;

    public Supa(float gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }
}
