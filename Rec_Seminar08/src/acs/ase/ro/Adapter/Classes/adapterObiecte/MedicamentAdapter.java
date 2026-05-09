package acs.ase.ro.Adapter.Classes.adapterObiecte;

import acs.ase.ro.Adapter.Classes.farmacie.MedicamentFarmacie;
import acs.ase.ro.Adapter.Classes.magazin.MedicamentMagazin;

public class MedicamentAdapter  extends MedicamentFarmacie {
    //avem nevoie de obiectul pe care il adaptam:
    private MedicamentMagazin medicamentMagazin;

    public MedicamentAdapter(MedicamentMagazin medicamentMagazin) {
        super(medicamentMagazin.getNumeMedicament());
        this.medicamentMagazin = medicamentMagazin;
    }

    @Override
    public void cumparaMedicament() {
        medicamentMagazin.achizitioneazaMedicament();
    }

}
