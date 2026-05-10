package pregatireTest1.factory_method.exemplul2.fabrici;

import pregatireTest1.factory_method.exemplul2.clase.EFisa;
import pregatireTest1.factory_method.exemplul2.clase.Fisa;
import pregatireTest1.factory_method.exemplul2.clase.FisaRevizie;

import java.util.List;

public class FisaRevizieFactory implements IFisaFactory{
    @Override
    public Fisa getFisa(EFisa tipFisa, String numeClient, float costEstimativ, List<String> operatiuni) {
        return new FisaRevizie(numeClient,costEstimativ,operatiuni);
    }
}
