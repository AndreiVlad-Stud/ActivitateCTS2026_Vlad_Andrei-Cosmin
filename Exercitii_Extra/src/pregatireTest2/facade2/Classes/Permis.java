package pregatireTest2.facade2.Classes;

public class Permis {
    private boolean permisValid;

    public Permis(boolean permisValid) {
        this.permisValid = permisValid;
    }

    public boolean estePermisValid(){
        return permisValid;
    }
}
