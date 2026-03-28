package simple_factory.exemplul1.clase;

public class Cafea extends Bauturi{
    public Cafea(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareBautura() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ati comandat cafea de tipul: ").append(super.nume);
        builder.append(" Pretul bauturii este de: ").append(super.pret);
        System.out.println(builder);
    }
}
