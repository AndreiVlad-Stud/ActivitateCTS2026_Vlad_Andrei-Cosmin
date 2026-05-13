package pregatireTest2.proxy.Main;

import pregatireTest2.proxy.Classes.ICarte;
import pregatireTest2.proxy.Classes.ImprumutCarte;
import pregatireTest2.proxy.Classes.ProxyImprumut;

public class Main {
    public static void main(String[] args) {
        ICarte imprumutCarte1 = new ProxyImprumut(new ImprumutCarte("Carte Povesti",26),true);
        imprumutCarte1.imprumutaCarte();


        ICarte imprumutCarte2 = new ProxyImprumut(new ImprumutCarte("Carte Horror",10),false);
        imprumutCarte2.imprumutaCarte();

    }
}
