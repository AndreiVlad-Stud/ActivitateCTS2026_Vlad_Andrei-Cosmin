package pregatireTest2.proxy2.Classes;

public class ProxyAplicatie implements IVizionare{
    private Aplicatie aplicatie;
    private boolean areAbonament;

    public ProxyAplicatie(Aplicatie aplicatie, boolean areAbonament) {
        this.aplicatie = aplicatie;
        this.areAbonament = areAbonament;
    }

    @Override
    public void accesVizionare() {
        if (areAbonament){
            aplicatie.accesVizionare();
        }else {
            System.out.println("Nu aveti abonament activ!");
        }
    }
}
