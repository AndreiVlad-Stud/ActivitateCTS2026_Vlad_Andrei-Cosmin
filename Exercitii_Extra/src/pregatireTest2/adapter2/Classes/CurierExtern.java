package pregatireTest2.adapter2.Classes;

public class CurierExtern {
    private String AWB;
    private int nrComanda;
    private String departamentOrigine;
    private String adresaLivrare;

    public CurierExtern(String AWB, int nrComanda, String departamentOrigine, String adresaLivrare) {
        this.AWB = AWB;
        this.nrComanda = nrComanda;
        this.departamentOrigine = departamentOrigine;
        this.adresaLivrare = adresaLivrare;
    }

    public void trimiteAWB() {
        if (AWB != null && !AWB.trim().isEmpty()){
            StringBuilder sb = new StringBuilder();
            sb.append("Comanda externa inregistrata!\n");
            sb.append("AWB: ").append(AWB).append("\n");
            sb.append("Nr Comanda: ").append(nrComanda).append("\n");
            sb.append("Departament expediere: ").append(departamentOrigine).append("\n");
            sb.append("Adresa Livrare: ").append(adresaLivrare).append("\n");
            System.out.println(sb);

        }else {
            System.out.println("AWB Invalid!");
        }
    }
}
