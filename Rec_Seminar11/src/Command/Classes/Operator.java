package Command.Classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi = new ArrayList<>();

    public void inregistreaza(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaFisa(){
        if (listaComenzi.size()>0){
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }
    }
}
