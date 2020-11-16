package id.cli.command_pattern.receiver;

public class LightBulb {
    private boolean isTurnOn = false;

    public LightBulb() {
    }

    public void on() {
        isTurnOn = true;
        System.out.println("Light turn on");
    }

    public void off() {
        isTurnOn = false;
        System.out.println("Light turn off");
    }
}
