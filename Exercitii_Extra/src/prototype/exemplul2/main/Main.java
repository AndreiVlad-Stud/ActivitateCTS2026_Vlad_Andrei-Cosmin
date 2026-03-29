package prototype.exemplul2.main;

import prototype.exemplul2.clase.ConfigurareSistem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaNoua = new ArrayList<>();
        listaNoua.add("IntelliJ");
        listaNoua.add("Visual Studio Code");
        listaNoua.add("Euro Truck Simulator 2");
        ConfigurareSistem configurare1 = new ConfigurareSistem("Ultimate System", "V 2.56D", listaNoua);
        configurare1.afiseazaConfigurare();

        ConfigurareSistem configurare2 = (ConfigurareSistem) configurare1.clone();
        configurare2.setNumeSistem("Ultimate System 2");
        configurare2.afiseazaConfigurare();

        ConfigurareSistem configurare3 = (ConfigurareSistem) configurare1.clone();
        configurare3.setVersiuneSistemOperare("V 2.66X");
        configurare3.afiseazaConfigurare();

        ConfigurareSistem configurare4 = (ConfigurareSistem) configurare1.clone();
        List<String> listaNoua2 = new ArrayList<>();
        listaNoua2.add("PUBG");
        listaNoua2.add("LoL");
        listaNoua2.add("CS2");

        configurare4.setListaAplicatiiInstalate(listaNoua2);
        configurare4.setNumeSistem("Ultimate Gaming System 2");
        configurare4.afiseazaConfigurare();

    }
}
