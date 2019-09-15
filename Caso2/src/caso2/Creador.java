/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import caso2.Bola;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Creador {
    public final static ArrayList<Bola> LISTA = new ArrayList<>();
    
    public void creaBolas(int prototipo, int cantidad, int velocidad, Color color, int direccion,
            ViewPanel view){
        switch (prototipo) {
            case 3:
                for (int i = 0; i < cantidad; i++) {
                    Bola bola = new Bola.BolaBuilder().
                            setColor(color).
                            setVelocidad(velocidad).
                            setDireccion(direccion).
                            build();
                   LISTA.add(bola);
                   view.addShape(bola);
                }
                break;
        }
                
        
    }
    
    
}
