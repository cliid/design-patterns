package id.cli.memento_pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("Hello");
        history.push(editor.createState());
        System.out.println(editor.getContent());
        editor.setContent("World");
        history.push(editor.createState());
        System.out.println(editor.getContent());
        editor.setContent("!");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
