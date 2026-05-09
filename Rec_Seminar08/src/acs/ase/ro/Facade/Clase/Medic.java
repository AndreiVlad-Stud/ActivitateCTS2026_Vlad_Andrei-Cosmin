package acs.ase.ro.Facade.Clase;

public class Medic {
    public boolean areTrimiterePacient(Pacient pacient){
        return pacient.getGravitatie()>5;
    }
}
