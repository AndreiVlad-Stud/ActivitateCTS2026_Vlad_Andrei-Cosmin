package pregatireTest2.facade.Classes;

public class Camera {
    private int camereDisponibile;

    public Camera(int camereDisponibile) {
        this.camereDisponibile = camereDisponibile;
    }

    public boolean areCameraDisponibila() {
        return camereDisponibile > 0;
    }

    public void ocupaCamera() {
        if (areCameraDisponibila()) {
            camereDisponibile--;
        }
    }
}
