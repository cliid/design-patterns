package id.cli.state_pattern.tools;

import id.cli.state_pattern.Tool;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("BrushTool mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("BrushTool mouse down");
    }
}
