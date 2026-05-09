package Chain.Classes;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 5){
            return "AUTOBUZ";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
