package Chain.Classes;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 10){
            return "TRAMVAI";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
