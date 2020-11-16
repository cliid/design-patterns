package id.cli.null_object_pattern;

import java.util.List;

public abstract class AbstractComponent {
    protected abstract void addChild(AbstractComponent abstractComponent);
    public abstract String getName();
}
