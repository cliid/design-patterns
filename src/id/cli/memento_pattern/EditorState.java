package id.cli.memento_pattern;

public class EditorState {
    public final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
