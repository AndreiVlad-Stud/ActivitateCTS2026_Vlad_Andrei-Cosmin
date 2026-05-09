package Chain.Main;

import Chain.Classes.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieAutobuz.recomandaCalatorie(4));
        System.out.println(calatorieTramvai.recomandaCalatorie(8));
        System.out.println(calatorieMetrou.recomandaCalatorie(20));
    }
}
