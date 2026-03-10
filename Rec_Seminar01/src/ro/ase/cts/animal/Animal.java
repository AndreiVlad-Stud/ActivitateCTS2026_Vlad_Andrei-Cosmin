package ro.ase.cts.animal;

public abstract class Animal {
    protected String name;
    protected int age;
    protected FoodType foodType;

    public Animal(String name, int age, FoodType foodType){
        this.name=name;
        this.age=age;
        this.foodType =foodType;
    }

    public abstract void eat(String zookeperName);


}
