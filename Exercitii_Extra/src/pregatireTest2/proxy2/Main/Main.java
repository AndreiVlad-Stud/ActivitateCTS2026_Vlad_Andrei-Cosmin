package pregatireTest2.proxy2.Main;

import pregatireTest2.proxy2.Classes.Aplicatie;
import pregatireTest2.proxy2.Classes.IVizionare;
import pregatireTest2.proxy2.Classes.ProxyAplicatie;

public class Main {
    public static void main(String[] args) {
        IVizionare user1 = new ProxyAplicatie(new Aplicatie(),true);
        IVizionare user2 = new ProxyAplicatie(new Aplicatie(),false);
        user1.accesVizionare();
        user2.accesVizionare();


    }
}
