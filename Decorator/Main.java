package Decorator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new BasicPizza();

        pizza = new ExtraCheese(pizza);

        pizza = new Pepperoni(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());
    }
}