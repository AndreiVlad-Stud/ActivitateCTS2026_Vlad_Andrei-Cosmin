package ro.ase.cts.zoo;

import ro.ase.cts.animal.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.eat(name);
    }
}
