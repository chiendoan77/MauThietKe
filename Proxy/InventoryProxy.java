package Proxy;

public class InventoryProxy implements InventoryService {

    private RealInventory realInventory;

    @Override
    public void showItems() {

        if (realInventory == null) {
            realInventory = new RealInventory();
        }

        realInventory.showItems();
    }
}
