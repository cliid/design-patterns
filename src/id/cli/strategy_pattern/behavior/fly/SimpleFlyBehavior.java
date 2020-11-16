package id.cli.strategy_pattern.behavior.fly;

public class SimpleFlyBehavior implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Simply flying...");
    }
}
