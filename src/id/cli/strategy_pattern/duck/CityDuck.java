package id.cli.strategy_pattern.duck;

import id.cli.strategy_pattern.behavior.display.IDisplayBehavior;
import id.cli.strategy_pattern.behavior.fly.IFlyBehavior;
import id.cli.strategy_pattern.behavior.quack.IQuackBehavior;

import java.util.function.IntFunction;

public class CityDuck extends Duck {
    IQuackBehavior iQuackBehavior;
    IFlyBehavior iFlyBehavior;
    IDisplayBehavior iDisplayBehavior;

    public CityDuck(IQuackBehavior iQuackBehavior, IFlyBehavior iFlyBehavior, IDisplayBehavior iDisplayBehavior) {
        this.iQuackBehavior = iQuackBehavior;
        this.iFlyBehavior = iFlyBehavior;
        this.iDisplayBehavior = iDisplayBehavior;
    }

    public void display() {
        this.iDisplayBehavior.display();
    }

    public void fly() {
        this.iFlyBehavior.fly();
    }

    public void quack() {
        this.iQuackBehavior.quack();
    }
}
