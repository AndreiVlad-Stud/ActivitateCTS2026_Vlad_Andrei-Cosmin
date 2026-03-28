package singleton.exemplul3.classes;

public class SalaSpectacol {
    private String numeSala;
    private int nrLocuri;
    private int locuriOcupate;
    private static SalaSpectacol instance = null;

    private SalaSpectacol(String numeSala, int nrLocuri, int locuriOcupate) {
        this.numeSala = numeSala;
        this.nrLocuri = nrLocuri;
        this.locuriOcupate = locuriOcupate;
    }

    public static synchronized SalaSpectacol getInstance(String numeSala, int nrLocuri, int locuriOcupate) {
        if (instance == null) {
            if (locuriOcupate > nrLocuri) {
                throw new IllegalArgumentException("Locurile ocupate nu pot depasi numarul total de locuri.");
            }
            instance = new SalaSpectacol(numeSala, nrLocuri, locuriOcupate);
        }
        return instance;
    }

    public void confirmareRezervare() {
        if (locuriOcupate < nrLocuri) {
            locuriOcupate++;
            System.out.println("Rezervarea a fost realizata cu succes.");
        } else {
            System.out.println("Sala nu mai dispune de locuri disponibile.");
        }
    }

    public void detaliiRezervare() {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalii sala: ").append(numeSala).append(". ");
        builder.append("Numar total locuri: ").append(nrLocuri).append(". ");
        builder.append("Locuri ocupate: ").append(locuriOcupate).append(". ");
        builder.append("Locuri disponibile: ").append(nrLocuri - locuriOcupate).append(".");
        System.out.println(builder);
    }
}