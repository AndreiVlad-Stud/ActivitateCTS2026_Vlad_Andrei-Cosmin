package Chain.Classes;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 3){
            return "TROLEIBUZ";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
