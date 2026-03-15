package acs.ase.ro.singleton.main;

import acs.ase.ro.singleton.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        //Hotel hotel = new Hotel(); //daca pot apela constructorul, inseamna ca nu am facut privat constructorul / nu avem constructor
        Hotel hotel1 =Hotel.getInstance("InterContinental", 7, 5);
        Hotel hotel2 =Hotel.getInstance("MegaHotel", 200, 0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();



    }
}
