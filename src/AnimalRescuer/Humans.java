package AnimalRescuer;

public class Humans {
    private String adopterName;
    public String getAdopterName(){
        return adopterName;
    }
    public void setAdopterName(String adopterName){
        this.adopterName = adopterName;
    }
    private float amountOfMoney;
    public float getAmountOfMoney(){
        return amountOfMoney;
    }
    public void setAmountOfMoney(float amountOfMoney){
        this.amountOfMoney =amountOfMoney;
    }

    public void play(){
        System.out.println("running");
    }



}
