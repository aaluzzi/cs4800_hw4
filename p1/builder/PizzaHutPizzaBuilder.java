package p1.builder;
import java.util.ArrayList;
import java.util.List;

import p1.Pizza;
import p1.Size;
import p1.Topping;

public class PizzaHutPizzaBuilder implements PizzaBuilder {
 
    private final Size size;
    private final List<Topping> toppings;

    public PizzaHutPizzaBuilder(Size size) {
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder addTopping(Topping topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza("Pizza Hut", size, toppings);
    }

}
