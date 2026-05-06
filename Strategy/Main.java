package Strategy;

public class Main {
    public static void main(String[] args) {

        Encryptor encryptor = new Encryptor();

        encryptor.setStrategy(new AESEncryption());
        System.out.println(encryptor.encrypt("hello"));

        encryptor.setStrategy(new Base64Encryption());
        System.out.println(encryptor.encrypt("hello"));

        encryptor.setStrategy(new SHAEncryption());
        System.out.println(encryptor.encrypt("hello"));
    }
}