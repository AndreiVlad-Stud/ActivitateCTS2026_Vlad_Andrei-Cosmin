package pregatireTest2.adapter2.Classes;

public class ComandaInterna implements IConfirmareComanda{
    private int nrComanda;
    private String departamentOrigine;
    private String departamentDestinatie;

    public ComandaInterna(int nrComanda, String departamentOrigine, String departamentDestinatie) {
        this.nrComanda = nrComanda;
        this.departamentOrigine = departamentOrigine;
        this.departamentDestinatie = departamentDestinatie;
    }

    @Override
    public void confirmaComanda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nr comanda: ").append(nrComanda).append("\n");
        sb.append("Departament expediere: ").append(departamentOrigine).append("\n");
        sb.append("Departament livrare: ").append(departamentDestinatie).append("\n");
        System.out.println(sb);
    }
}
