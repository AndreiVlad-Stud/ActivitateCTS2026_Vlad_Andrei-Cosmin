package pregatireTest2.facade.Classes;

public class Client {
    private String nume;
    private String numarTelefon;

    public Client(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }
}
