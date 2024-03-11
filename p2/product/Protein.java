package p2.product;
public class Protein extends Macronutrient{
    
    public Protein(String foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return "Protein: " + foodItem;
    }

}
