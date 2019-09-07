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
public class Cliente {
       
     static final ArrayList<Object> inventario = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       PlatoFuerte pf1 = new PlatoFuerte("Hamburgueza", 5000, 1); 
       PlatoFuerte pf2 = new PlatoFuerte("Pollo", 4000, 2);
       PlatoFuerte pf3 = new PlatoFuerte("hot dog", 3500, 3); 
       PlatoFuerte pf4 = new PlatoFuerte("Pizza", 5500, 4); 
       PlatoFuerte pf5 = new PlatoFuerte("Sandwich", 6000, 5); 
       PlatoFuerte pf6 = new PlatoFuerte("wrap", 4900, 6); 
       
        
        Combo combo1 = new ComboBuilder().setPlaBuilder(pf1).
                addAdiciona(1212, 1500, "Papas").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo2 = new ComboBuilder().setPlaBuilder(pf2).
                addAdiciona(1212, 1500, "Papas").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo3 = new ComboBuilder().setPlaBuilder(pf3).
                addAdiciona(1212, 1500, "Puré").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo4 = new ComboBuilder().setPlaBuilder(pf4).
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo5 = new ComboBuilder().setPlaBuilder(pf5).
                addAdiciona(1212, 1500, "Papas").
                addAdiciona(4343, 2000, "Tres Leches").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo6 = new ComboBuilder().setPlaBuilder(pf6).
                addAdiciona(1212, 1500, "Papas").
                addAdiciona(4343, 2000, "Tres Leches").
                addBebida(3333, 2000, "Gaseosa").
                build();
        
        inventario.add(combo1);
        inventario.add(combo2);
        inventario.add(combo3);
        inventario.add(combo4);
        inventario.add(combo5);
        inventario.add(combo6);
        inventario.add(pf1);
        inventario.add(pf2);
        inventario.add(pf3);
        inventario.add(pf4);
        inventario.add(pf5);
        inventario.add(pf6);
        
        
        PrototypeFactory.addCombo(1, (IPrototype) combo1);
        PrototypeFactory.addCombo(2, (IPrototype) combo2);
        PrototypeFactory.addCombo(3, (IPrototype) combo3);
        PrototypeFactory.addCombo(4, (IPrototype) combo4);
        PrototypeFactory.addCombo(5, (IPrototype) combo5);
        Factory factory = new Factory();
        ArrayList<Producto> products = new ArrayList<>();
        products.add(new Adicional("Salsa", 1000, 11));
        products.add(new Adicional("Pan", 1500, 22));
        products.add(new Adicional("Sopa", 2000, 22));
        products.add(new Bebida("Cafe", 1000, 111));
        products.add(new Bebida("Té", 700, 222));
        products.add(new Bebida("Agua", 1100, 333));
        Combo comboNuevo = factory.crearPedido(0, new PlatoFuerte("Sandwich", 2500, 44444), products);
        Combo comboNuev02 = factory.crearPedido(1, null, products);
        Combo comboNuev3 = factory.crearPedido(4, null, null);
        System.out.println("Datos \n" + factory.getCombosPredefinidos().toString());
        System.out.println("Clonados: \n" + comboNuevo.toString() + "\n" + comboNuev02 + "\n" + comboNuev3);
        
        inventario.add(products);
    }
    
}
