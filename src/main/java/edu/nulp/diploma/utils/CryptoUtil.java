package edu.nulp.diploma.utils;

import edu.nulp.diploma.logger.LogListener;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CryptoUtil {

    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String ALGORITHM_KEY = "AES";
    private static final String KEY = "39gfg709dify56pd";

    private CryptoUtil() {
    }

    public static String encrypt(String text) {
        byte[] encryptionKey = KEY.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKey = new SecretKeySpec(encryptionKey, ALGORITHM_KEY);
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            LogListener.log.error("Not existing algorithm was chosen", e);
        }
        try {
            if (cipher != null) {
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            }
        } catch (InvalidKeyException e) {
            LogListener.log.error("Incorrect encryption mode was chosen", e);
        }

        String encryptedString = null;
        byte[] plainText = text.getBytes(StandardCharsets.UTF_8);
        try {
            if (cipher != null) {
                encryptedString = Base64.encodeBase64String(cipher.doFinal(plainText));
            }
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            LogListener.log.error("Incorrect block size", e);
        }
        return encryptedString;
    }
}
