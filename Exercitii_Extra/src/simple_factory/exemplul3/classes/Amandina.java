package simple_factory.exemplul3.classes;

import java.util.List;

public class Amandina extends Prajitura{
    public Amandina(String denumire, int gramaj, float pret, List<String> ingrediente) {
        super(denumire, gramaj, pret, ingrediente);
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Amandina{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append(", ingrediente=").append(ingrediente);
        sb.append('}');
        System.out.println(sb);
    }
}
