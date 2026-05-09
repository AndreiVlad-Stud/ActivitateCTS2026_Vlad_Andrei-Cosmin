package Proxy.Clase;

public class Autobuz  implements IMijlocDeTransport {

    private Integer linie;
    private Integer nrCalatori;


    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + this.linie + " opreste in statie.");
    }

    public Integer getNrCalatori() {
        return nrCalatori;
    }

    public Integer getLinie() {
        return linie;
    }

    public Autobuz coboaraCalatori(Integer nrCalatoriCareCoboara){
        this.nrCalatori = this.nrCalatori - nrCalatoriCareCoboara;
        return this;
    }

    public Autobuz(Integer linie, Integer nrCalatori) {
        this.linie = linie;
        this.nrCalatori = nrCalatori;
    }
}
