package simple_factory.exemplul1.clase;

public abstract class Bauturi {
    protected String nume;
    protected float pret;

    public Bauturi(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public abstract void afisareBautura();
}
