package pregatireTest2.adapter3.Classes;

public class AbonamentCorporateExtern {
    private String codBadge;
    private String companie;
    private String numeAngajat;
    private boolean accesActiv;

    public AbonamentCorporateExtern(String codBadge, String companie, String numeAngajat, boolean accesActiv) {
        this.codBadge = codBadge;
        this.companie = companie;
        this.numeAngajat = numeAngajat;
        this.accesActiv = accesActiv;
    }

    public void valideazaBadgeCorporate() {
        if (accesActiv && codBadge != null && !codBadge.trim().isEmpty()) {
            System.out.println("Acces corporate permis pentru " + numeAngajat + " de la compania " + companie);
        } else {
            System.out.println("Acces corporate respins pentru " + numeAngajat);
        }
    }
}
