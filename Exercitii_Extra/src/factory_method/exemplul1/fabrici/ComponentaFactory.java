package factory_method.exemplul1.fabrici;

import factory_method.exemplul1.clase.EComponenta;
import factory_method.exemplul1.clase.IComponenta;

public interface ComponentaFactory {
    public IComponenta getComponenta (EComponenta componenta, String culoare, String material, boolean esteDetasabil);
}
