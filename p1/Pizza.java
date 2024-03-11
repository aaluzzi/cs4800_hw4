package p1;

import java.util.List;

public class Pizza {

    private final String chain;
    private final Size size;
    private final List<Topping> toppings;

    public Pizza(String chain, Size size, List<Topping> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain - " + this.chain);
        System.out.println("Size: " + this.size);
        System.out.print("Toppings: ");
        for (Topping topping : this.toppings) {
            System.out.print(" " + topping);
        }
        System.out.println();
        System.out.println();
    }
}
