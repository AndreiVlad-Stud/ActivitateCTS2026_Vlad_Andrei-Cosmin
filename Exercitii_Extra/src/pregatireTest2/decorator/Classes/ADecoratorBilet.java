package pregatireTest2.decorator.Classes;

public abstract class ADecoratorBilet implements IBilet{
    protected IBilet bilet;

    public ADecoratorBilet(IBilet bilet) {
        this.bilet = bilet;
    }
}
