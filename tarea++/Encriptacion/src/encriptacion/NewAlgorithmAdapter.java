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
public class NewAlgorithmAdapter implements IMessageEncryptor{

    @Override
    public String encryptMessage(Request request) {
        NewAlgorithm newAlgorithm = new NewAlgorithm();
        return newAlgorithm.encrypt(request.getMessage(), request.getCharacters());
    }
    
}
