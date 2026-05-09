package Chain.Classes;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setSuccesor(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandaCalatorie(double distanta);
}
