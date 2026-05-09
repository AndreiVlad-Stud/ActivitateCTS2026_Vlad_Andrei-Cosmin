package Proxy.Clase;

public class ProxyAutobuzCursaSpeciala implements IMijlocDeTransport{
    private Autobuz autobuz;

    public ProxyAutobuzCursaSpeciala(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getLinie() < 0){
            System.out.println("Autobuzul este in cursa speciala");
        }else{
            autobuz.opresteInStatie();
        }
    }
}
