package simple_factory.exemplul2.clase;

public abstract class Produs {
    protected String denumire;
    protected int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract  void detaliiProdus();
}
