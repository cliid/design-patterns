package id.cli.state_pattern.tools;

import id.cli.state_pattern.Tool;

public class PaintTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("PaintTool mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("PaintTool mouse down");
    }
}
