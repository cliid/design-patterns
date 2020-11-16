package id.cli.null_object_pattern;

public class Main {
    public static void main(String[] args) {
        AbstractComponent abstractComponent = new Composite("Parent_First");
        AbstractComponent composite = new Composite("Parent_Second");
        composite.addChild(new Leaf("Child_Second_1"));
        composite.addChild(new Leaf("Child_Second_1"));
        abstractComponent.addChild(new Leaf("Child_First_1"));
        abstractComponent.addChild(new Leaf("Child_First_2"));
        abstractComponent.addChild(composite);
        AbstractComponentIterator iterator = new AbstractComponentIterator(abstractComponent);
        while (!iterator.isDone()) {
            AbstractComponent nextAbstractComponent = iterator.next();
            System.out.println(nextAbstractComponent.getName());
        }
    }
}
