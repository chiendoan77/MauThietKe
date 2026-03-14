package a;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("John");

        Rabbit r1 = new Rabbit(1, p);

        Rabbit r2 = r1.clone();

        System.out.println("Original: " + r1);
        System.out.println("Clone: " + r2);
    }
}
