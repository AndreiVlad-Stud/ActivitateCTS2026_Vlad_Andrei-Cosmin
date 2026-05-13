package pregatireTest2.facade.Main;

import pregatireTest2.facade.Classes.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei", "+123654899212");
        Client client2 = new Client("Mihai", "+123654899212");

        FacadeCazare facadeCazare = new FacadeCazare(
                new Camera(2),
                new Plata(true),
                new VerificareID(true)
        );


        facadeCazare.cazeazaClient(client);
        facadeCazare.cazeazaClient(client2);
    }
}
