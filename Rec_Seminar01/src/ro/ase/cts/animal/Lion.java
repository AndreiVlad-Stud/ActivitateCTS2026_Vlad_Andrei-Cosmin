package ro.ase.cts.animal;

public class Lion  extends Animal{
    private int weight;

    public Lion(String nume, int age, FoodType foodType, int weight) {
        super(nume, age, foodType);
        this.weight = weight;
    }

    @Override
    public void eat(String zookeperName) {
        System.out.println("Zookeper-ul cu numele : "  + zookeperName + " hraneste leul cu : " + super.name + " cu mancarea: " + super.foodType);
    }
}