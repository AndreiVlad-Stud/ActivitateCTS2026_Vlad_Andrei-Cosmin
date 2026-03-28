package factory_method.exemplul1.clase;

public abstract class Componenta implements IComponenta{
    protected String culoare;
    protected String material;
    protected boolean esteDetasabil;

    public Componenta(String culoare, String material, boolean esteDetasabil) {
        this.culoare = culoare;
        this.material = material;
        this.esteDetasabil = esteDetasabil;
    }

    @Override
    public String getCuloareComponenta() {
        return culoare;
    }

    @Override
    public String tipMaterial() {
        return material;
    }

    @Override
    public boolean esteDetasabila() {
        return esteDetasabil;
    }

    public void afiseazaDetalii(){
        StringBuilder builder = new StringBuilder();
        builder.append("Culoare: ").append(getCuloareComponenta()).append("; ");
        builder.append("Material: ").append(tipMaterial()).append("; ");
        builder.append("Detasabila: ").append(esteDetasabila());
        System.out.println(builder);
    }
}
