package singleton.exemplul5.classes;

import java.util.ArrayList;
import java.util.List;

public class RegistruRezervari implements IRegistruRezervari{
    private List<String> listaRezervari;
    private static RegistruRezervari instance = null;

    private RegistruRezervari() {
        this.listaRezervari = new ArrayList<>();
    }

    public static synchronized RegistruRezervari getInstance() {
        if (instance == null) {
            instance = new RegistruRezervari();
        }
        return instance;
    }

    @Override
    public void adaugaRezervare(String numeClient) {
        if (numeClient == null || numeClient.trim().isEmpty()) {
            System.out.println("Nume invalid");
            return;
        }

        if (this.listaRezervari.contains(numeClient)) {
            System.out.println("Rezervarea exista deja");
            return;
        }

        this.listaRezervari.add(numeClient);
    }

    @Override
    public void afiseazaRezervari() {
        System.out.println("Rezervari: " + this.listaRezervari);
    }
}
