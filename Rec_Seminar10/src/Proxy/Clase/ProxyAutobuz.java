package Proxy.Clase;

public class ProxyAutobuz implements IMijlocDeTransport{

    private Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        //aici este proxy-ul (conditia)
        if(autobuz.getNrCalatori() > 0){
            autobuz.opresteInStatie();
        }else{
            System.out.println("Autobuzul " + autobuz.getLinie() + " se retrage in autobaza");
        }
    }
}
