package singleton.exemplul6.classes;

public class RezervareSala extends ARezervareSala{
    private static RezervareSala instance = null;

    private RezervareSala(String numeSala, int capacitate) {
        super(numeSala, capacitate);
    }

    public static  synchronized RezervareSala getInstance(String numeSala, int capacitate){
        if (instance == null){
            instance = new RezervareSala(numeSala,capacitate);
        }
        return instance;
    }

    @Override
    public void adaugaRezervare(String interval) {
        if (interval == null || interval.trim().isEmpty()) {
            System.out.println("Va rugam adaugati un interval de rezervare");
            return;
        }
        if (super.intervaleRezervate.contains(interval)) {
            System.out.println("Rezervarea deja exista");
            return;
        }
        super.intervaleRezervate.add(interval);
    }

    @Override
    public void afiseazaRezervari() {
        StringBuilder builder = new StringBuilder();
        builder.append("Detaliile rezervarii sunt: ");
        builder.append("\n");
        builder.append("Denumire Sala: ").append(super.numeSala);
        builder.append("\n");
        builder.append("Capacitate: ").append(super.capacitate);
        builder.append("\n");
        builder.append("Lista Rezervarilor: ").append(super.intervaleRezervate);
        builder.append("\n");
        System.out.println(builder);
    }
}
