package acs.ase.ro.builder.main;

import acs.ase.ro.builder.classes.Internare;
import acs.ase.ro.builder.classes.InternareBuilder;
import acs.ase.ro.builder.classes.InternareBuilderAlternativ;

public class Main {
    public static void main (String[] args){
        //inainte de builder
        Internare internare = new Internare(true,false,false,true, "Valentin");
        Internare internare2 = new Internare(false,false,false,false, "Ionut");

        //dupa builder

        InternareBuilder builder = new InternareBuilder("Mihail");

        Internare internare3 = builder.build();
        Internare internare4 = builder.setHalat(true).setPapuci(true).setNume("Daniel").build();

        System.out.println(internare);
        System.out.println(internare2);
        System.out.println(internare3);
        System.out.println(internare4);



        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Valentin");
        Internare internare102 = builderAlternativ.build("Georgescu");

        System.out.println(internare101);
        System.out.println(internare102);


        internare101.setNumePacient("Gigel");



    }
}
