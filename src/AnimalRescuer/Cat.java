package AnimalRescuer;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Miau!");
    }

    public void eat() {
        System.out.println("milk");
    }
}
