package simple_factory.exemplul3.main;

import simple_factory.exemplul3.classes.Prajitura;
import simple_factory.exemplul3.factory.FabricaPrajituri;
import simple_factory.exemplul3.factory.TipPrajitura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> ingredienteTort = new ArrayList<>();
        ingredienteTort.add("faina");
        ingredienteTort.add("ciocolata");
        ingredienteTort.add("oua");

        List<String> ingredienteAmandina = new ArrayList<>();
        ingredienteAmandina.add("cacao");
        ingredienteAmandina.add("rom");
        ingredienteAmandina.add("unt");

        List<String> ingredienteEcler = new ArrayList<>();
        ingredienteEcler.add("lapte");
        ingredienteEcler.add("vanilie");
        ingredienteEcler.add("oua");

        Prajitura tort = FabricaPrajituri.crearePrajitura(
                TipPrajitura.TORT, "Tort Sacher", 1200, 95.5f, ingredienteTort);

        Prajitura amandina = FabricaPrajituri.crearePrajitura(
                TipPrajitura.AMANDINA, "Amandina clasica", 250, 18.5f, ingredienteAmandina);

        Prajitura ecler = FabricaPrajituri.crearePrajitura(
                TipPrajitura.ECLER, "Ecler vanilie", 180, 14.0f, ingredienteEcler);

        tort.afiseazaDetalii();
        amandina.afiseazaDetalii();
        ecler.afiseazaDetalii();
    }
}
