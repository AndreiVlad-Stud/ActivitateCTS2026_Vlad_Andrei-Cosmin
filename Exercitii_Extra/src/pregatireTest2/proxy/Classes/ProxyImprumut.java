package pregatireTest2.proxy.Classes;

public class ProxyImprumut implements ICarte{
    private ImprumutCarte imprumutCarte;
    private boolean areAbonamentActiv;

    public ProxyImprumut(ImprumutCarte imprumutCarte, boolean areAbonamentActiv) {
        this.imprumutCarte = imprumutCarte;
        this.areAbonamentActiv = areAbonamentActiv;
    }

    @Override
    public void imprumutaCarte() {
        if(areAbonamentActiv){
            imprumutCarte.imprumutaCarte();
        }else {
            System.out.println("Cititorul nu are abonament activ!");
        }
    }
}
