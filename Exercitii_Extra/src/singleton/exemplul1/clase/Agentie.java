package singleton.exemplul1.clase;

public class Agentie {
    private String denumire;
    private int pacheteDisponibile;
    private int pacheteVandute;
    private static Agentie instance = null;

    private Agentie(String denumire, int pacheteDisponibile, int pacheteVandute) {
        this.denumire = denumire;
        this.pacheteDisponibile = pacheteDisponibile;
        this.pacheteVandute = pacheteVandute;
    }

    public static synchronized Agentie getInstance(String denumire, int pacheteDisponibile, int pacheteVandute) {
        if (instance == null) {
            if (pacheteVandute > pacheteDisponibile) {
                throw new IllegalArgumentException("Pachetele vandute nu pot depasi pachetele disponibile.");
            }
            instance = new Agentie(denumire, pacheteDisponibile, pacheteVandute);
        }
        return instance;
    }

    public void vindePachet() {
        if (this.pacheteVandute < this.pacheteDisponibile) {
            this.pacheteVandute++;
            System.out.println("S-a vandut un pachet.");
        } else {
            System.out.println("Nu mai exista pachete disponibile.");
        }
    }

    public void afiseazaSituatie() {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalii agentie:\n");
        builder.append("Denumire: ").append(denumire).append("\n");
        builder.append("Pachete totale: ").append(pacheteDisponibile).append("\n");
        builder.append("Pachete vandute: ").append(pacheteVandute).append("\n");
        builder.append("Pachete ramase: ").append(pacheteDisponibile - pacheteVandute);

        System.out.println(builder);
    }
    @Override
    public String toString() {
        return "Detalii Agentie: " +
                "denumire='" + denumire + '\'' +
                ", pacheteDisponibile=" + pacheteDisponibile +
                ", pacheteVandute=" + pacheteVandute;
    }
}