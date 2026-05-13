package pregatireTest2.facade.Classes;

public class FacadeCazare {
    private Camera cameraHotel;
    private Plata plataAvans;
    private VerificareID verificareActIdentitate;

    public FacadeCazare(Camera cameraHotel, Plata plataAvans, VerificareID verificareActIdentitate) {
        this.cameraHotel = cameraHotel;
        this.plataAvans = plataAvans;
        this.verificareActIdentitate = verificareActIdentitate;
    }

    public void cazeazaClient(Client clientHotel) {
        if (cameraHotel.areCameraDisponibila()
                && plataAvans.estePlatita()
                && verificareActIdentitate.esteActValid()) {
            cameraHotel.ocupaCamera();
            System.out.println("Client cazat: " + clientHotel.getNume() + " " + clientHotel.getNumarTelefon());
        } else {
            System.out.println("Clientul nu poate fi cazat: " + clientHotel.getNume());
        }
    }
}
