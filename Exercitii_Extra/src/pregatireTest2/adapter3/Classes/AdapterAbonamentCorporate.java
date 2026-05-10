package pregatireTest2.adapter3.Classes;

public class AdapterAbonamentCorporate extends AbonamentFitness {
    private AbonamentCorporateExtern abonamentCorporateExtern;

    public AdapterAbonamentCorporate(int idAbonament, String numeClient,
                                     AbonamentCorporateExtern abonamentCorporateExtern) {
        super(idAbonament, numeClient);
        this.abonamentCorporateExtern = abonamentCorporateExtern;
    }

    @Override
    public void verificaAcces() {
        abonamentCorporateExtern.valideazaBadgeCorporate();
    }
}