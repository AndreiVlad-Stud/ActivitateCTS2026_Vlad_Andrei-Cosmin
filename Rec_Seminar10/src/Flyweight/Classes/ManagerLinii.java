package Flyweight.Classes;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinii {
    Map<Integer, Linie> registru = new HashMap<>();

    public Linie getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        if (registru.containsKey(nrLinie)){
            return registru.get(nrLinie);
        } else {
            registru.put(nrLinie, new Linie(primaStatie, ultimaStatie, nrLinie));
            return registru.get(nrLinie);
        }
    }
}
