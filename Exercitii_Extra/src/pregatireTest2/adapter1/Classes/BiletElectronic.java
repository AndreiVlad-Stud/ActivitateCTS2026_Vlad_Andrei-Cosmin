package pregatireTest2.adapter1.Classes;

public class BiletElectronic {
    private String seriaCodQR;
    private String numeFilm;
    private int rand;
    private int loc;

    public BiletElectronic(String seriaCodQR, String numeFilm, int rand, int loc) {
        this.seriaCodQR = seriaCodQR;
        this.numeFilm = numeFilm;
        this.rand = rand;
        this.loc = loc;
    }

    public void scanareBiletElectronic(){
        StringBuilder sb = new StringBuilder();
        sb.append("Codul QR: ").append(seriaCodQR).append(" ");
        sb.append("pentru filmul: ").append(numeFilm).append(", ");
        sb.append("randul: ").append(rand).append(", ");
        sb.append("loc: ").append(loc).append(", ");
        sb.append("a fost scanat cu succes. Va dorim vizionare placuta!\n");
        System.out.println(sb);
    }
}
