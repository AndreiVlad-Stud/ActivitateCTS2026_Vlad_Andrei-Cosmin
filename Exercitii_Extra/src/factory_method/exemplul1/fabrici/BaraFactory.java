package factory_method.exemplul1.fabrici;

import factory_method.exemplul1.clase.Bara;
import factory_method.exemplul1.clase.EComponenta;
import factory_method.exemplul1.clase.IComponenta;

public class BaraFactory implements ComponentaFactory{
    @Override
    public IComponenta getComponenta(EComponenta componenta, String culoare, String material, boolean esteDetasabil) {
        switch (componenta){
            case BARA: return new Bara( culoare, material, esteDetasabil);
            default:
                throw new IllegalArgumentException("Parametul este gresit");
        }

    }
}
