package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ItemCollection {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public MyIterator<Item> iterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements MyIterator<Item> {
        private int index = 0;

        public boolean hasNext() {
            while (index < items.size()) {
                if (items.get(index).inStock) {
                    return true;
                }
                index++;
            }
            return false;
        }

        public Item next() {
            return items.get(index++);
        }
    }
}