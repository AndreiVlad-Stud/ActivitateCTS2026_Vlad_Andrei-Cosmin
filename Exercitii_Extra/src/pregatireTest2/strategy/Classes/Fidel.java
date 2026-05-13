package pregatireTest2.strategy.Classes;

public class Fidel implements IStrategieReducere{
    @Override
    public double calculeazaPretFinal(double pretInitial) {
        return pretInitial*0.85;
    }
}
