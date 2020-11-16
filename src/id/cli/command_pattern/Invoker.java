package id.cli.command_pattern;

public class Invoker {
    private ICommand on;
    private ICommand off;

    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void pressOn() {
        this.on.execute();
    }

    public void pressOff() {
        this.off.execute();
    }
}
