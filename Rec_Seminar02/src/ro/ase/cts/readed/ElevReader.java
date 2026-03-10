package ro.ase.cts.readed;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    protected String numeFisier;

    public ElevReader(String numeFisier, String numeFisier1) {
        super(numeFisier);
        this.numeFisier = numeFisier1;
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            super.readAplicant(input2, e);
            int clasa = input2.nextInt();
            String tutore = input2.next();

            e.setTutore(tutore);
            e.setClasa(clasa);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
