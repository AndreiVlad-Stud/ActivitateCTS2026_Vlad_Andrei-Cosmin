package simple_factory.exemplul2.clase;

public class Tableta extends Produs{
    public Tableta(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void detaliiProdus() {
        StringBuilder builder = new StringBuilder();
        builder.append("S-a vandut Tableta ").append(super.denumire);
        builder.append(" cu pretul ").append(super.pret).append(". ");
        System.out.println(builder);

    }
}
