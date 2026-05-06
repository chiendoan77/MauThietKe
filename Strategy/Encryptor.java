package Strategy;

public class Encryptor {
    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String data) {
        return strategy.encrypt(data);
    }
}