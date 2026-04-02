package simple_factory.exemplul4.main;

import simple_factory.exemplul4.classes.Abonament;
import simple_factory.exemplul4.classes.IAbonament;
import simple_factory.exemplul4.factory.AbonamentFactory;
import simple_factory.exemplul4.factory.TipAbonament;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> beneficiiBasic = new ArrayList<>();
        beneficiiBasic.add("Vizionare SD");
        beneficiiBasic.add("1 dispozitiv");

        List<String> beneficiiStandard = new ArrayList<>();
        beneficiiStandard.add("Vizionare HD");
        beneficiiStandard.add("2 dispozitive");

        List<String> beneficiiPremium = new ArrayList<>();
        beneficiiPremium.add("Vizionare 4K");
        beneficiiPremium.add("4 dispozitive");

        IAbonament abonament1 = AbonamentFactory.getAbonament(
                TipAbonament.BASIC, "Andrei", 50, beneficiiBasic);

        IAbonament abonament2 = AbonamentFactory.getAbonament(
                TipAbonament.STANDARD, "Maria", 70, beneficiiStandard);

        IAbonament abonament3 = AbonamentFactory.getAbonament(
                TipAbonament.PREMIUM, "Ion", 100, beneficiiPremium);

        abonament1.afiseazaDescriere();
        System.out.println("Pret final: " + abonament1.calculeazaPretFinal());

        abonament2.afiseazaDescriere();
        System.out.println("Pret final: " + abonament2.calculeazaPretFinal());

        abonament3.afiseazaDescriere();
        System.out.println("Pret final: " + abonament3.calculeazaPretFinal());
    }
}
