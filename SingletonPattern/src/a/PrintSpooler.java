package a;

public class PrintSpooler {

    private static PrintSpooler instance;

    private PrintSpooler() {
        init();
    }

    private void init() {
    }

    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }
}
