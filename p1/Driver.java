package p1;

import p1.builder.DominosPizzaBuilder;
import p1.builder.LittleCaesarsPizzaBuilder;
import p1.builder.PizzaBuilder;
import p1.builder.PizzaHutPizzaBuilder;

public class Driver {

    public static void main(String[] args) {
        PizzaBuilder hutBuilder = new PizzaHutPizzaBuilder(Size.LARGE)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.PESTO);
        Pizza pizzaHutPizza = hutBuilder.build();
        pizzaHutPizza.eat();
        PizzaBuilder hutBuilder2 = new PizzaHutPizzaBuilder(Size.MEDIUM)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.PESTO);
        Pizza pizzaHutPizza2 = hutBuilder2.build();
        pizzaHutPizza2.eat();

        PizzaBuilder caesarsBuilder = new LittleCaesarsPizzaBuilder(Size.MEDIUM)
                .addTopping(Topping.BACON)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.HAM)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.SPINACH);
        Pizza caesarsPizza = caesarsBuilder.build();
        caesarsPizza.eat();
        PizzaBuilder caesarsBuilder2 = new LittleCaesarsPizzaBuilder(Size.SMALL)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.SPINACH)
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.SPICY_PORK);
        Pizza caesarsPizza2 = caesarsBuilder2.build();
        caesarsPizza2.eat();

        PizzaBuilder dominosBuilder = new DominosPizzaBuilder(Size.SMALL)
                .addTopping(Topping.MUSHROOMS);
        Pizza dominosPizza = dominosBuilder.build();
        dominosPizza.eat();
        PizzaBuilder dominosBuilder2 = new DominosPizzaBuilder(Size.LARGE)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SPINACH);
        Pizza dominosPizza2 = dominosBuilder2.build();
        dominosPizza2.eat();
    }

}
