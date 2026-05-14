package pregatireTest2.adapter4.Classes;

public class AdapterTichet implements IValideazaTichet{
    private AbonamentDigital abonamentDigital;

    public AdapterTichet(AbonamentDigital abonamentDigital) {
        this.abonamentDigital = abonamentDigital;
    }

    @Override
    public void valideazaTichet() {
        abonamentDigital.validareAbonamentDigital();
    }
}
