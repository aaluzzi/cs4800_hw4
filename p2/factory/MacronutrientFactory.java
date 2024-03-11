package p2.factory;

import p2.DietRestriction;
import p2.product.Macronutrient;

public abstract class MacronutrientFactory {

    public abstract Macronutrient getMacronutrient(DietRestriction dietRestriction);

    protected final String getRandomFoodItem(String[] foodItems) {
        int randomIndex = (int) (Math.random() * foodItems.length);
        return foodItems[randomIndex];
    }
}
