package factory_method.exemplul2.main;

import factory_method.exemplul2.clase.EFisa;
import factory_method.exemplul2.clase.Fisa;
import factory_method.exemplul2.fabrici.FisaDiagnozaFactory;
import factory_method.exemplul2.fabrici.FisaRevizieFactory;
import factory_method.exemplul2.fabrici.IFisaFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> operatiuniDiagnoza = new ArrayList<>();
        operatiuniDiagnoza.add("Verificare ECU");

        List<String> operatiuniRevizie = new ArrayList<>();
        operatiuniRevizie.add("Schimb Ulei");
        operatiuniRevizie.add("Schimb Filtre");

        List<String> operatiuniVopsitorie = new ArrayList<>();
        operatiuniVopsitorie.add("Sablare");
        operatiuniVopsitorie.add("Vopsire");

        IFisaFactory fisaFactory = new FisaDiagnozaFactory();
        Fisa fisa1 = fisaFactory.getFisa(EFisa.DIAGNOZA, "Bogdan", 22554, operatiuniDiagnoza);

        IFisaFactory fisaFactory2 = new FisaRevizieFactory();
        Fisa fisa2 = fisaFactory2.getFisa(EFisa.REVIZIE, "Gigel", 5255, operatiuniRevizie);

        fisa1.afiseazaDetalii();
        fisa2.afiseazaDetalii();

    }
}
