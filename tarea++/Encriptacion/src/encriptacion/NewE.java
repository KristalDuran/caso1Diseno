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
public class NewE implements IEncryptor{

    @Override
    public String encriptar(String mensaje, String key) throws Exception {
        return mensaje + key + "1234";
    }
    
}
