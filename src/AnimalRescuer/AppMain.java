package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Animal dog = new Animal();

        int age = dog.getAge();
        dog.setAge(2);
        System.out.println(dog.getAge());

        String name = dog.getName();
        dog.setName("Blackie");
        System.out.println(dog.getName());

        String animalType = dog.getAnimalType();
        dog.setAnimalType("Dog");
        System.out.println(dog.getAnimalType());

        String breed = dog.getBreed();
        dog.setBreed("Husky");
        System.out.println(dog.getBreed());

        String favoriteActivity = dog.getFavoriteActivity();
        dog.setFavoriteActivity("Running");
        System.out.println(dog.getFavoriteActivity());

        String favoriteFood = dog.getFavoriteFood();
        dog.setFavoriteFood("Royal canin");
        System.out.println(dog.getFavoriteFood());

        int healthCondition =dog.getHealthCondition();
        dog.setHealthCondition(9);
        System.out.println(dog.getHealthCondition());

        int hungerLevel = dog.getHungerLevel();
        dog.setHungerLevel(10);
        System.out.println(dog.getHungerLevel());


        int stateOfMind = dog.getStateOfMind();
        dog.setStateOfMind(9);
        System.out.println(dog.getStateOfMind());

        Adopter adopter = new Adopter();

        String adopterName = adopter.getAdopterName();
        adopter.setAdopterName("Lewis");
        System.out.println(adopter.getAdopterName());

        float amountOfMoney = adopter.getAmountOfMoney();
        adopter.setAmountOfMoney(54);
        System.out.println(adopter.getAmountOfMoney());

        RecreationActivity activity = new RecreationActivity();
        String activityName = activity.getActivityName();
        activity.setActivityName("Playing Fetch");
        System.out.println(activity.getActivityName());

        AnimalFood food = new AnimalFood();

        String foodName =food.getFoodName();
        food.setFoodName("Purina");
        System.out.println(food.getFoodName());


        double priceDolars =food.getPriceDolars();
        food.setPriceDolars(21.5);
        System.out.println(food.getPriceDolars());

        double quantityKg = food.getQuantityKg();
        food.setQuantityKg(12.5);
        System.out.println(food.getQuantityKg());

        int stockAvailability= food.getStockAvailability();
        food.setStockAvailability(85);
        System.out.println(food.getStockAvailability());

        Veterinary vet = new Veterinary();
        String veterinaryName = vet.getVeterinaryName();
        vet.setVeterinaryName("William");
        System.out.println(vet.getVeterinaryName());

        String vetSpecialty= vet.getVetSpecialty();
        vet.setVetSpecialty("Dermatology");
        System.out.println(vet.getVetSpecialty());








    }
}
