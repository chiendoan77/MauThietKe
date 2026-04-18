package Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealInventory implements InventoryService {

    private List<String> items;

    public RealInventory() {
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println("Loading inventory from database...");
        items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Milk");
    }

    @Override
    public void showItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}