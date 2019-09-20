/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author kduran
 */
public class Factory {
    public static String encrypt(Request request) throws FileNotFoundException, IOException, Exception{
        IMessageEncryptor encryptorMessage;
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("/Users/kduran/Desktop/caso1Diseno/tarea++/Encriptacion/src/encriptacion/config.properties");
        prop.load(ip);
        String type = prop.getProperty("encryptor");
        switch (type){
            case "EES":
                encryptorMessage = new DefaultMessageEncrypt(new EES());
                break;
            case "AES":
                encryptorMessage = new DefaultMessageEncrypt(new AES());
                break;
            case "NanE":
                encryptorMessage = new DefaultMessageEncrypt(new NanE());
                break;
            case "NewE":
                encryptorMessage = new DefaultMessageEncrypt(new NewE());
                break;
            case "NewAlgorithm":
                encryptorMessage = new NewAlgorithmAdapter();
                break;
            default:
                encryptorMessage = new DefaultMessageEncrypt(new NanE());
                break;
        }
        
        return encryptorMessage.encryptMessage(request);
    }
}
