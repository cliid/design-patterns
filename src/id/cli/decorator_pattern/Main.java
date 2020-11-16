package id.cli.decorator_pattern;

import id.cli.decorator_pattern.AddonDecorator;
import id.cli.decorator_pattern.beverage.MochaBeverage;
import id.cli.decorator_pattern.decorator.CaramelDecorator;
import id.cli.decorator_pattern.decorator.SoyDecorator;

public class Main {

    public static void main(String[] args) {
        AddonDecorator addonDecorator = new SoyDecorator(new CaramelDecorator(new CaramelDecorator(new MochaBeverage())));
        addonDecorator.printCost();
    }
}
