/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import caso2.Bola;
import static caso2.main.bolasFactory;
import static caso2.main.bolasPool;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Creador {
    public final static ArrayList<Bola> LISTA = new ArrayList<>();
    
    public void creaBolas(int patron, int cantidad, int velocidad, Color color, int direccion,
            ViewPanel view){ 
        switch (patron) {
            case 1:
                for(int i=0; i<cantidad; i++){
                    Bola bola = PrototypeFactory.getCloneBola(6);
                    bola.setColor(color);
                    bola.setDireccion(direccion);
                    bola.setVelocidad(velocidad);
                    bolasFactory.add(bola);
                    view.addShape(bola, velocidad);
                }
                break;
            case 2:
                FactoryBola factory= new FactoryBola();
                for(int i=0; i<cantidad; i++){
                    Bola bola = factory.crearBola(color, direccion, velocidad);
                    bolasFactory.add(bola);
                    view.addShape(bola, velocidad);
                }
                break;
            case 3:
                for (int i = 0; i < cantidad; i++) {
                    Bola bola = new Bola.BolaBuilder().
                            setColor(color).
                            setVelocidad(velocidad).
                            setDireccion(direccion).
                            build();
                   LISTA.add(bola);
                   view.addShape(bola, velocidad);
                }
                break;
            case 4:
                BolaPool pool = new BolaPool(100, 3000, Color.red, 180, 5);
                pool.verTam();
                 for(int z=0; z < cantidad; z++){
                     Bola bola = pool.getObject();
                     if( bola != null){
                        bola.setColor(color);
                        bola.setDireccion(direccion);
                        bola.setVelocidad(velocidad);
                     }else{
                        bola=pool.NewInstanceBola(color, direccion, velocidad);
                     }
                    bolasPool.add(bola);
                    view.addShape(bola, velocidad);
                }
                break;
        }
                
        
    }
    
    
}
