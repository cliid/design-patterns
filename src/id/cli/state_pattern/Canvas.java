package id.cli.state_pattern;

public class Canvas {
    private Tool tool;

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void mouseUp() {
        this.tool.mouseUp();
    }

    public void mouseDown() {
        this.tool.mouseDown();
    }
}
