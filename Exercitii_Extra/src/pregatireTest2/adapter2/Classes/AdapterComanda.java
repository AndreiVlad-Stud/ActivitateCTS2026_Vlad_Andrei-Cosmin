package pregatireTest2.adapter2.Classes;

public class AdapterComanda implements IConfirmareComanda{
    private CurierExtern curierExtern;

    public AdapterComanda(CurierExtern curierExtern) {
        this.curierExtern = curierExtern;
    }

    @Override
    public void confirmaComanda() {
        curierExtern.trimiteAWB();
    }
}
