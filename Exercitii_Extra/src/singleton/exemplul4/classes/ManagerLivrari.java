package singleton.exemplul4.classes;

import java.util.ArrayList;
import java.util.List;


public class ManagerLivrari {
    private List<String> comenziActive;
    private static ManagerLivrari instance;

    private ManagerLivrari() {
        this.comenziActive = new ArrayList<>();
    }

    public static synchronized ManagerLivrari getInstance(){
        if (instance == null){
            instance = new ManagerLivrari();
        }
        return instance;
    }

    public void adaugaComanda(String comanda){
        if (comanda == null || comanda.trim().isEmpty()) {
            System.out.println("Comanda invalida");
            return;
        }
        this.comenziActive.add(comanda);
    }

    public void afiseazaComenzi(){
        System.out.println("Comenzi active: " + this.comenziActive);
    }

}
