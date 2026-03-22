package acs.ase.ro.Prototype.Main;

import acs.ase.ro.Prototype.Classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare("Mihai", 12, 3, "1254365987541256");
        Rezervare rezervare2 = (Rezervare) rezervare1.copiaza();
        rezervare2.setOraRezervare(19);

        System.out.println(rezervare1);
        System.out.println(rezervare2);

    }
}
