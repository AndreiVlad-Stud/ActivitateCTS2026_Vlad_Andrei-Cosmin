package pregatireTest2.composite2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IStructura{
    private String denumireCategorie;
    private List<IStructura> categorii = new ArrayList<>();

    public Categorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
    }

    public void addCategorie(IStructura categorie){
        categorii.add(categorie);
    }

    public void removeCategorie(IStructura categorie){
        categorii.remove(categorie);
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Denumire categorie: "+denumireCategorie);
        for (IStructura categorie:categorii){
            categorie.afiseazaStructura();
        }

    }
}
