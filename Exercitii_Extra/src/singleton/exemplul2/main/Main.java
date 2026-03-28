package singleton.exemplul2.main;

import singleton.exemplul2.clase.Gara;

public class Main {
    public static void main(String[] args) {
        Gara gara1 = Gara.getInstance("Sabareni", 86, 65);
        Gara gara2 = Gara.getInstance("Mogosoaia", 9, 18);

        gara1.programeazaTren();
        gara2.programeazaTren();

        gara1.afisarePlecari();
        gara2.afisarePlecari();

        if (gara1 == gara2) {
            System.out.println("Cele doua instante de gara sunt identice.");
        }
    }
}