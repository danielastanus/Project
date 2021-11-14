package AnimalRescuer;

public class AnimalFood {
    private String foodName;
    public String getFoodName(){
        return foodName;
    }
    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    private double priceDolars;
    public double getPriceDolars(){
        return priceDolars;
    }
    public void setPriceDolars(double priceDolars){
        this.priceDolars = priceDolars;
    }
    private double quantityKg;
    public double getQuantityKg(){
        return quantityKg;
    }
    public void setQuantityKg (double quantityKg){
        this.quantityKg = quantityKg;
    }
    private int stockAvailability;
    public int getStockAvailability(){
        return stockAvailability;
    }
    public void setStockAvailability(int stockAvailability){
        this.stockAvailability = stockAvailability;
    }


}
