package acs.ase.ro.simpleFactory.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuzul are : Numar roti : ").append(super.numarRoti);
        builder.append(" Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());
    }
}
