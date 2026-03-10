package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readed.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Angajat.setValoareFinantareAngajat(50);
        List<Aplicant> listaAngajati;
        try {
            AngajatReader angajatReader = new AngajatReader("angajati.txt");
            listaAngajati = angajatReader.readAplicanti();
            for(Aplicant angajat:listaAngajati) {
                System.out.println(angajat.toString());
                angajat.afiseazaFinantare();
                angajat.afiseazaStatut();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
