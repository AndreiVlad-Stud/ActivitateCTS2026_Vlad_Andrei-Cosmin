package singleton.exemplul7.main;

import singleton.exemplul7.classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet1 = PachetTuristic.getInstance("TransTur","Mumbai",59866);
        pachet1.vindePachet("Pachet 1 All Inclusive");
        pachet1.vindePachet("Pachet 2 All Inclusive");
        pachet1.vindePachet("Pachet 3 Demipensiune");

        PachetTuristic pachet2 = PachetTuristic.getInstance("AgeTur","Sinaia",6569);
        pachet2.vindePachet("Pachet 2");

        pachet1.afiseazaPacheteVandute();
        pachet2.afiseazaPacheteVandute();

        if (pachet1 == pachet2){
            System.out.println("Cele doua instante sunt identice.");
        }
    }
}
