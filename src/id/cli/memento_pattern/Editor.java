package id.cli.memento_pattern;

public class Editor {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }
}
