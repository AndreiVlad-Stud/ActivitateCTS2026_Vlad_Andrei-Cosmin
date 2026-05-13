package pregatireTest2.proxy.Classes;

public class ImprumutCarte implements ICarte{
    private String titluCarte;
    private int perioadaImprumutZile;

    public ImprumutCarte(String titluCarte, int perioadaImprumutZile) {
        this.titluCarte = titluCarte;
        this.perioadaImprumutZile = perioadaImprumutZile;
    }

    @Override
    public void imprumutaCarte() {
        StringBuilder sb = new StringBuilder();
        sb.append("===Detalii Imprumut===\n");
        sb.append("Titlu carte imprumutata: ").append(titluCarte).append("\n");
        sb.append("Perioada Imprumut: ").append(perioadaImprumutZile).append(" zile.\n");
        System.out.println(sb);
    }
}
