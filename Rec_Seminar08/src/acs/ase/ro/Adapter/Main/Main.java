package acs.ase.ro.Adapter.Main;

import acs.ase.ro.Adapter.Classes.adapterObiecte.MedicamentAdapter;
import acs.ase.ro.Adapter.Classes.farmacie.MedicamentFarmacie;
import acs.ase.ro.Adapter.Classes.magazin.MedicamentMagazin;

public class Main {
    //asta e o aplicatie (de aceea ne trebuie adapter):
    private static void procuraMedicamentFarmacie(MedicamentFarmacie medicamentFarmacie){

    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen");
        MedicamentMagazin medicamentMagazin = new MedicamentMagazin("Paracetamol", 10);

        medicamentMagazin.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        //acum le facem sa conlucreze:
        //*trebuie sa ne dam seama cine pe cine integreaza:
        //spitalul/magazinul se adapteaza la farmacie

        procuraMedicamentFarmacie(medicamentFarmacie);
        //procuraMedicamentFarmacie(medicamentMagazin);//nu merge, de aceea ne trebuie adapter (adaptam medicament magazin/spital la medicament farmacie)

        //facem adapter de obiecte (avem 2 clase concrete):

        MedicamentAdapter medicamentAdaptat = new MedicamentAdapter(medicamentMagazin);
        procuraMedicamentFarmacie(medicamentAdaptat);



    }
}
