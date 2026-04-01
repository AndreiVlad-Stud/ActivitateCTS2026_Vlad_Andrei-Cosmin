package singleton.exemplul6.main;

import singleton.exemplul6.classes.RezervareSala;

public class Main {
    public static void main(String[] args) {
        RezervareSala rezervare1 = RezervareSala.getInstance("Moon", 220);
        rezervare1.adaugaRezervare("12 Aprilie de la 6 PM la 11 PM");

        RezervareSala rezervare2 = RezervareSala.getInstance("Sun", 380);
        rezervare2.adaugaRezervare("13 Aprilie de la 4 PM la 8 PM");

        rezervare1.afiseazaRezervari();
        rezervare2.afiseazaRezervari();

        if (rezervare1 == rezervare2){
            System.out.println("Cele doua instante sunt identice");
        }
    }
}
