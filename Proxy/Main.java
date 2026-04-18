package Proxy;

public class Main {
    public static void main(String[] args) {

        InventoryService inventory = new InventoryProxy();

        System.out.println("App started...");
        System.out.println("User requests inventory:");

        inventory.showItems();
    }
}