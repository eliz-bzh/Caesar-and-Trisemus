package util;

public class CaesarEncryption {
    public static String getEncryptionMessage(String message, int k){
        String encryption = "";
        for(int i = 0; i < message.length(); ++i){
            encryption += (char)(message.charAt(i)+k);
        }
        return encryption;
    }
}
