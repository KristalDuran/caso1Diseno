/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.util.Stack;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author raque
 */
public class BolaPool implements IObjectPool<Bola>{
    
    private final int minInstances;
    private final int maxInstances;
    
    ConcreteBolaFactory cbf = new ConcreteBolaFactory();
   
    private static final Stack<Bola> fullStack = new Stack<>();

    public BolaPool(int minInstances, int maxInstances, Color color, 
            int direccion, int velocidad) {
        this.minInstances = minInstances;
        this.maxInstances = maxInstances;
        initPool(color, direccion, velocidad);
        
        
    } 
    
    private void initPool(Color color, int direccion, int velocidad) {
        for (int c = fullStack.size(); c < minInstances; c++) {
            Bola nuevaBola = cbf.createNew(color, direccion, velocidad);
            fullStack.push(nuevaBola);
            //System.out.println(""+nuevaBola.toString());
        }
    }
    public Bola NewInstanceBola(Color color, int direccion, int velocidad){
        if(fullStack.size() <= maxInstances){
            Bola nueva = cbf.createNew(color, direccion, velocidad);
            fullStack.push(nueva);
            return  this.fullStack.pop();
        }
        return null;      
    }
    public void verTam(){
        System.out.println(" size stack " + fullStack.size());
    }
    
    //es requerido un metodo para vaciar la pila y dejarla en minimo??
    
    @Override
    public Bola getObject() {
         if (!fullStack.isEmpty()){
             return this.fullStack.pop();
         }
        return null;
    }

    @Override
    public void releaceObject(Bola bola) {
        this.fullStack.push(bola);
    }
    
    
   
    
    
   
}
