package acs.ase.ro.FactoryMehtod.classes;

public class Papanasi extends Desert{
    public Papanasi(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Papanasii cu " + denumire + " au " + gramaj + " grame si " + calorii + " calorii " );
    }
}
