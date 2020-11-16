package id.cli.decorator_pattern;

public abstract class Beverage {
    public abstract float cost();

    public void printCost() {
        System.out.println(cost());
    }
}
