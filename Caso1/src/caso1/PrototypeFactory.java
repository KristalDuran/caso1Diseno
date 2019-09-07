/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

import java.util.HashMap;

/**
 *
 * @author kduran
 */
public class PrototypeFactory {
    public static HashMap<Integer, IPrototype> prototypes = new HashMap<>();
    
    public static Combo getCloneCombo(Integer numeroCombo){
        return prototypes.get(numeroCombo).deepClone();
    }
    
    public static void addCombo(Integer numeroCombo, IPrototype prototype){
        prototypes.put(numeroCombo, prototype);
    }
    
}
