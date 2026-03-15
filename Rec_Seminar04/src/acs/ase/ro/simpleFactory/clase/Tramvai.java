package acs.ase.ro.simpleFactory.clase;

public class Tramvai  extends MijlocTransport {
    public Tramvai(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvaiul are : Numar roti : ").append(super.numarRoti);
        builder.append(" Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());

    }
}
