package ro.ase.cts.animal;

public class Zebra extends  Animal{
    int nrDungi;

    public Zebra(String nume, int age, FoodType foodType, int nrDungi) {
        super(nume, age, foodType);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String zookeperName) {
        System.out.println("Zookeper-ul cu numele : "  + zookeperName + " hraneste zebra cu : " + name + " cu mancarea: " + super.foodType);
    }
}
