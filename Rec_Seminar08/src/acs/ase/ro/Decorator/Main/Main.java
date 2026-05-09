package acs.ase.ro.Decorator.Main;

import acs.ase.ro.Decorator.Classes.NotaPlata;
import acs.ase.ro.Decorator.Classes.NotaPlata1Mai;
import acs.ase.ro.Decorator.Classes.NotaPlataDecorator;
import acs.ase.ro.Decorator.Classes.NotaPlataRevelion;

public class Main {
    public static void main(String[] args) {

        //problema 7 de la restaurant
        //momentan fara implementare de design pattern:
        NotaPlata notaPlata = new NotaPlata(100.0, "17.02.2026");
        notaPlata.printeaza();

        //cu decorator:

        Boolean esteRevelion = Boolean.FALSE;

        NotaPlataDecorator notaPlataDecorator = null;

        if(esteRevelion){
            notaPlataDecorator = new NotaPlataRevelion(notaPlata);
        }else{
            notaPlataDecorator = new NotaPlata1Mai(notaPlata);
        }
        notaPlataDecorator.printeazaFelizitare();
    }
}
