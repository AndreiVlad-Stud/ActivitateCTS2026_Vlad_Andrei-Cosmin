package simple_factory.exemplul2.clase;

public class Telefon extends Produs{
    public Telefon(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void detaliiProdus() {
        StringBuilder builder = new StringBuilder();
        builder.append("S-a vandut Telefonul ").append(super.denumire);
        builder.append(" cu pretul ").append(super.pret).append(". ");
        System.out.println(builder);
    }
}
