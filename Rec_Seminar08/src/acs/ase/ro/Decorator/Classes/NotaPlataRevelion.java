package acs.ase.ro.Decorator.Classes;

public class NotaPlataRevelion extends NotaPlataDecorator{
    public NotaPlataRevelion(NotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelizitare() {
        System.out.println("Nota plata de revelion a fost platita");
    }
}
