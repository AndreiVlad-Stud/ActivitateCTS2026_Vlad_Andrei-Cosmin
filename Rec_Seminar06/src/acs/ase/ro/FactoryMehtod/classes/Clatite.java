package acs.ase.ro.FactoryMehtod.classes;

public class Clatite extends Desert{
    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatitele cu " + denumire + " au " + gramaj + " grame si " + calorii + " calorii.");
    }
}