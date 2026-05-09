package Command.Classes;

public class Tratare  implements Comanda{
    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
