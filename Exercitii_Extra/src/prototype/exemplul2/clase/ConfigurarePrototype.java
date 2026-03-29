package prototype.exemplul2.clase;

import java.util.List;

public interface ConfigurarePrototype {
    ConfigurarePrototype clone();
    List<String> getListaAplicatiiInstalate();
    void instaleazaAplicatie(String numeAplicatie);
    void afiseazaConfigurare();
}
