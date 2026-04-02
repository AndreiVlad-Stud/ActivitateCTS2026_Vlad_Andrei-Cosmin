package singleton_registry.exemplul3.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bicicleta implements IBicicleta{
    private int codStatie;
    private String model;
    private List<String> clientiCareAuInchiriat;
    private static HashMap<Integer,Bicicleta> key = new HashMap<>();

    private Bicicleta(int codStatie, String model) {
        this.codStatie = codStatie;
        this.model = model;
        this.clientiCareAuInchiriat = new ArrayList<>();
    }

    public static synchronized Bicicleta getInstance(int codStatie, String model){
        if (model == null || model.trim().isEmpty()){
            System.out.println("Introduceti un model valid!");
        }

        if (!key.containsKey(codStatie)){
            key.put(codStatie,new Bicicleta(codStatie,model));
        }
        return key.get(codStatie);

    }



    @Override
    public void inchiriaza(String numeClient) {
        if (numeClient == null || numeClient.trim().isEmpty()){
            throw new RuntimeException("Introduceti un model valid!");
        }
        clientiCareAuInchiriat.add(numeClient);
    }

    @Override
    public void afiseazaStatus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cod statie: ").append(codStatie).append(" | ");
        builder.append("Model: ").append(model).append(" | ");
        builder.append("Lista clienti pentru aceasta statie: ").append(clientiCareAuInchiriat);
        builder.append("\n");
        System.out.println(builder);
    }
}
