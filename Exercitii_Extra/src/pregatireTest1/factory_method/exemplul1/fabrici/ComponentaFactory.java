package pregatireTest1.factory_method.exemplul1.fabrici;

import pregatireTest1.factory_method.exemplul1.clase.Componenta;
import pregatireTest1.factory_method.exemplul1.clase.EComponenta;

public interface ComponentaFactory {
    public Componenta getComponenta (EComponenta componenta, String culoare, String material, boolean esteDetasabil);
}
