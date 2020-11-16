package id.cli.strategy_pattern.behavior.quack;

public class SimpleQuackBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Simply quacking...");
    }
}
