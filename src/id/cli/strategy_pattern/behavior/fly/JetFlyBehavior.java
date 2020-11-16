package id.cli.strategy_pattern.behavior.fly;

public class JetFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Jet Flying! Hooray!");
    }
}
