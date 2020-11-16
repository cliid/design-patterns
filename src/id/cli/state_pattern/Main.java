package id.cli.state_pattern;

import id.cli.state_pattern.tools.BrushTool;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
