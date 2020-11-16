package id.cli.state_pattern.tools;

import id.cli.state_pattern.Tool;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("EraserTool mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("EraserTool mouse down");
    }
}
