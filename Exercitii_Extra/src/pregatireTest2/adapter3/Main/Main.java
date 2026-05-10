package pregatireTest2.adapter3.Main;

import pregatireTest2.adapter3.Classes.AbonamentCorporateExtern;
import pregatireTest2.adapter3.Classes.AbonamentFitness;
import pregatireTest2.adapter3.Classes.AbonamentStandard;
import pregatireTest2.adapter3.Classes.AdapterAbonamentCorporate;

public class Main {
    public static void main(String[] args) {

        AbonamentFitness abonamentStandard = new AbonamentStandard(1, "Andrei", "Gold", 3);

        abonamentStandard.verificaAcces();
        abonamentStandard.verificaAcces();

        AbonamentCorporateExtern abonamentCorporateExtern = new AbonamentCorporateExtern("BADGE123", "Metro Systems", "Mihai Popescu", true);

        AbonamentFitness adapterCorporate = new AdapterAbonamentCorporate(2, "Mihai Popescu", abonamentCorporateExtern);

        adapterCorporate.verificaAcces();
    }
}
