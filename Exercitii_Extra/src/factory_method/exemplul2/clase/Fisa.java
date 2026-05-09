package factory_method.exemplul2.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Fisa {
    protected String numeClient;
    protected float costEstimativ;
    protected List<String> operatiuni;

    public Fisa(String numeClient, float costEstimativ, List<String> operatiuni) {
        this.numeClient = numeClient;
        this.costEstimativ = costEstimativ;
        this.operatiuni = new ArrayList<>(operatiuni);
    }


    public abstract void afiseazaDetalii();
}
