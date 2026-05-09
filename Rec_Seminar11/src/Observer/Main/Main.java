package Observer.Main;

import Observer.Classes.ISpital;
import Observer.Classes.Pacient;
import Observer.Classes.PacientAbonat;
import Observer.Classes.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Gigel", 22);
        Pacient pacient2 = new PacientAbonat("Cornel", 33);
        Pacient pacient3 = new PacientAbonat("Adela", 69);

        ISpital spital1 = new Spital("Cantacuzino");

        spital1.aboneazaPacient(pacient1);
        spital1.aboneazaPacient(pacient2);
        spital1.aboneazaPacient(pacient3);

        ((Spital) spital1).notificaVirus();
        spital1.dezaboneazaPacient(pacient3);

        System.out.println("==========================");

        ((Spital) spital1).notificaEpidemie();
    }
}
