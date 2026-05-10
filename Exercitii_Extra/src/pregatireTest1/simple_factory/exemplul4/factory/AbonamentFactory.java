package pregatireTest1.simple_factory.exemplul4.factory;

import pregatireTest1.simple_factory.exemplul4.classes.AbonamentBasic;
import pregatireTest1.simple_factory.exemplul4.classes.AbonamentPremium;
import pregatireTest1.simple_factory.exemplul4.classes.AbonamentStandard;
import pregatireTest1.simple_factory.exemplul4.classes.IAbonament;
import pregatireTest1.simple_factory.exemplul4.classes.*;

import java.util.List;

public class AbonamentFactory {
    public static IAbonament getAbonament (TipAbonament tipAbonament, String numeAbonat, float pretBaza, List<String> beneficiiIncluse){
        switch (tipAbonament){
            case BASIC -> {
                return new AbonamentBasic(numeAbonat,pretBaza,beneficiiIncluse);
            }
            case STANDARD ->
            {
                return new AbonamentStandard(numeAbonat,pretBaza,beneficiiIncluse);
            }
            case PREMIUM ->
            {
                return new AbonamentPremium(numeAbonat,pretBaza,beneficiiIncluse);
            }
            default ->
                throw new RuntimeException("Tipul introdus nu exista");
        }
    }
}
