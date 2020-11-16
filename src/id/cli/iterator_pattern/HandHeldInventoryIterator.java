package id.cli.iterator_pattern;

public class HandHeldInventoryIterator implements Iterator {
    private HandHeldInventory inventory;

    // index means whether the current item is held in the left hand, or the right hand.
    // 0 means left, 1 means right and > 1 means we iterated all of the iterable.
    private int index = 0;

    public HandHeldInventoryIterator(HandHeldInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean isDone() {
        return this.index > 1;
    }

    @Override
    public void next() {
        this.index += 1;
    }

    @Override
    public Item currentItem() {
        if (index == 0)
            return this.inventory.getLeft();
        else if (index == 1)
            return this.inventory.getRight();
        else
            return null;
    }
}
