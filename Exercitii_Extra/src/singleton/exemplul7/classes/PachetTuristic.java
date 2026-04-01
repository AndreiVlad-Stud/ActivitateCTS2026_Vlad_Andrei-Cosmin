package singleton.exemplul7.classes;

public class PachetTuristic extends APachetTuristic{
    private static PachetTuristic instance = null;

    private PachetTuristic(String agentieTurism, String destinatie, float pretBaza) {
        super(agentieTurism, destinatie, pretBaza);
    }

    public static synchronized PachetTuristic getInstance(String agentieTurism, String destinatie, float pretBaza){
        if (instance == null){
            instance = new PachetTuristic(agentieTurism,destinatie, pretBaza);
        }
        return instance;
    }

    @Override
    public void vindePachet(String codPachet) {
        if (codPachet == null || codPachet.trim().isEmpty()){
            System.out.println("Va rugam introduceti un cod pachet valid!");
            return;
        }
        if (super.coduriPacheteVandute.contains(codPachet)){
            System.out.println("Codul pachet deja exista.");
            return;
        }
        super.coduriPacheteVandute.add(codPachet);
    }

    @Override
    public void afiseazaPacheteVandute() {
        StringBuilder builder = new StringBuilder();
        builder.append("Denumire Agentie: ").append(super.agentieTurism);
        builder.append("\n");
        builder.append("Destinatie: ").append(super.destinatie);
        builder.append("\n");
        builder.append("Pretul de baza: ").append(super.pretBaza);
        builder.append("\n");
        builder.append("Lista coduri vandute: ").append(super.coduriPacheteVandute);
        builder.append("\n");

        System.out.println(builder);
    }
}
