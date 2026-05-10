package pregatireTest2.adapter1.Classes;

public class BiletClasic implements ISoftScanareBilet{
    private String idBilet;
    private String numeFilm;
    private int rand;
    private int loc;

    public BiletClasic(String idBilet, String numeFilm, int rand, int loc) {
        this.idBilet = idBilet;
        this.numeFilm = numeFilm;
        this.rand = rand;
        this.loc = loc;
    }

    @Override
    public void scaneazaBilet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biletul cu ID: ").append(idBilet).append(" ");
        sb.append("pentru filmul: ").append(numeFilm).append(", ");
        sb.append("randul: ").append(rand).append(", ");
        sb.append("loc: ").append(loc).append(", ");
        sb.append("a fost scanat cu succes. Va dorim vizionare placuta!\n");
        System.out.println(sb);
    }
}
