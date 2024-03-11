package p2;

import p2.factory.FatFactory;

import p2.factory.ProteinFactory;
import p2.product.Macronutrient;

import java.util.ArrayList;

import p2.factory.CarbFactory;

import p2.factory.MacronutrientFactory;

public class Driver {

    public static void main(String[] args) {
        createAndPrintMeal(new Customer("Bob Michael", DietRestriction.NONE));
        createAndPrintMeal(new Customer("Jack Stock", DietRestriction.PALEO));
        createAndPrintMeal(new Customer("Sydney Pew", DietRestriction.NUT_ALLERGY));
        createAndPrintMeal(new Customer("Greg Karper", DietRestriction.VEGAN));
        createAndPrintMeal(new Customer("Lance Stewart", DietRestriction.NONE));
        createAndPrintMeal(new Customer("Daphne Karlson", DietRestriction.NUT_ALLERGY));
    }

    public static void createAndPrintMeal(Customer customer) {
        MacronutrientFactory[] macroNutrientFactories = {CarbFactory.getFactory(), ProteinFactory.getFactory(), FatFactory.getFactory()};
        Macronutrient[] meal = generateMeal(customer, macroNutrientFactories);
        System.out.println(customer.getDescription());
        printMeal(meal);
        System.out.println();
    }

    public static Macronutrient[] generateMeal(Customer customer, MacronutrientFactory[] macroNutrientFactories) {
        ArrayList<Macronutrient> macronutrients = new ArrayList<>();
        for (MacronutrientFactory macroNutrientFactory : macroNutrientFactories) {
            Macronutrient macronutrient = macroNutrientFactory.getMacronutrient(customer.getDietRestriction());
            macronutrients.add(macronutrient);
        }
        return macronutrients.toArray(new Macronutrient[macronutrients.size()]);
    }

    public static void printMeal(Macronutrient[] macronutrients) {
        System.out.println("Meal Plan");
        System.out.println("----------");
        for (Macronutrient macronutrient : macronutrients) {
            System.out.println(macronutrient.getDescription());
        }
    }

}