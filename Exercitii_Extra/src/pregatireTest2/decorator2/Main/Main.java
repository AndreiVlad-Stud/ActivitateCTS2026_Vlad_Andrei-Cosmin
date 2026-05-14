package pregatireTest2.decorator2.Main;

import pregatireTest2.decorator2.Classes.Bon;
import pregatireTest2.decorator2.Classes.BonDecorat;
import pregatireTest2.decorator2.Classes.IPrinteazaBon;

public class Main {
    public static void main(String[] args) {
        IPrinteazaBon bonClasic = new Bon();
        bonClasic.printeazaBon();

        IPrinteazaBon bonDecorat = new BonDecorat(bonClasic,256);
        bonDecorat.printeazaBon();
    }
}
