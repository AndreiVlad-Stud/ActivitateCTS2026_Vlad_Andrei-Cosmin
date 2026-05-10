package pregatireTest1.factory_method.exemplul2.fabrici;

import pregatireTest1.factory_method.exemplul2.clase.EFisa;
import pregatireTest1.factory_method.exemplul2.clase.Fisa;
import pregatireTest1.factory_method.exemplul2.clase.FisaDiagnoza;

import java.util.List;

public class FisaDiagnozaFactory implements IFisaFactory {
    @Override
    public Fisa getFisa(EFisa tipFisa, String numeClient, float costEstimativ, List<String> operatiuni) {
        return new FisaDiagnoza(numeClient,costEstimativ,operatiuni);
    }
}
