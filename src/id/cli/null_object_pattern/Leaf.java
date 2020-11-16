package id.cli.null_object_pattern;

import java.util.List;

public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        this.name = name;
    }

    private String name;

    // This is the Null Object Pattern. This is all.
    @Override
    public void addChild(AbstractComponent abstractComponent) {
    }

    @Override
    public String getName() {
        return this.name;
    }
}
