package singleton_registry.exemplul1.main;

import singleton_registry.exemplul1.classes.Filiala;

public class Main {
    public static void main(String[] args) {
        Filiala filiala1 = Filiala.getInstance("Bucuresti", "Unirii", 12);
        Filiala filiala2 = Filiala.getInstance("Cluj", "Centru", 2);
        Filiala filiala3 = Filiala.getInstance("Bucuresti", "Militari", 22);

        filiala1.afisareFiliala();
        filiala2.afisareFiliala();
        filiala3.afisareFiliala();

        if (filiala1 == filiala3) {
            System.out.println("Filiala1 si filiala3 sunt aceeasi instanta.");
        }

        if (filiala1 == filiala2) {
            System.out.println("Ai gresit, filiala1 si filiala2 nu ar trebui sa fie aceeasi instanta.");
        } else {
            System.out.println("Filiala1 si filiala2 sunt instante diferite.");
        }
    }
}