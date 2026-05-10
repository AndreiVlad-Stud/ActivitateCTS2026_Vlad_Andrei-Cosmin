package pregatireTest2.adapter2.Main;

import pregatireTest2.adapter2.Classes.AdapterComanda;
import pregatireTest2.adapter2.Classes.ComandaInterna;
import pregatireTest2.adapter2.Classes.CurierExtern;
import pregatireTest2.adapter2.Classes.IConfirmareComanda;

public class Main {
    public static void main(String[] args) {
        IConfirmareComanda comandaInterna = new ComandaInterna(2541,"HR","Finante");
        comandaInterna.confirmaComanda();

        CurierExtern comandaExterna = new CurierExtern("52asAD56",22,"Finante","Strada Bulevard 2 Bucuresti");

        IConfirmareComanda adapterComandaExterna = new AdapterComanda(comandaExterna);

        adapterComandaExterna.confirmaComanda();
    }
}
