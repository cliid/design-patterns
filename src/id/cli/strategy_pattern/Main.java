package id.cli.strategy_pattern;

import id.cli.strategy_pattern.behavior.display.DisplayGraphicBehavior;
import id.cli.strategy_pattern.behavior.fly.JetFlyBehavior;
import id.cli.strategy_pattern.behavior.quack.NoQuackBehavior;
import id.cli.strategy_pattern.duck.CityDuck;
import id.cli.strategy_pattern.duck.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new CityDuck(new NoQuackBehavior(), new JetFlyBehavior(), new DisplayGraphicBehavior());
        duck.quack();
        duck.fly();
        duck.display();
    }
}
