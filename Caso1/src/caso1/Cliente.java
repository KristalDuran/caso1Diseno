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
                addAdiciona(1, 1500, "Papas").
                addBebida(8, 2000, "Gaseosa").
                build();
        Combo combo2 = new ComboBuilder().setPlaBuilder(pf2).
                addAdiciona(1, 1500, "Papas").
                addBebida(8, 2000, "Gaseosa").
                build();
        Combo combo3 = new ComboBuilder().setPlaBuilder(pf3).
                addAdiciona(2, 1500, "Puré").
                addBebida(8, 2000, "Gaseosa").
                build();
        Combo combo4 = new ComboBuilder().setPlaBuilder(pf4).
                addBebida(8, 2000, "Gaseosa").
                build();
        Combo combo5 = new ComboBuilder().setPlaBuilder(pf5).
                addAdiciona(1, 1500, "Papas").
                addAdiciona(3, 2000, "Tres Leches").
                addBebida(8, 2000, "Gaseosa").
                build();
        Combo combo6 = new ComboBuilder().setPlaBuilder(pf6).
                addAdiciona(1, 1500, "Papas").
                addAdiciona(4343, 2000, "Tres Leches").
                addBebida(8, 2000, "Gaseosa").
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
        products.add(new Adicional("maiz", 1000, 5));
        products.add(new Adicional("patatas", 1500, 6));
        products.add(new Adicional("ensalada", 2000, 7));
        products.add(new Bebida("Cafe", 1000, 2));
        products.add(new Bebida("Té", 700, 3));
        products.add(new Bebida("natural", 1100, 4));
        Combo comboNuevo = factory.crearPedido(0, new PlatoFuerte("Sandwich", 2500, 44444), products);
        Combo comboNuev02 = factory.crearPedido(1, null, products);
        Combo comboNuev3 = factory.crearPedido(4, null, null);
        System.out.println("Datos \n" + factory.getCombosPredefinidos().toString());
        System.out.println("Clonados: \n" + comboNuevo.toString() + "\n" + comboNuev02 + "\n" + comboNuev3);
        Adicional a1 = new Adicional("uvas", 2000,4 );
        Adicional a2 = new Adicional("maiz", 2000,5 );
        Adicional a3 = new Adicional("patatas", 2000,6 );
        Adicional a4 = new Adicional("ensalada", 2000,7 );
        Adicional a5 = new Adicional("papas", 2000,1 );
        Adicional a6 = new Adicional("puré", 2000,2 );
        Adicional a7 = new Adicional("tres leches", 2000,3 );
        
        Bebida b1 = new Bebida("gaseosa", 2000,8 );
        Bebida b2 = new Bebida("café", 2000,9 );
        Bebida b3 = new Bebida("té", 2000,10 );
        Bebida b4 = new Bebida("natural", 2000,11 );
        Bebida b5 = new Bebida("frozen", 2000,12 );
        Bebida b6 = new Bebida("batido", 2000,13 );
        
        
        products.add(a1);
        products.add(a2);
        products.add(a3);
        products.add(a4);
        products.add(a5);
        products.add(a6);
        products.add(a7);
        products.add(b1);
        products.add(b2);
        products.add(b3);
        products.add(b4);
        products.add(b5);
        products.add(b6);
        
        inventario.add(products);
    }
    
}
