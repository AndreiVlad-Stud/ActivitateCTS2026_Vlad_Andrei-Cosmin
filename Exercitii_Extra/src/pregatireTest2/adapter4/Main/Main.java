package pregatireTest2.adapter4.Main;

import pregatireTest2.adapter4.Classes.AbonamentDigital;
import pregatireTest2.adapter4.Classes.AdapterTichet;
import pregatireTest2.adapter4.Classes.IValideazaTichet;
import pregatireTest2.adapter4.Classes.Tichet;

public class Main {
    public static void main(String[] args) {
        IValideazaTichet tichetSimplu = new Tichet();
        tichetSimplu.valideazaTichet();

        AbonamentDigital abonamentDigital = new AbonamentDigital();

        IValideazaTichet tichetDigital = new AdapterTichet(abonamentDigital);
        tichetDigital.valideazaTichet();
    }
}
