package Strategy;

public class SHAEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        return "SHA(" + data + ")";
    }
}