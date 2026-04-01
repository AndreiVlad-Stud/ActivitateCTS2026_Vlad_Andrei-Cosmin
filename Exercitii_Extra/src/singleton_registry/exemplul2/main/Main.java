package singleton_registry.exemplul2.main;

import singleton_registry.exemplul2.classes.Cuptor;

public class Main {
    public static void main(String[] args) {
        Cuptor cuptor1 = Cuptor.getInstance(220, "Bosch");
        cuptor1.coaceProdus("Franzela");
        cuptor1.coaceProdus("Bagheta");
        cuptor1.coaceProdus("Paine Impletita");
        cuptor1.coaceProdus("Cozonaci");

        Cuptor cuptor2 = Cuptor.getInstance(220, "Miele");
        cuptor2.coaceProdus("Croissant");
        cuptor2.coaceProdus("Pain au chocolat");

        Cuptor cuptor3 = Cuptor.getInstance(185, "Bosch");
        cuptor3.coaceProdus("Pandispan");

        cuptor1.afiseazaDetalii();
        cuptor2.afiseazaDetalii();
        cuptor3.afiseazaDetalii();

        if (cuptor1 == cuptor2){
            System.out.println("Cele doua instante sunt identice");
        }
        if (cuptor1 != cuptor3 ){
            System.out.println("Aceste doua instante sunt diferite");
        }
    }
}
