package pregatireTest1.prototype.exemplul3.main;

import pregatireTest1.prototype.exemplul3.classes.Meniu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> preparate = new ArrayList<>();
        preparate.add("Salata Caesar");
        preparate.add("Supa crema");
        preparate.add("Paste Arrabiata");

        Meniu meniu1 = new Meniu("Meniu Vegetarian", "Pranz", 45.5f, preparate);

        Meniu meniu2 = (Meniu) meniu1.clone();
        meniu2.setDenumireMeniu("meniu cu de toate");
        meniu2.adaugaPreparat("Limonada");

        Meniu meniu3 = (Meniu) meniu1.clone();
        meniu3.setPret(221);
        meniu3.setTipMeniu("Cina");
        meniu3.eliminaPreparat("Salata Caesar");


        meniu1.afisare();
        meniu2.afisare();
        meniu3.afisare();

    }
}
