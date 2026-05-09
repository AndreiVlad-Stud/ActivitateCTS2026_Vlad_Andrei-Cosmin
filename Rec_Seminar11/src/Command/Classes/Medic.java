package Command.Classes;

public class Medic  implements PersonalSpital{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Meidcul " + this.nume + " interneaza pacientul " + pacient.getNume());
    }
}
