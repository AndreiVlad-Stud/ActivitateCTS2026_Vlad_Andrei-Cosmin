package pregatireTest1.factory_method.exemplul2.fabrici;

import pregatireTest1.factory_method.exemplul2.clase.*;
import pregatireTest1.factory_method.exemplul2.clase.EFisa;
import pregatireTest1.factory_method.exemplul2.clase.Fisa;

import java.util.List;

public interface IFisaFactory {
    public Fisa getFisa(EFisa tipFisa, String numeClient, float costEstimativ, List<String> operatiuni);
}

