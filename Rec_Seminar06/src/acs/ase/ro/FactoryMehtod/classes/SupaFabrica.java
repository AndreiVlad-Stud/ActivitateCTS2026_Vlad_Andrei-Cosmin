package acs.ase.ro.FactoryMehtod.classes;

public class SupaFabrica implements FelDeMancareFabrica{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tip,gramaj,denumire);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        switch (tip){
            case TipSupa.SUPA_CREMA:
                return new SupaCrema(gramaj, denumire);
            case TipSupa.CIORBA:
                return new Ciorba(gramaj,denumire);

            default:
                return null;
        }
    }
}
