package pregatireTest2.strategy2.Main;

import pregatireTest2.strategy2.Classes.Livrare;
import pregatireTest2.strategy2.Classes.LivrareInternationala;
import pregatireTest2.strategy2.Classes.LivrareRapida;
import pregatireTest2.strategy2.Classes.LivrareStandard;

public class Main {
    public static void main(String[] args) {
        Livrare livrare1 = new Livrare(new LivrareInternationala());
        livrare1.calculFinal(100);

        Livrare livrare2 = new Livrare(new LivrareRapida());
        livrare2.calculFinal(100);

        Livrare livrare3 = new Livrare(new LivrareStandard());
        livrare3.calculFinal(100);
    }
}
