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
public interface IEncryptor {
    public String encriptar(String mensaje, String key) throws Exception;
}
