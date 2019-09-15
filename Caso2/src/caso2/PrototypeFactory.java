/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.util.HashMap;

/**
 *
 * @author raque
 */
public class PrototypeFactory {
    
    public static HashMap<Integer, IPrototype> prototypes = new HashMap<>();
    
    public static Bola getCloneBola(Integer numeroBola){
        return prototypes.get(numeroBola).deepClone();
    }
    
    public static void addBola(Integer numeroBola, IPrototype prototype){
        prototypes.put(numeroBola, prototype);
    }
    
}
