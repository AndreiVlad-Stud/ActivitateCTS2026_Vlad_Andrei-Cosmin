package singleton_registry.exemplul2.classes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cuptor {
    private float temperaturaMaxima;
    private String producator;
    private List<String> produseCoapte;
    private static final HashMap<Float, Cuptor> key = new HashMap<>();

    private Cuptor(float temperaturaMaxima, String producator) {
        this.temperaturaMaxima = temperaturaMaxima;
        this.producator = producator;
        this.produseCoapte = new ArrayList<>();
    }

    public static synchronized Cuptor getInstance(float temperaturaMaxima, String producator){
       if (temperaturaMaxima <= 80){ //pare logic ca un cuport sa nu coboare sub temperatura asta
           System.out.println("Introduceti o temperatura corecta!");
       }
       if (producator == null || producator.trim().isEmpty()){
           System.out.println("Va rugam sa introduceti un producator!");
       }

        if (!key.containsKey(temperaturaMaxima)) {
            key.put(temperaturaMaxima, new Cuptor(temperaturaMaxima,producator));
        }
        return key.get(temperaturaMaxima);
    }

    public void coaceProdus(String numeProdus){
        if (numeProdus == null || numeProdus.trim().isEmpty()){
            System.out.println("Introduceti cel putin un produs in lista de coacere!");
            return;
        }
        if (produseCoapte.contains(numeProdus)){
            System.out.println("Ati introdus deja produsul" + numeProdus);
            return;
        }
        produseCoapte.add(numeProdus);
    }

    public void afiseazaDetalii(){
        StringBuilder builder = new StringBuilder();
        builder.append("Cuptorul marca: ").append(producator);
        builder.append(" este setat la temperatura ").append(temperaturaMaxima);
        builder.append(" si coace urmatoarele produse: ").append(produseCoapte);
        builder.append("\n");
        System.out.println(builder);
    }


}
