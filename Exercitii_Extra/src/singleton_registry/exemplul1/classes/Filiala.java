package singleton_registry.exemplul1.classes;

import java.util.HashMap;

public class Filiala {
    private String oras;
    private String denumireFiliala;
    private int nrAngajati;
    private static HashMap<String, Filiala> filiale = new HashMap<>();

    private Filiala(String oras, String denumireFiliala, int nrAngajati) {
        this.oras = oras;
        this.denumireFiliala = denumireFiliala;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized Filiala getInstance(String oras, String denumireFiliala, int nrAngajati) {
        if (oras == null || oras.isEmpty()) {
            throw new IllegalArgumentException("Orasul nu poate fi null sau gol.");
        }

        if (nrAngajati <= 0) {
            throw new IllegalArgumentException("Numarul de angajati trebuie sa fie pozitiv.");
        }

        if (!filiale.containsKey(oras)) {
            filiale.put(oras, new Filiala(oras, denumireFiliala, nrAngajati));
        }

        return filiale.get(oras);
    }

    public void afisareFiliala() {
        StringBuilder builder = new StringBuilder();
        builder.append("Oras: ").append(oras).append("; ");
        builder.append("Denumire filiala: ").append(denumireFiliala).append("; ");
        builder.append("Numar angajati: ").append(nrAngajati).append(".");
        System.out.println(builder);
    }
}