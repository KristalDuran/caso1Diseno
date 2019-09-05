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
        
        Combo combo = new Combo.ComboBuilder().build();
        
        if (numeroCombo != 0) {
            // se recorre cada uno para agregar uno nuevo si solo hay bebidas o si solo hay adicionales por separado si no hay ninguno entonces solo se usa prototype
            combo = deepClone();
            if (productos.equals(null)) {
                for (Producto producto : productos) {
                    combo.addBebida(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
                }
            }
            if (true) {
                
            }
        }
        if (true) {
            
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
