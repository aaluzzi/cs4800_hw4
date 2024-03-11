package p2;

public class Customer {

    private final String name;
    private final DietRestriction dietRestriction;

    public Customer(String name, DietRestriction dietRestriction) {
        this.name = name;
        this.dietRestriction = dietRestriction;
    }

    public DietRestriction getDietRestriction() {
        return dietRestriction;
    }

    public String getDescription() {
        return name + " (Diet Restriction: " + dietRestriction + ")";
    }

}
