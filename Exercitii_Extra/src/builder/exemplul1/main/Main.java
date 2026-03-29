package builder.exemplul1.main;

import builder.exemplul1.clase.ImagineVirtuala;
import builder.exemplul1.clase.ImagineVirtualaBuilder;

public class Main {

    public static void main(String[] args) {
        ImagineVirtuala imagine = new ImagineVirtualaBuilder.Builder("Imagine 1")
                .adaugaAplicatie("Chrome")
                .adaugaAplicatie("Teams")
                .build();
        imagine.afiseazaDescriereImagineVirtuala();

        ImagineVirtuala imagine2 = new ImagineVirtualaBuilder.Builder("Imagine 2")
                .adaugaAplicatie("Discord")
                .adaugaAplicatie("Steam")
                .build();
        imagine2.afiseazaDescriereImagineVirtuala();
        imagine2.instaleazaAplicatie("Microsoft"); //testare eroare


    }
}
