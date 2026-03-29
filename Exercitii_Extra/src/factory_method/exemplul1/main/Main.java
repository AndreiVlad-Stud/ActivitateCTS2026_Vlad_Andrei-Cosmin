package factory_method.exemplul1.main;

import factory_method.exemplul1.clase.Componenta;
import factory_method.exemplul1.clase.EComponenta;
import factory_method.exemplul1.clase.IComponenta;
import factory_method.exemplul1.fabrici.*;

public class Main {
    public static void main(String[] args) {
            ComponentaFactory baraFactory = new BaraFactory();
            Componenta bara = baraFactory.getComponenta(EComponenta.BARA, "Negru", "Plastic", true);

            ComponentaFactory capotaFactory = new CapotaFactory();
            Componenta capota = capotaFactory.getComponenta(EComponenta.CAPOTA, "Rosu", "Aluminiu", false);

            ComponentaFactory usaFactory = new UsaFactory();
            Componenta usa = usaFactory.getComponenta(EComponenta.USA, "Alb", "Otel", true);

            ComponentaFactory portbagajFactory = new PortbagajFactory();
            Componenta portbagaj = portbagajFactory.getComponenta(EComponenta.PORTBAGAJ, "Gri", "Fibra de carbon", false);

            bara.afiseazaDetalii();
            capota.afiseazaDetalii();
            usa.afiseazaDetalii();
            portbagaj.afiseazaDetalii();
    }
}
