package singleton.exemplul2.clase;

public class Gara {
    private String denumireGara;
    private int nrTotalLinii;
    private int nrTrenuriProgramate;
    private static Gara instance = null;

    private Gara(String denumireGara, int nrTotalLinii, int nrTrenuriProgramate) {
        this.denumireGara = denumireGara;
        this.nrTotalLinii = nrTotalLinii;
        this.nrTrenuriProgramate = nrTrenuriProgramate;
    }

    public static synchronized Gara getInstance(String denumireGara, int nrTotalLinii, int nrTrenuriProgramate) {
        if (instance == null) {
            if (nrTrenuriProgramate > nrTotalLinii) {
                throw new IllegalArgumentException(
                        "Numarul de trenuri programate nu poate depasi numarul total de linii."
                );
            }
            instance = new Gara(denumireGara, nrTotalLinii, nrTrenuriProgramate);
        }
        return instance;
    }

    public void programeazaTren() {
        if (nrTrenuriProgramate < nrTotalLinii) {
            nrTrenuriProgramate++;
            System.out.println("Tren programat cu succes.");
        } else {
            System.out.println("Nu mai exista linii disponibile pentru programarea unui nou tren.");
        }
    }

    public void afisarePlecari() {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalii gara: ");
        builder.append("denumire = ").append(denumireGara);
        builder.append(", numar total linii = ").append(nrTotalLinii);
        builder.append(", trenuri programate = ").append(nrTrenuriProgramate);
        builder.append(", linii libere = ").append(nrTotalLinii - nrTrenuriProgramate);

        System.out.println(builder);
    }
}