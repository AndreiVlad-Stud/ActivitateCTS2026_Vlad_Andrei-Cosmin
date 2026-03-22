package acs.ase.ro.FactoryMehtod.classes;

public class DesertFabrica implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipDesert.PAPANASI:
                return new Papanasi(gramaj, denumire,calorii);
            case TipDesert.CLATITE:
                return new Clatite(gramaj,denumire,calorii);
            default:
                return null;
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire,500);
    }
}