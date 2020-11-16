package id.cli.command_pattern.command;

import id.cli.command_pattern.ICommand;
import id.cli.command_pattern.receiver.LightBulb;

public class LightOnCommand implements ICommand {
    LightBulb lightBulb = new LightBulb();

    public LightOnCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        this.lightBulb.on();
    }

    @Override
    public void unExecute() {
        this.lightBulb.off();
    }
}
