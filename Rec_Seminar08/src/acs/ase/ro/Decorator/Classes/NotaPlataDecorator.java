package acs.ase.ro.Decorator.Classes;

public abstract class NotaPlataDecorator implements INotaPlata {

    private NotaPlata notaPlata;


    @Override
    public void printeaza() {
        notaPlata.printeaza();
    }

    public NotaPlataDecorator(NotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    public abstract void printeazaFelizitare();
}