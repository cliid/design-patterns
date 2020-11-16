package id.cli.null_object_pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Composite extends AbstractComponent {
    public Composite(String name) {
        this.name = name;
    }

    private String name;
    private List<AbstractComponent> children = new LinkedList<>();

    @Override
    public void addChild(AbstractComponent abstractComponent) {
        children.add(abstractComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public List<AbstractComponent> getChildren() {
        return children;
    }
}
