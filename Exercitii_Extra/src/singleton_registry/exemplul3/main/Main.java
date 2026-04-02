package singleton_registry.exemplul3.main;

import singleton_registry.exemplul3.classes.Bicicleta;

public class Main {
    static void main(String[] args) {
        Bicicleta bicicleta1 = Bicicleta.getInstance(938, "M1");
        bicicleta1.inchiriaza("Gigel");
        bicicleta1.inchiriaza("Marcel");
        bicicleta1.inchiriaza("Andrusca");
        bicicleta1.inchiriaza("Gigel");


        Bicicleta bicicleta2= Bicicleta.getInstance(223, "M1");
        bicicleta2.inchiriaza("Razvan");
        bicicleta2.inchiriaza("Bogdan");


        Bicicleta bicicleta3 = Bicicleta.getInstance(938, "M658");
        bicicleta3.inchiriaza("Iulian");


        bicicleta1.afiseazaStatus();
        bicicleta2.afiseazaStatus();
        bicicleta3.afiseazaStatus();

        if (bicicleta1==bicicleta3){
            System.out.println("Instantele sunt identice");
        }

        if (bicicleta1!=bicicleta2){
            System.out.println("Instantele sunt diferite");
        }
    }
}
