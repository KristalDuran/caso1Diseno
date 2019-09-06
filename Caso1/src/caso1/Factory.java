/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kduran
 */
public class Factory implements IFactory{
    
    public static HashMap<Integer, Combo> combosPredefinidos = new HashMap<>();
    
    public HashMap<Integer, IPrototype> getCombosPredefinidos() {
        return PrototypeFactory.prototypes;
    }
            
    @Override
    public Combo crearPedido(int numeroCombo, PlatoFuerte platoFuerte, ArrayList<Producto> productos) {
        //aca va el if
        
        Combo combo;
        
        // Modificar combos predefinidos
        if (numeroCombo != 0 && productos != null) {
            combo = (Combo) PrototypeFactory.prototypes.get(numeroCombo);
            ComboBuilder builder = new ComboBuilder();
            builder.setPlaBuilder(combo.getPlatoFuerte());
            for (Adicional producto : combo.getAdicionales()) {
                builder.addAdiciona(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
            }
            for (Bebida producto : combo.getBebidas()) {
                builder.addBebida(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
            }
            for (Producto producto : productos) {
                if (producto instanceof Adicional) {
                    builder.addAdiciona(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
                }else{
                    builder.addBebida(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
                }
            }            
            return builder.build();
            
        }
        
        // En este caso quiero un combo ya existente
        if (numeroCombo != 0) {
            return PrototypeFactory.getCloneCombo(numeroCombo);
        }
        
        // Cuando creo un combo desde 0
        if (platoFuerte != null || productos != null) {
            ComboBuilder builder = new ComboBuilder();
            builder.setPlaBuilder(platoFuerte);
            for (Producto producto : productos) {
                if (producto instanceof Adicional) {
                    builder.addAdiciona(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
                }else{
                    builder.addBebida(producto.getCodigo(), producto.getPrecio(), producto.getNombre());
                }
            }            
            return builder.build();
        }
        // donde se define el metodo de clone y deepClone ------------------------------------------------------------------
        
        return null;
    }
    
}
