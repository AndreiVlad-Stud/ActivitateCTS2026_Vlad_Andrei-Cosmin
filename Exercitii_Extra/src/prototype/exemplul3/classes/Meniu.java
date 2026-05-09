package prototype.exemplul3.classes;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements IMeniu{
    private String denumireMeniu;
    private String tipMeniu;
    private float pret;
    private List<String> preparateIncluse;

    public Meniu(String denumireMeniu, String tipMeniu, float pret, List<String> preparateIncluse) {
        this.denumireMeniu = denumireMeniu;
        this.tipMeniu = tipMeniu;
        this.pret = pret;
        this.preparateIncluse = new ArrayList<>(preparateIncluse);
    }

    public void setDenumireMeniu(String denumireMeniu) {
        this.denumireMeniu = denumireMeniu;
    }

    public void setTipMeniu(String tipMeniu) {
        this.tipMeniu = tipMeniu;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }


    @Override
    public IMeniu clone() {
        List<String> lista = new ArrayList<>(this.preparateIncluse);
        return new Meniu(this.denumireMeniu, this.tipMeniu, this.pret,lista);
    }

    public void adaugaPreparat(String preparat) {
        this.preparateIncluse.add(preparat);
    }

    public void eliminaPreparat(String preparat) {
        this.preparateIncluse.remove(preparat);
    }

    public void afisare(){
        StringBuilder builder = new StringBuilder();
        builder.append("Denumire meniu: ").append(denumireMeniu);
        builder.append("\n");
        builder.append("Tip meniu: ").append(tipMeniu);
        builder.append("\n");
        builder.append("Pret: ").append(pret);
        builder.append("\n");
        builder.append("Preparate incluse ").append(preparateIncluse);
        builder.append("\n");
        System.out.println(builder);



    }
}
