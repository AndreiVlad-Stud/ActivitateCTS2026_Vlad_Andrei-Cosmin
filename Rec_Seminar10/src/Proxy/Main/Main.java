package Proxy.Main;

import Proxy.Clase.Autobuz;
import Proxy.Clase.ProxyAutobuz;
import Proxy.Clase.ProxyAutobuzCursaSpeciala;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(312, 0);
        ProxyAutobuz autobuzNoapte = new ProxyAutobuz(autobuz1);

        autobuzNoapte.opresteInStatie();
        //autobuzNoapte.coboaraCalatori(1);
        autobuzNoapte.opresteInStatie();

        ProxyAutobuzCursaSpeciala autobuzCursaSpeciala = new ProxyAutobuzCursaSpeciala(autobuz1);
        autobuzCursaSpeciala.opresteInStatie();



    }
}
