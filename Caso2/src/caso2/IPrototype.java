/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;


/**
 *
 * @author raque
 */
public interface IPrototype<T extends Bola> extends Cloneable {
    
   public T clone();
   public T deepClone();
    
}
