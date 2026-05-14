package pregatireTest2.strategy2.Classes;

public class LivrareRapida implements ICalculareLivrare{
    @Override
    public double calculareLivrare(double cost) {
        return cost * 1.15;
    }
}
