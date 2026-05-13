package pregatireTest2.decorator.Main;

import pregatireTest2.decorator.Classes.BiletCinema;
import pregatireTest2.decorator.Classes.DecoratorCodReducere;
import pregatireTest2.decorator.Classes.DecoratorMesajPromotional;
import pregatireTest2.decorator.Classes.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet biletSimplu = new BiletCinema("Transformers",2,34);
        biletSimplu.printeazaBilet();

        IBilet biletReducere = new DecoratorCodReducere(biletSimplu,"Qr23SD",15);
        biletReducere.printeazaBilet();

        IBilet biletPromo = new DecoratorMesajPromotional(biletSimplu,"Marti, pe 2.2.2022, toate biletele la filme 2D costa 10 lei!");
        biletPromo.printeazaBilet();



    }
}
