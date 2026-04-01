package singleton.exemplul4.main;

import singleton.exemplul4.classes.ManagerLivrari;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ManagerLivrari managerLivrari1 = ManagerLivrari.getInstance();
        ManagerLivrari managerLivrari2 = ManagerLivrari.getInstance();

        managerLivrari1.adaugaComanda("Comanda 1");
        managerLivrari1.adaugaComanda("Comanda 2");
        managerLivrari2.adaugaComanda("Comanda 3");

        managerLivrari1.afiseazaComenzi();

        if (managerLivrari1 == managerLivrari2) {
            System.out.println("Este aceeasi instanta.");
        }


    }
}
