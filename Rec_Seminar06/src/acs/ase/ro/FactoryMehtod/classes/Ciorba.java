package acs.ase.ro.FactoryMehtod.classes;

public class Ciorba extends Supa{
    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Ciorba " + denumire + " are " + gramaj + " grame ");
    }
}