package id.cli.decorator_pattern.decorator;

import id.cli.decorator_pattern.AddonDecorator;
import id.cli.decorator_pattern.Beverage;

public class SoyDecorator extends AddonDecorator {
    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    @Override
    public float cost() {
        return this.beverage.cost() + 2;
    }
}
