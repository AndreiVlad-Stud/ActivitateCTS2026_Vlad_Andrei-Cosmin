package acs.ase.ro.Adapter.Classes.magazin;

public class MedicamentMagazin {
    private String numeMedicament;
    private float pretMedicament;

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul " + this.numeMedicament + " este achizitionat la pretul de "+ this.pretMedicament);
        }else{
            System.out.println("Medicamentul " + this.numeMedicament + " are nevoie de reteta");
        }
    };
    private Boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    };

    public MedicamentMagazin(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}
