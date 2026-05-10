package pregatireTest2.adapter3.Classes;

public abstract class AbonamentFitness {
    protected int idAbonament;
    protected String numeClient;

    public AbonamentFitness(int idAbonament, String numeClient) {
        this.idAbonament = idAbonament;
        this.numeClient = numeClient;
    }

    public abstract void verificaAcces();
}