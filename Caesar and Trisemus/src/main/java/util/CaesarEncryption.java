package util;

public class CaesarEncryption {
    public static String getEncryptionMessage(String message, int k){
        String encryption = "";
        int a = 0;
        for(int i = 0; i < message.length(); ++i){
            a = message.charAt(i);
            System.out.println(a);
            if(a >= 65 && a <= 90){
                a += k;
                if(a > 90){
                    a = 64 + (a - 90);
                }
                encryption += (char)a;
            }
            else {
                if(a >= 97 && a <= 122){
                    a += k;
                    if(a > 122){
                        a = 96 + (a - 122);
                    }
                    encryption += (char)a;
                }
                else{
                    encryption += ' ';
                }
            }
        }
        return encryption;
    }
}
