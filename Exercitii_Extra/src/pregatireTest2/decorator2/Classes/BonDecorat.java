package pregatireTest2.decorator2.Classes;

public class BonDecorat extends ABonDecorat{
    private int codReducere;

    public BonDecorat(IPrinteazaBon bon, int codReducere) {
        super(bon);
        this.codReducere = codReducere;
    }

    @Override
    public void printeazaBon() {
        bon.printeazaBon();
        System.out.println("Ati primit urmatorul cod de reducere: "+codReducere);
    }
}
