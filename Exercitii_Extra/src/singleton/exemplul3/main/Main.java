package singleton.exemplul3.main;

import singleton.exemplul3.classes.SalaSpectacol;

public class Main {
    public static void main(String[] args) {
        SalaSpectacol sala1 = SalaSpectacol.getInstance("Titanic", 120, 88);
        SalaSpectacol sala2 = SalaSpectacol.getInstance("Avatar", 120, 999);

        sala1.confirmareRezervare();
        sala2.confirmareRezervare();

        sala1.detaliiRezervare();
        sala2.detaliiRezervare();

        if (sala1 == sala2) {
            System.out.println("Cele doua instante sunt identice.");
        }
    }
}