package id.cli.composite_pattern;

public class Todo implements ITodoTree {
    public Todo(String text) {
        this.text = text;
    }

    String text;

    @Override
    public String getHtml() {
        return text;
    }
}
