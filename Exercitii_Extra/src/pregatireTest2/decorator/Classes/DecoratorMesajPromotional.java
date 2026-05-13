package pregatireTest2.decorator.Classes;

public class DecoratorMesajPromotional extends ADecoratorBilet{
    private String mesajPromotional;

    public DecoratorMesajPromotional(IBilet bilet, String mesajPromotional) {
        super(bilet);
        this.mesajPromotional = mesajPromotional;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
        StringBuilder sb = new StringBuilder();
        sb.append(mesajPromotional).append("\n");
        sb.append("======================");
        System.out.println(sb);
    }
}
