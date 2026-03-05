package Sing;

public class Main {
    public static void main(String[] args) {

        PrintSpooler p1 = PrintSpooler.getInstance();
        PrintSpooler p2 = PrintSpooler.getInstance();

        if (p1 == p2) {
            System.out.println("Only one instance exists");
        }
    }
}