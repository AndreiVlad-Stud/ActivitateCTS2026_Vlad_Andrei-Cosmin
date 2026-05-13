package pregatireTest2.decorator.Classes;

public class BiletCinema implements  IBilet{
    private String numeFilm;
    private int sala;
    private int loc;

    public BiletCinema(String numeFilm, int sala, int loc) {
        this.numeFilm = numeFilm;
        this.sala = sala;
        this.loc = loc;
    }

    @Override
    public void printeazaBilet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biletul a fost printat! \n");
        sb.append("Film: ").append(numeFilm).append("\n");
        sb.append("Sala: ").append(sala).append("\n");
        sb.append("Loc: ").append(loc).append("\n");

        System.out.println(sb);
    }
}
