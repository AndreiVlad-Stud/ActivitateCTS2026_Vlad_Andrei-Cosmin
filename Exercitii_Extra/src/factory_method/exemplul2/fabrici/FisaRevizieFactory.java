package factory_method.exemplul2.fabrici;

import factory_method.exemplul2.clase.EFisa;
import factory_method.exemplul2.clase.Fisa;
import factory_method.exemplul2.clase.FisaRevizie;
import factory_method.exemplul2.clase.FisaVopsitorie;

import java.util.List;

public class FisaRevizieFactory implements IFisaFactory{
    @Override
    public Fisa getFisa(EFisa tipFisa, String numeClient, float costEstimativ, List<String> operatiuni) {
        return new FisaRevizie(numeClient,costEstimativ,operatiuni);
    }
}
