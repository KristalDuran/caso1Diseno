/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Factory implements IFactory, IPrototype<Combo>{

    @Override
    public Combo crearPedido(int numeroCombo, PlatoFuerte platoFuerte, ArrayList<Producto> productos) {
        //aca va el if
        
        
        PrototypeFactory proFactory = new PrototypeFactory();
        
        Combo clon = proFactory.getPrototype(1);
        Combo combo = new Combo.ComboBuilder().addAdiciona(123, 123, "").build();
        // en este caso quiero un combo ya existente
        if (numeroCombo != 0) {
            
            combo = proFactory.getPrototype(numeroCombo);
        }
        if (platoFuerte != null) {
            combo = new Combo.ComboBuilder().
                    setPlaBuilder(platoFuerte).
                    addAdiciona(123, 123, "").
                    build();
        }
        return null;
    }

    @Override
    public Combo clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Combo deepClone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
