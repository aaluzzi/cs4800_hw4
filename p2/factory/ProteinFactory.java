package p2.factory;

import p2.DietRestriction;
import p2.product.Protein;
import p2.product.Macronutrient;

public class ProteinFactory extends MacronutrientFactory {

    private static ProteinFactory factory = null;

    private ProteinFactory(){}

    public static ProteinFactory getFactory() {
        if (factory == null) {
            factory = new ProteinFactory();
        }

        return factory;
    }

    @Override
    public Macronutrient getMacronutrient(DietRestriction dietRestriction) {
        if (dietRestriction == DietRestriction.VEGAN) {
            return new Protein("Tofu");
        } else if (dietRestriction == DietRestriction.PALEO) {
            return new Protein(super.getRandomFoodItem(new String[]{"Fish", "Chicken", "Beef"}));
        } else {
            return new Protein(super.getRandomFoodItem(new String[]{"Fish", "Chicken", "Beef", "Tofu"}));
        }
    }

}