/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

/**
 *
 * @author kduran
 */
public class DefaultMessageEncrypt implements IMessageEncryptor{
    public IEncryptor encryptor;

    public DefaultMessageEncrypt(IEncryptor encryptor) {
        this.encryptor = encryptor;
    }
    
    @Override
    public String encryptMessage(Request request) throws Exception{
        return encryptor.encriptar(request.getMessage(), request.getKey());
    }

}
