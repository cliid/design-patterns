package id.cli.command_pattern.command;

import id.cli.command_pattern.ICommand;
import id.cli.command_pattern.receiver.LightBulb;

public class LightOffCommand implements ICommand {
    LightBulb lightBulb;

    public LightOffCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        this.lightBulb.off();
    }

    @Override
    public void unExecute() {
        this.lightBulb.on();
    }
}
