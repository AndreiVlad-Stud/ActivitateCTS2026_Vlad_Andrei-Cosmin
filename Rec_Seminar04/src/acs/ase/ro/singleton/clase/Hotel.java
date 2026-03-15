package acs.ase.ro.singleton.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance =null; //lazy initialization pt ca e null


    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere,int  numarCamereOcupate){
        if(instance ==null){
            instance =new Hotel(numeHotel, numarCamere,numarCamereOcupate);
        }
        return instance;
    }


    public void rezervaCamera(){
        if(this.numarCamereOcupate<this.numarCamere){
            System.out.println("S-a rezervat camera!");
            numarCamereOcupate++;
        }
        else {
            System.out.println("Nu mai sunt camere disponibile");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.numeHotel).append(this.numarCamere).append(this.numarCamereOcupate);

        System.out.println(builder);

    }

}
