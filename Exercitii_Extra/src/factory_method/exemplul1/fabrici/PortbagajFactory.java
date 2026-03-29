package factory_method.exemplul1.fabrici;

import factory_method.exemplul1.clase.*;

public class PortbagajFactory implements ComponentaFactory{
    @Override
    public Componenta getComponenta(EComponenta componenta, String culoare, String material, boolean esteDetasabil) {
        switch (componenta){
            case PORTBAGAJ: return new Portbagaj( culoare, material, esteDetasabil);
            default:
                throw new IllegalArgumentException("Parametul este gresit");
        }
    }
}
