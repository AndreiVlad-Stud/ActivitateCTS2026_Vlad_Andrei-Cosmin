package pregatireTest1.factory_method.exemplul1.fabrici;

import pregatireTest1.factory_method.exemplul1.clase.*;
import pregatireTest1.factory_method.exemplul1.clase.Componenta;
import pregatireTest1.factory_method.exemplul1.clase.EComponenta;
import pregatireTest1.factory_method.exemplul1.clase.Usa;

public class UsaFactory implements ComponentaFactory{
    @Override
    public Componenta getComponenta(EComponenta componenta, String culoare, String material, boolean esteDetasabil) {
        switch (componenta){
            case USA: return new Usa( culoare, material, esteDetasabil);
            default:
                throw new IllegalArgumentException("Parametul este gresit");
        }
    }
}
