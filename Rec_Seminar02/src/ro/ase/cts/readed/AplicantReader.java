package ro.ase.cts.readed;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    protected String numeFisier;

    public AplicantReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    List<Aplicant> readAplicanti() throws FileNotFoundException {
        return null;
    }

    protected void readAplicant(Scanner input, Aplicant outAplicant){
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setVarsta(varsta);
        outAplicant.setNr_proiecte(nr);
    }
}
