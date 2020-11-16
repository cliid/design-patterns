package id.cli.strategy_pattern.behavior.display;

public class DisplayPhoneBehavior implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Displaying in Phone");
    }
}
