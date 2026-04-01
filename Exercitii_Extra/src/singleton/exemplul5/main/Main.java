package singleton.exemplul5.main;

import singleton.exemplul5.classes.RegistruRezervari;

public class Main {
    public static void main(String[] args) {
        RegistruRezervari r1 = RegistruRezervari.getInstance();
        RegistruRezervari r2 = RegistruRezervari.getInstance();

        r1.adaugaRezervare("Popescu");
        r2.adaugaRezervare("Ionescu");
        r1.adaugaRezervare("Popescu");

        r1.afiseazaRezervari();

        System.out.println(r1 == r2);
    }
}
