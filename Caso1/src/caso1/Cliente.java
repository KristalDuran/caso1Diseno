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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Combo combo1 = new ComboBuilder().setPlaBuilder(new PlatoFuerte("Hamburgueza", 5000, 111)).
                addAdiciona(1212, 1500, "Papas").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo2 = new ComboBuilder().setPlaBuilder(new PlatoFuerte("Pollo", 4000, 222)).
                addAdiciona(1212, 1500, "Papas").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo3 = new ComboBuilder().setPlaBuilder(new PlatoFuerte("hot dog", 3500, 333)).
                addAdiciona(1212, 1500, "Puré").
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo4 = new ComboBuilder().setPlaBuilder(new PlatoFuerte("Pizza", 5500, 444)).
                addBebida(3333, 2000, "Gaseosa").
                build();
        Combo combo5 = new ComboBuilder().setPlaBuilder(new PlatoFuerte("Pizza", 6000, 555)).
                addAdiciona(1212, 1500, "Papas").
                addAdiciona(4343, 2000, "Tres Leches").
                addBebida(3333, 2000, "Gaseosa").
                build();
        
        PrototypeFactory.addCombo(1, combo1);
        PrototypeFactory.addCombo(2, combo2);
        PrototypeFactory.addCombo(3, combo3);
        PrototypeFactory.addCombo(4, combo4);
        PrototypeFactory.addCombo(5, combo5);
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
    }
    
}
