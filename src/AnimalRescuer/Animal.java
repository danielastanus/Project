package AnimalRescuer;

public class Animal {
    private String animalType;
    public String getAnimalType(){
        return animalType;
    }
    public void setAnimalType(String animalClass){
       animalType = animalClass;
    }
    private String name;
    public String getName(){
        return name;
    }
    public void setName (String animalName){
        name = animalName;
    }
    private String breed ;
    public String getBreed(){
        return breed;
    }
    public void setBreed(String animalBreed){
        breed = animalBreed;

    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
    private int healthCondition;
    public int getHealthCondition(){
        return healthCondition;
    }
    public void setHealthCondition (int healthCondition){
        this.healthCondition = healthCondition;
    }
    private int hungerLevel;
    public int getHungerLevel(){
        return hungerLevel;
    }
    public void setHungerLevel (int hungerLevel){
        this.hungerLevel = hungerLevel;
    }

    private int stateOfMind;
    public int getStateOfMind(){
        return stateOfMind;
    }
    public void setStateOfMind (int stateOfMind){
        this.stateOfMind = stateOfMind;
    }
    private String favoriteFood;
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    private String favoriteActivity;
    public String getFavoriteActivity(){
        return favoriteActivity;
    }
    public void setFavoriteActivity(String favoriteActivity){
        this.favoriteActivity = favoriteActivity;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Zzz");
    }

    public void play(){
        System.out.println("playing");
    }

    public void speak(){
        System.out.println("aaa");
    }


}
