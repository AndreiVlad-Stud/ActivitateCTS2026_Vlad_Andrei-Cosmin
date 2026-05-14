package pregatireTest2.strategy2.Classes;

public class LivrareInternationala implements ICalculareLivrare{
    @Override
    public double calculareLivrare(double cost) {
        return cost * 1.3;
    }
}
