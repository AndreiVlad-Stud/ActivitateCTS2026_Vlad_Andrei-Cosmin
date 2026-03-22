package acs.ase.ro.Prototype.Classes;

public class Rezervare implements IRezervare{
    private String nume;
    private int oraRezervare;
    private int nrPersoane;
    private String nrCard;

    public Rezervare(String nume, int oraRezervare, int nrPersoane, String nrCard) {
        this.nume = nume;
        if(oraRezervare >=11&&oraRezervare<=22){
            this.oraRezervare = oraRezervare;
        }else {
            this.oraRezervare = 11;
        }

        this.nrPersoane = nrPersoane;

        if(nrCard.length() == 16){
            this.nrCard = nrCard;
        }else
        {
            this.nrCard = "0000000000000000";
        }

    }

    private Rezervare() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.oraRezervare = this.oraRezervare;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.nrCard = this.nrCard;

        return rezervare;
    }
}