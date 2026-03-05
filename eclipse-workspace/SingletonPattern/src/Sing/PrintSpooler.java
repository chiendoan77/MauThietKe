package Sing;

public class PrintSpooler {

    // biến lưu instance duy nhất
    private static PrintSpooler instance;

    // constructor private để không cho class khác tạo object
    private PrintSpooler() {
        init();
    }

    // phương thức khởi tạo
    private void init() {
        System.out.println("PrintSpooler initialized");
    }

    // phương thức lấy instance duy nhất
    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }
}