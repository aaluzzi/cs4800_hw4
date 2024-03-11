package p1.builder;

import p1.Pizza;
import p1.Topping;

public interface PizzaBuilder {
    
    PizzaBuilder addTopping(Topping topping);
    Pizza build();

}
