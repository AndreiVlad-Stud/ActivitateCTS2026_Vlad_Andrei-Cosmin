package pregatireTest2.strategy2.Classes;

public class Livrare {
    private ICalculareLivrare calculareLivrare;

    public Livrare(ICalculareLivrare calculareLivrare) {
        this.calculareLivrare = calculareLivrare;
    }

    public void calculFinal(double TransportInitial){
        System.out.println(calculareLivrare.calculareLivrare(TransportInitial));
    }
}
