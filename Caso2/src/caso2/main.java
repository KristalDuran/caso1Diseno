/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;


/**
 *
 * @author kduran
 */
public class main {
    
      public final static ViewPanel view = new ViewPanel();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Bola> bolasFactory = new ArrayList<>();   //esto es para probar el factory
        
        Bola b0 = new Bola(Color.pink, 45, 5);   
        Bola b1 = new Bola(Color.yellow, 0, 6);
        Bola b2 = new Bola(Color.BLUE, 90, 7);
        Bola b3 = new Bola(Color.black, 135, 8);
        Bola b4 = new Bola(Color.GREEN, 180, 9);
        Bola b5 = new Bola(Color.gray, 225, 10);
        Bola b6 = new Bola(Color.RED, 270, 1);
        Bola b7 = new Bola(Color.magenta, 315, 4);
        
        
        PrototypeFactory.addBola(1, b0);
        PrototypeFactory.addBola(2, b1);
        PrototypeFactory.addBola(3, b2);
        PrototypeFactory.addBola(4, b3);
        PrototypeFactory.addBola(5, b4);
        PrototypeFactory.addBola(6, b5);
        PrototypeFactory.addBola(7, b6);
        PrototypeFactory.addBola(8, b7);
        
        //esto es para probar el factory, pero va en la interfaz
        int n = 100;
        FactoryBola factory= new FactoryBola();
        for(int i=0; i<n; i++){
            bolasFactory.add(factory.crearBola(Color.cyan, 180, 8));
            
        }
        
        //esto es para probar el prototype
        bolasFactory.add(PrototypeFactory.getCloneBola(6));
        
        
        System.out.println("cantidad de bolas en la lista: "+bolasFactory.size());
        
        Frame frame = new Frame(view);
        frame.setVisible(true);
    }
    
}
