package builder.exemplul1.clase;

import java.util.ArrayList;
import java.util.List;

public class ImagineVirtualaBuilder implements ImagineVirtuala{
    private final String denumire;
    private final List<String> aplicatiiInstalate;

    private ImagineVirtualaBuilder(Builder builder) {
        this.denumire = builder.denumire;
        this.aplicatiiInstalate = new ArrayList<>(builder.aplicatiiInstalate);
    }


    @Override
    public List<String> getAplicatiiInstalate() {
        return new ArrayList<>(this.aplicatiiInstalate);
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Imaginea virtuala : " + this.denumire + " contine aplicatiile : " + this.aplicatiiInstalate);

    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        System.out.println("Nu se mai pot instala aplicatii dupa crearea imaginii virtuale");

    }

    public static class Builder {
        private final String denumire;
        private  List<String> aplicatiiInstalate;

        public Builder(String denumire) {
            this.denumire = denumire;
            this.aplicatiiInstalate = new ArrayList<>();
        }


        public ImagineVirtualaBuilder build(){
            return new ImagineVirtualaBuilder(this);
        }


        public Builder adaugaAplicatie(String numeAplicatie) {
            this.aplicatiiInstalate.add(numeAplicatie);
            return this;
        }


    }
}
