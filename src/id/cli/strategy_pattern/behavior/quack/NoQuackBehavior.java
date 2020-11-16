package id.cli.strategy_pattern.behavior.quack;

public class NoQuackBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Not Quacking!");
    }
}
