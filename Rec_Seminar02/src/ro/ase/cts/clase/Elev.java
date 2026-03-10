package ro.ase.cts.clase;

public class Elev extends Aplicant{
    private int clasa;
    private String tutore;

    private static int VALOARE_FINANTARE_ELEV = 30;


    public void setClasa(int i) {
        this.clasa = i;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{ ");
        sb.append(super.toString());
        sb.append("clasa= ").append(clasa);
        sb.append(", tutore= '").append(tutore).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Elev() {
        super();
    }

    @Override
    public void afiseazaFinantare() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Elev.VALOARE_FINANTARE_ELEV+" Euro/zi in proiect.");
    }

    public static void setValoareFinantareElev(int VALOARE_FINANTARE_ELEV) {
        Elev.VALOARE_FINANTARE_ELEV = VALOARE_FINANTARE_ELEV;
    }

}
