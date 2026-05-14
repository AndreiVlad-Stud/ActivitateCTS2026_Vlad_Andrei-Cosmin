package pregatireTest2.decorator2.Classes;

public abstract class ABonDecorat implements IPrinteazaBon{
    protected IPrinteazaBon bon;

    public ABonDecorat(IPrinteazaBon bon) {
        this.bon = bon;
    }
}
