package pregatireTest2.decorator.Classes;

public class DecoratorCodReducere extends ADecoratorBilet{
    private String codReducere;
    private int reducere;
    public DecoratorCodReducere(IBilet bilet, String codReducere, int reducere) {
        super(bilet);
        this.codReducere = codReducere;
        this.reducere = reducere;

    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
        StringBuilder sb =new StringBuilder();
        sb.append("Folositi condul de reducere ").append(codReducere).append(" ");
        sb.append("pentru a beneficia de o reducere de ").append(reducere).append(" %. ");
        sb.append("Reducere valabila pana la 30 de zile de la data cumpararii acestui bilet.\n");
        sb.append("======================");
        System.out.println(sb);
    }
}
