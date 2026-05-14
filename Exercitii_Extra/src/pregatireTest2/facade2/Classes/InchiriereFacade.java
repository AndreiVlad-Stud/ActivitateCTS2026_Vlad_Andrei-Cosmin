package pregatireTest2.facade2.Classes;

public class InchiriereFacade {
    private DisponibilitateMasina disponibilitateMasina;
    private Permis permis;
    private PlataGarantie plataGarantie;

    public InchiriereFacade(DisponibilitateMasina disponibilitateMasina, Permis permis, PlataGarantie plataGarantie) {
        this.disponibilitateMasina = disponibilitateMasina;
        this.permis = permis;
        this.plataGarantie = plataGarantie;
    }

    public void inchiriereMasina(Client client){
        if (disponibilitateMasina.disponibilitateMasina() && permis.estePermisValid() && plataGarantie.estePlatitaGarantia())
        {
            System.out.println("Masina poate fi ichiriata clientului" + client.getNume());
        }else{
            System.out.println("Masina nu se poate inchiria");
        }
    }
}
