package Iterator;

public class Main {
    public static void main(String[] args) {

        ItemCollection items = new ItemCollection();
        items.add(new Item("Laptop", true));
        items.add(new Item("Mouse", false));
        items.add(new Item("Keyboard", true));

        System.out.println("Items in stock:");
        MyIterator<Item> itemIterator = items.iterator();

        while(itemIterator.hasNext()) {
            Item item = itemIterator.next();
            System.out.println(item.name);
        }

        EmployeeCollection employees = new EmployeeCollection();
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));

        System.out.println("\nEmployees:");
        MyIterator<Employee> empIterator = employees.iterator();

        while(empIterator.hasNext()) {
            System.out.println(empIterator.next().name);
        }
    }
}
