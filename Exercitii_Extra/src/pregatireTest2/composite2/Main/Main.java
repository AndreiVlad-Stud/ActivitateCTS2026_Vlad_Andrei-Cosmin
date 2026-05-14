package pregatireTest2.composite2.Main;

import pregatireTest2.composite2.Classes.Categorie;
import pregatireTest2.composite2.Classes.Lectie;

public class Main {
    public static void main(String[] args) {
        Lectie lectie1 = new Lectie("Lectie 1");
        Lectie lectie2 = new Lectie("Lectie 2");
        Lectie lectie3 = new Lectie("Lectie 3");
        Lectie lectie4 = new Lectie("Lectie 4");
        Lectie lectie5 = new Lectie("Lectie 5");

        Categorie categorieIntermediara1 = new Categorie("Lectii 1-3");
        categorieIntermediara1.addCategorie(lectie1);
        categorieIntermediara1.addCategorie(lectie2);
        categorieIntermediara1.addCategorie(lectie3);

        Categorie categorieIntermediara2 = new Categorie("Lectii 4-5");
        categorieIntermediara2.addCategorie(lectie4);
        categorieIntermediara2.addCategorie(lectie5);

        Categorie categorie = new Categorie("Lectii pentru copii");
        categorie.addCategorie(categorieIntermediara1);
        categorie.addCategorie(categorieIntermediara2);

        categorie.afiseazaStructura();

    }
}
