package p2.product;

public abstract class Macronutrient {
    
    protected String foodItem;

    public Macronutrient(String foodItem) {
        this.foodItem = foodItem;
    }

    abstract public String getDescription();
    
}

