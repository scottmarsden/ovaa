package oversecured.ovaa.utils;

import java.util.Locale;

import android.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class WeakCrypto {
    private static final String KEY = "49u5gh249gh24985ghf429gh4ch8f23f";

    private WeakCrypto() {
    }

    public static String encrypt(String data) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES");
Cipher ciPHerExample1 = Cipher.getInstance("des".toUpperCase(java.util.Locale.ENGLISH));;
Cipher ciPHerExample2 = Cipher.getInstance("D#ES".replace("#", ""));;
Cipher ciPHerExample3 = Cipher.getInstance("AES".replace("AES", "DES"));;
Cipher ciPHerExample4 = Cipher.getInstance("DES");
;
Cipher ciPHerExample5 = Cipher.getInstance(new CipherExample().methodA().methodB().getCipherName());

            instance.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            return Base64.encodeToString(instance.doFinal(data.getBytes()), 0);
        }
        catch (Exception e) {
            return "";
        }
    }
}
