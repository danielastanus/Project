package AnimalRescuer;

public abstract class Dog extends  Animal {


    public void speak(){
        System.out.println("Woof!");
    }

    public void wavingTail(){
        System.out.println("da din coada");
    }


    public void eat(){
        System.out.println("eating bones");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }


}