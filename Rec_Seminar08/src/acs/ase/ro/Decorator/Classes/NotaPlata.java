package acs.ase.ro.Decorator.Classes;

public class NotaPlata implements INotaPlata {

    private Double suma;
    private String data;


    @Override
    public void printeaza() {
        System.out.println("Nota de plata de " + this.suma + " a fost platita in data de " + this.data);
    }

    public NotaPlata(Double suma, String data) {
        this.suma = suma;
        this.data = data;
    }
}