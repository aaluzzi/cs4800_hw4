package p2.factory;

import p2.DietRestriction;
import p2.product.Fat;
import p2.product.Macronutrient;

public class FatFactory extends MacronutrientFactory {
    
    private static FatFactory factory = null;

    private FatFactory(){}

    public static FatFactory getFactory() {
        if (factory == null) {
            factory = new FatFactory();
        }

        return factory;
    }

    @Override
    public Macronutrient getMacronutrient(DietRestriction dietRestriction) {
        if (dietRestriction == DietRestriction.VEGAN) {
            return new Fat(super.getRandomFoodItem(new String[]{"Avocado", "Peanuts"}));
        } else if (dietRestriction == DietRestriction.PALEO) {
            return new Fat(super.getRandomFoodItem(new String[]{"Avocado", "Tuna", "Peanuts"}));
        } else if (dietRestriction == DietRestriction.NUT_ALLERGY) {
            return new Fat(super.getRandomFoodItem(new String[] {"Avocado", "Tuna", "Sour Cream"}));
        } else {
            return new Fat(super.getRandomFoodItem(new String[]{"Avocado", "Tuna", "Sour Cream", "Peanuts"}));
        }
    }

}
