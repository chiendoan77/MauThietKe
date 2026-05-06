package Strategy;

import java.util.Base64;

public class Base64Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}