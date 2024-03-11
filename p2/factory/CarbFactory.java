package p2.factory;

import p2.DietRestriction;
import p2.product.Carb;
import p2.product.Macronutrient;

public class CarbFactory extends MacronutrientFactory {

    private static CarbFactory factory = null;

    private CarbFactory(){}

    public static CarbFactory getFactory() {
        if (factory == null) {
            factory = new CarbFactory();
        }

        return factory;
    }

    @Override
    public Macronutrient getMacronutrient(DietRestriction dietRestriction) {
        if (dietRestriction == DietRestriction.PALEO) {
            return new Carb("Pistachio");
        } else if (dietRestriction == DietRestriction.VEGAN) {
            return new Carb(super.getRandomFoodItem(new String[]{"Bread", "Lentils", "Pistachio"}));
        } else if (dietRestriction == DietRestriction.NUT_ALLERGY) {
            return new Carb(super.getRandomFoodItem(new String[]{"Cheese", "Bread", "Lentils"}));
        } else {
            return new Carb(super.getRandomFoodItem(new String[]{"Cheese", "Bread", "Lentils", "Pistachio"}));
        }
    }
    
}
