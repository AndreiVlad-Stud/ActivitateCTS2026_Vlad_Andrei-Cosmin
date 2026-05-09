package acs.ase.ro.Decorator.Classes;

public class NotaPlata1Mai extends NotaPlataDecorator{
    public NotaPlata1Mai(NotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelizitare() {
        System.out.println("Nota plata de 1 mai a fost platita");
    }
}
