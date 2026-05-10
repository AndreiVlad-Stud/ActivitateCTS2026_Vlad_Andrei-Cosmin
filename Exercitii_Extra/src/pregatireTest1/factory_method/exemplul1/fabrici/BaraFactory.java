package pregatireTest1.factory_method.exemplul1.fabrici;

import pregatireTest1.factory_method.exemplul1.clase.Bara;
import pregatireTest1.factory_method.exemplul1.clase.Componenta;
import pregatireTest1.factory_method.exemplul1.clase.EComponenta;

public class BaraFactory implements ComponentaFactory{
    @Override
    public Componenta getComponenta(EComponenta componenta, String culoare, String material, boolean esteDetasabil) {
        switch (componenta){
            case BARA: return new Bara( culoare, material, esteDetasabil);
            default:
                throw new IllegalArgumentException("Parametul este gresit");
        }

    }
}
