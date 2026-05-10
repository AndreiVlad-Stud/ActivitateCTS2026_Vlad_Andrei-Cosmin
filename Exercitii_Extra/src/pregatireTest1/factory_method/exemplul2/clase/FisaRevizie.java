package pregatireTest1.factory_method.exemplul2.clase;

import java.util.List;

public class FisaRevizie extends Fisa{
    public FisaRevizie(String numeClient, float costEstimativ, List<String> operatiuni) {
        super(numeClient, costEstimativ, operatiuni);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalii Fisa Revizie: ");
        builder.append("\n");
        builder.append("Nume Client: ").append(numeClient);
        builder.append("\n");
        builder.append("Cost estimativ: ").append(costEstimativ);
        builder.append("\n");
        builder.append("Operatiuni necesare: ").append(operatiuni);
        builder.append("\n");
        System.out.println(builder);
    }
}
