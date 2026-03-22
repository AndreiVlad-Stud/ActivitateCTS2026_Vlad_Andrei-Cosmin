package acs.ase.ro.FactoryMehtod.classes;

public class SupaCrema extends Supa{


    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Supa Crema " + denumire + " are " + gramaj + " grame ");

    }
}
