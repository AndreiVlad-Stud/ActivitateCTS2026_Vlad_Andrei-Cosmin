package factory_method.exemplul1.main;

import factory_method.exemplul1.clase.Componenta;
import factory_method.exemplul1.clase.EComponenta;
import factory_method.exemplul1.clase.IComponenta;
import factory_method.exemplul1.fabrici.*;

public class Main {
    public static void main(String[] args) {
            ComponentaFactory baraFactory = new BaraFactory();
            IComponenta bara = baraFactory.getComponenta(EComponenta.BARA, "Negru", "Plastic", true);

            ComponentaFactory capotaFactory = new CapotaFactory();
            IComponenta capota = capotaFactory.getComponenta(EComponenta.CAPOTA, "Rosu", "Aluminiu", false);

            ComponentaFactory usaFactory = new UsaFactory();
            IComponenta usa = usaFactory.getComponenta(EComponenta.USA, "Alb", "Otel", true);

            ComponentaFactory portbagajFactory = new PortbagajFactory();
            IComponenta portbagaj = portbagajFactory.getComponenta(EComponenta.PORTBAGAJ, "Gri", "Fibra de carbon", false);

            ((Componenta) bara).afiseazaDetalii();
            ((Componenta) capota).afiseazaDetalii();
            ((Componenta) usa).afiseazaDetalii();
            ((Componenta) portbagaj).afiseazaDetalii();
    }
}
