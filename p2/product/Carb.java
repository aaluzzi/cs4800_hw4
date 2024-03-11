package p2.product;
public class Carb extends Macronutrient {

    public Carb(String foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return "Carb: " + foodItem;
    }
    
}
