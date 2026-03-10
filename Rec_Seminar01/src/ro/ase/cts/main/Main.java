package ro.ase.cts.main;

import ro.ase.cts.animal.FoodType;
import ro.ase.cts.animal.Lion;
import ro.ase.cts.animal.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Baneasa", new ZooKeeper("Luiza"));


        zoo.addAnimal(new Lion("Lion 1",20, FoodType.FISH,500));
        zoo.addAnimal(new Zebra("Zebra 1",2,FoodType.MEAT,20));

        zoo.feedAllAnimals();


    }

}
