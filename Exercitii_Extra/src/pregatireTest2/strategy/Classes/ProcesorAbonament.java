package pregatireTest2.strategy.Classes;

public class ProcesorAbonament {
    private IStrategieReducere strategieReducere;

    public ProcesorAbonament(IStrategieReducere strategieReducere) {
        this.strategieReducere = strategieReducere;
    }

    public void setStrategieReducere(IStrategieReducere strategieReducere) {
        this.strategieReducere = strategieReducere;
    }

    public void reducereAbonament(double pretInitial){
        System.out.println(strategieReducere.calculeazaPretFinal(pretInitial));
    }
}
