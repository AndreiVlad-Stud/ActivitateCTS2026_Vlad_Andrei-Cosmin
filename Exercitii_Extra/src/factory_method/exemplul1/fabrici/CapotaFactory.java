package factory_method.exemplul1.fabrici;

import factory_method.exemplul1.clase.*;

public class CapotaFactory implements ComponentaFactory{
    @Override
    public Componenta getComponenta(EComponenta componenta, String culoare, String material, boolean esteDetasabil) {
        switch (componenta){
            case CAPOTA: return new Capota( culoare, material, esteDetasabil);
            default:
                throw new IllegalArgumentException("Parametul este gresit");
        }
    }
}
