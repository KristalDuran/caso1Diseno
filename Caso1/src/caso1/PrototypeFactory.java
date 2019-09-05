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
    private static HashMap<Integer, IPrototype> prototypes = new HashMap<>();
    
    public static IPrototype getPrototype(Integer numeroCombo){
        return prototypes.get(numeroCombo).clone();
    }
    
    public static void addPrototype(Integer numeroCombo, IPrototype prototype){
        prototypes.put(numeroCombo, prototype);
    }
}
