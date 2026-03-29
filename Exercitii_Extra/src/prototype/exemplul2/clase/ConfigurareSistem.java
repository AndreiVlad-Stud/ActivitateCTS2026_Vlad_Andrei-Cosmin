package prototype.exemplul2.clase;

import java.util.ArrayList;
import java.util.List;

public class ConfigurareSistem implements ConfigurarePrototype{
    private String numeSistem;
    private String versiuneSistemOperare;
    private List<String> listaAplicatiiInstalate = new ArrayList<>();

    public ConfigurareSistem(String numeSistem, String versiuneSistemOperare, List<String> listaAplicatiiInstalate) {
        this.numeSistem = numeSistem;
        this.versiuneSistemOperare = versiuneSistemOperare;
        this.listaAplicatiiInstalate = new ArrayList<>(listaAplicatiiInstalate); // e mai curat asa
    }

    public void setNumeSistem(String numeSistem) {
        this.numeSistem = numeSistem;
    }

    public void setVersiuneSistemOperare(String versiuneSistemOperare) {
        this.versiuneSistemOperare = versiuneSistemOperare;
    }

    public void setListaAplicatiiInstalate(List<String> listaAplicatiiInstalate) {
        this.listaAplicatiiInstalate = new ArrayList<>(listaAplicatiiInstalate); //aici e mai safe sa face setterul asa fata de versiunea de baza
    }

    @Override
    public ConfigurarePrototype clone() {
        List<String> listaNoua = new ArrayList<>(this.listaAplicatiiInstalate);
        return new ConfigurareSistem(this.numeSistem,this.versiuneSistemOperare,listaNoua); //atentie mare aici sa folosim lista corecta( cea de mai sus) nu lista initiala
    }

    @Override
    public List<String> getListaAplicatiiInstalate() {
        return this.listaAplicatiiInstalate;
    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        this.listaAplicatiiInstalate.add(numeAplicatie);
        StringBuilder builder = new StringBuilder();
        builder.append("Aplicatia ").append(numeAplicatie).append(" a fost instalata.");
        System.out.println(builder);
    }

    @Override
    public void afiseazaConfigurare() {
        StringBuilder builder = new StringBuilder();
        builder.append("Configuratia curenta:\n");
        builder.append("-> Denumire Sistem: ").append(numeSistem).append("\n");
        builder.append("-> Versiune Sistem de Operare: ").append(versiuneSistemOperare).append("\n");
        builder.append("-> Lista Aplicatii Instalate: ").append(listaAplicatiiInstalate).append("\n");
        builder.append("\n");

        System.out.println(builder);
    }
}
