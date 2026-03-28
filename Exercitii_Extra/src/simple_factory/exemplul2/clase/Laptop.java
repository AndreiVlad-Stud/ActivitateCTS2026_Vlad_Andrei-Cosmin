package simple_factory.exemplul2.clase;

public class Laptop extends Produs{
    public Laptop(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void detaliiProdus() {
        StringBuilder builder = new StringBuilder();
        builder.append("S-a vandut laptopul ").append(super.denumire);
        builder.append(" cu pretul ").append(super.pret).append(". ");
        System.out.println(builder);

    }
}
