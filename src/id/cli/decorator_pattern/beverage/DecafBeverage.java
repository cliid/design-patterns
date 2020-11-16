package id.cli.decorator_pattern.beverage;

import id.cli.decorator_pattern.Beverage;

public class DecafBeverage extends Beverage {
    @Override
    public float cost() {
        return 2;
    }
}
