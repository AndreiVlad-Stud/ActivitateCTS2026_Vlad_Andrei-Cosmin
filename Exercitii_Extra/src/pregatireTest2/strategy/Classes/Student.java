package pregatireTest2.strategy.Classes;

public class Student implements IStrategieReducere{

    @Override
    public double calculeazaPretFinal(double pretInitial) {
        return pretInitial*0.80;
    }
}
