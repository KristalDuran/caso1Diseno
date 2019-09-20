/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import com.sun.crypto.provider.DESKeyFactory;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Encoder;

/**
 *
 * @author kduran
 */
public class EES implements IEncryptor{

    @Override
    public String encriptar(String mensaje, String key) throws Exception{
        DESKeySpec dks = new DESKeySpec(mensaje.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        desCipher.init(desCipher.ENCRYPT_MODE, desKey);
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(desCipher.doFinal(mensaje.getBytes()));
    }
    
}
