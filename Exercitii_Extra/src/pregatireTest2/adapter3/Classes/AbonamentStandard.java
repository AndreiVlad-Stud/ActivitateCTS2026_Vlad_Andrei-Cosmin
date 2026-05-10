package pregatireTest2.adapter3.Classes;

public class AbonamentStandard extends AbonamentFitness {
    private String tierAbonament;
    private int numarIntrariRamase;

    public AbonamentStandard(int idAbonament, String numeClient, String tierAbonament, int numarIntrariRamase) {
        super(idAbonament, numeClient);
        this.tierAbonament = tierAbonament;
        this.numarIntrariRamase = numarIntrariRamase;
    }

    @Override
    public void verificaAcces() {
        if (numarIntrariRamase > 0) {
            numarIntrariRamase--;
            System.out.println("Acces permis pentru " + numeClient +
                    ", abonament " + tierAbonament +
                    ", intrari ramase: " + numarIntrariRamase);
        } else {
            System.out.println("Acces respins pentru " + numeClient +
                    ". Nu mai are intrari disponibile.");
        }
    }
}
