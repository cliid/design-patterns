package id.cli.composite_pattern;

import java.util.List;

public class Project implements ITodoTree {
    public Project(String title, List<ITodoTree> todoList) {
        this.title = title;
        this.todoList = todoList;
    }

    String title;
    List<ITodoTree> todoList;

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<h3>");
        html.append(this.title);
        html.append("</h3><ul>");
        for (ITodoTree todoTree : todoList) {
            html.append("<li>");
            html.append(todoTree.getHtml());
            html.append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
