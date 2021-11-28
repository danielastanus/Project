package AnimalRescuer;

public abstract class Turtle extends Animal{
    public void play(){
        System.out.println("not");
    }

    @Override
    public void speak() {
        System.out.println("wow");
    }

    @Override
    public void sleep() {
        System.out.println("bzz");
    }
}
