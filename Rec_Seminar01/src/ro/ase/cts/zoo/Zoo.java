package ro.ase.cts.zoo;

import ro.ase.cts.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
        private String name;
        private ZooKeeper zooKeper;
        private List<Animal> animals;


        public Zoo(String name, ZooKeeper zooKeper) {
            this.name = name;
            this.zooKeper = zooKeper;
            this.animals = new ArrayList<>();
        }

        public void addAnimal(Animal animal) {
            animals.add(animal);
        }

        public void feedAllAnimals() {
            for (Animal a : animals)
                zooKeper.feedAnimal(a);
        }
}
