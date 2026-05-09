package factory_method.exemplul2.fabrici;

import factory_method.exemplul2.clase.*;

import java.util.List;

public interface IFisaFactory {
    public Fisa getFisa(EFisa tipFisa, String numeClient, float costEstimativ, List<String> operatiuni);
}

