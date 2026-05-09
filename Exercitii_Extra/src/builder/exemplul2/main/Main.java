package builder.exemplul2.main;

import builder.exemplul2.classes.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop config1 = new Laptop.Builder("Intel i5", 16)
                .build();

        Laptop config2 = new Laptop.Builder("AMD Ryzen 7", 32)
                .setCapacitateSSD(1000)
                .setPlacaVideoDedicata(true)
                .setSistemOperare("Windows 11")
                .adaugaAplicatie("Chrome")
                .adaugaAplicatie("IntelliJ IDEA")
                .adaugaAplicatie("Discord")
                .build();

        config1.afiseazaDetalii();
        config2.afiseazaDetalii();
    }
}