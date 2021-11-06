package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Animal dog = new Animal();

        System.out.println(dog.age = 2);
        System.out.println(dog.name = "Blackie");
        System.out.println(dog.animalType = "dog");
        System.out.println(dog.breed = "Husky");
        System.out.println(dog.favoriteActivity = "Running");
        System.out.println(dog.favoriteFood = "Royal canin");
        System.out.println(dog.healthCondition = 9);
        System.out.println(dog.hungerLevel = 10);
        System.out.println(dog.stateOfMind = 9);

        Adopter adopter = new Adopter();
        System.out.println(adopter.adopterName = "Mike");
        System.out.println(adopter.amountOfMoney = 75);

        RecreationActivity activity = new RecreationActivity();
        System.out.println(activity.activityName = "Playing Fetch");

        AnimalFood food = new AnimalFood();
        System.out.println(food.foodName = "Royal canin");
        System.out.println(food.priceDolars = 30);
        System.out.println(food.quantityKg = 5);
        System.out.println(food.stockAvailability = 75);

        Veterinary vet = new Veterinary();
        System.out.println(vet.veterinaryName = "William");
        System.out.println(vet.vetSpecialty = "Dermatology");








    }
}
