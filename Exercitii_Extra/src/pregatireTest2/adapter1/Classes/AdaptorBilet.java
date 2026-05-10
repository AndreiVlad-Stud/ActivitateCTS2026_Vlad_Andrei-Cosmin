package pregatireTest2.adapter1.Classes;

public class AdaptorBilet implements ISoftScanareBilet{
    private BiletElectronic biletElectronic;

    public AdaptorBilet(BiletElectronic biletElectronic) {
        this.biletElectronic = biletElectronic;
    }

    @Override
    public void scaneazaBilet() {
        biletElectronic.scanareBiletElectronic();
    }
}
