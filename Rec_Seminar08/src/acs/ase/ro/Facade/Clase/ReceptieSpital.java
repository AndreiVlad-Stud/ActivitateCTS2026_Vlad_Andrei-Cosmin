package acs.ase.ro.Facade.Clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if (medic.areTrimiterePacient(pacient)){
            int patLiber = salon.getPatLiber();
            if (patLiber != -1){
                System.out.println("Pacientul " + pacient.getNumePacient() + "va fi internat in patul" + patLiber + " ");
                salon.ocupatPat(patLiber);
            } else {
                System.out.println("Nu sunt paturi libere. Vei fi internat in alt spital");
            }
        } else {
            System.out.println("ai nevoie de trimitere de la medic");
        }
    }
}
