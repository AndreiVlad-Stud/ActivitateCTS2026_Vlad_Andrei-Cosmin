package pregatireTest2.facade2.Main;

import pregatireTest2.facade2.Classes.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gheorhe");
        Client client2 = new Client("Marian");

        InchiriereFacade inchiriereFacade1 = new InchiriereFacade(new DisponibilitateMasina(true),new Permis(true),new PlataGarantie(true));
        inchiriereFacade1.inchiriereMasina(client);

        InchiriereFacade inchiriereFacade2 = new InchiriereFacade(new DisponibilitateMasina(true),new Permis(false),new PlataGarantie(true));
        inchiriereFacade2.inchiriereMasina(client2);

    }
}
