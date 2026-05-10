package pregatireTest2.adapter1.Main;

import pregatireTest2.adapter1.Classes.AdaptorBilet;
import pregatireTest2.adapter1.Classes.BiletClasic;
import pregatireTest2.adapter1.Classes.BiletElectronic;
import pregatireTest2.adapter1.Classes.ISoftScanareBilet;

public class Main {
    public static void main(String[] args) {
        ISoftScanareBilet scanareBiletClasic = new BiletClasic("Ai@23","Transformers 3", 6, 25);
        scanareBiletClasic.scaneazaBilet();

        BiletElectronic scanareBiletElectronic = new BiletElectronic("55Ans0","Joker",44,56);
        ISoftScanareBilet adaptorBiletElectronic = new AdaptorBilet(scanareBiletElectronic);

        adaptorBiletElectronic.scaneazaBilet();
        adaptorBiletElectronic.scaneazaBilet();
        adaptorBiletElectronic.scaneazaBilet();

    }
}
