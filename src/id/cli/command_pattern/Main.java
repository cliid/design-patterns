package id.cli.command_pattern;

import id.cli.command_pattern.command.LightOffCommand;
import id.cli.command_pattern.command.LightOnCommand;
import id.cli.command_pattern.receiver.LightBulb;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Invoker invoker = new Invoker(new LightOnCommand(lightBulb), new LightOffCommand(lightBulb));
        invoker.pressOn();
        invoker.pressOff();
    }
}
