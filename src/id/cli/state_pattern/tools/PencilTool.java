package id.cli.state_pattern.tools;

import id.cli.state_pattern.Tool;

public class PencilTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("PencilTool mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("PencilTool mouse down");
    }
}
