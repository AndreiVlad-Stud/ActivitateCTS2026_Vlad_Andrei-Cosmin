package acs.ase.ro.Facade.Main;

import acs.ase.ro.Facade.Clase.Medic;
import acs.ase.ro.Facade.Clase.Pacient;
import acs.ase.ro.Facade.Clase.ReceptieSpital;
import acs.ase.ro.Facade.Clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu", 6);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();

        if (medic1.areTrimiterePacient(pacient1)){
            int patLiber = salon1.getPatLiber();
            if (patLiber != -1){
                System.out.println("Pacientul " + pacient1.getNumePacient() + "va fi internat in patul" + patLiber + " ");
                salon1.ocupatPat(patLiber);
            }

        }

        Pacient pacient2 = new Pacient("Ionescu", 7);
        Pacient pacient3 = new Pacient("Alin", 8);
        Pacient pacient4 = new Pacient("Mina", 9);

        System.out.println("======================");
        ReceptieSpital receptieSpital = new ReceptieSpital(medic1, salon1);
        receptieSpital.internarePacient(pacient2);
        receptieSpital.internarePacient(pacient3);
        receptieSpital.internarePacient(pacient4);

    }
}
