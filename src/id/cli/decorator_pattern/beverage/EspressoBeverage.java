package id.cli.decorator_pattern.beverage;

import id.cli.decorator_pattern.Beverage;

public class EspressoBeverage extends Beverage {
    @Override
    public float cost() {
        return 1;
    }
}
