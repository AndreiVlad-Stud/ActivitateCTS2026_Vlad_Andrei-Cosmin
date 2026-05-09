package Flyweight.Classes;

public class Linie implements LinieAbstract{

    private String porimaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(String porimaStatie, String ultimaStatie, int nrLinie) {
        this.porimaStatie = porimaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Prima statie " + this.porimaStatie + " Ultima " + this.ultimaStatie +" Numar linie " + this.nrLinie + " autobuz: " + autobuz.toString());
    }

    @Override
    public void nrMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Numar max de calatori intre statia " + this.porimaStatie + " si statia "+ this.ultimaStatie + " este de "
                + autobuz.getNrLocuri());
    }
}
