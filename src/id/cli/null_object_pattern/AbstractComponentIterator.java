package id.cli.null_object_pattern;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AbstractComponentIterator implements Iterator {

    Deque<AbstractComponent> stack = new LinkedList<>();


    public AbstractComponentIterator(AbstractComponent root) {
        stack.add(root);
    }

    @Override
    public boolean isDone() {
        return stack.isEmpty();
    }

    @Override
    public AbstractComponent next() {
        if(stack.isEmpty()){
            throw new NoSuchElementException();
        }
        AbstractComponent node = stack.pop();
        if (node != null) { //only if Composite.children has null
            if (node instanceof Composite) {
                Composite ac = (Composite) node;
                stack.addAll(ac.getChildren());
            }
        }
        return node;
    }
}
