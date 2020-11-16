package id.cli.decorator_pattern.beverage;

import id.cli.decorator_pattern.Beverage;

public class MochaBeverage extends Beverage {
    @Override
    public float cost() {
        return 3;
    }
}
