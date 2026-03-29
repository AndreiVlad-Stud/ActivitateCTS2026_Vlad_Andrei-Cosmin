package prototype.exemplul1.clase;

public class Invitatie implements InvitatiePrototype{
    private String numeEveniment;
    private String numeInvitat;
    private int numarLoc;
    private boolean areAccessVip;

    public Invitatie(String numeEveniment, String numeInvitat, int numarLoc, boolean areAccessVip) {
        this.numeEveniment = numeEveniment;
        this.numeInvitat = numeInvitat;
        this.numarLoc = numarLoc;
        this.areAccessVip = areAccessVip;
    }


    public void setNumeEveniment(String numeEveniment) {
        this.numeEveniment = numeEveniment;
    }

    public void setNumeInvitat(String numeInvitat) {
        this.numeInvitat = numeInvitat;
    }

    public void setNumarLoc(int numarLoc) {
        this.numarLoc = numarLoc;
    }

    public void setAreAccessVip(boolean areAccessVip) {
        this.areAccessVip = areAccessVip;
    }

    @Override
    public InvitatiePrototype clone() {
        return new Invitatie(this.numeEveniment, this.numeInvitat, this.numarLoc, this.areAccessVip);
    }

    @Override
    public String toString() {
        return "Invitatie{" +
                "numeEveniment='" + numeEveniment + '\'' +
                ", numeInvitat='" + numeInvitat + '\'' +
                ", numarLoc=" + numarLoc +
                ", areAccessVip=" + areAccessVip +
                '}';
    }
}
