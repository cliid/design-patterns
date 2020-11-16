package id.cli.iterator_pattern;

public class HandHeldInventory implements Inventory{
    private Item left, right;

    public Item getRight() {
        return right;
    }

    private void setRight(Item right) {
        this.right = right;
    }

    public Item getLeft() {
        return left;
    }

    private void setLeft(Item left) {
        this.left = left;
    }

    public HandHeldInventory(Item left, Item right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Iterator getIterator() {
        return new HandHeldInventoryIterator(this);
    }
}
