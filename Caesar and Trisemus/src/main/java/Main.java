import util.CaesarEncryption;


public class Main {
    public static void main(String[] args) {
        String encrypt = CaesarEncryption.getEncryptionMessage(":BaC", 3);
        System.out.println(encrypt);
    }
}
