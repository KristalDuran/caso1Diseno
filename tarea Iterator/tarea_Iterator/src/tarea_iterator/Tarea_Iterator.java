/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_iterator;

/**
 *
 * @author raque
 */
public class Tarea_Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NodoPrincipal Principal1 = new NodoPrincipal(1);
        
        NodoPrincipal Principal2 = new NodoPrincipal(2);
        NodoPrincipal Principal3 = new NodoPrincipal(3);
        
        INodo izqAba1 = new NodoAuxiliar(12, null, Principal1);
        INodo izqArri1 = new NodoAuxiliar(11, null, Principal1);
       
        INodo dereAba = new NodoAuxiliar(14, Principal1, Principal2);
        INodo dereArri = new NodoAuxiliar(13, Principal1, Principal2);
        
        INodo dereAba2 = new NodoAuxiliar(16, Principal2, Principal3);
        INodo dereArri2 = new NodoAuxiliar(15, Principal2, Principal3); 
        
        INodo dereAba3 = new NodoAuxiliar(18, Principal3, null);
        
        
        Principal1.setArriba_izquierda(izqArri1);//11
        Principal1.setAbajo_izquierda(izqAba1);//12
        Principal1.setArriba_derecha(dereArri);//13
        Principal1.setAbajo_derecha(dereAba);//14
        
        Principal2.setArriba_izquierda(dereArri);//13
        Principal2.setAbajo_izquierda(dereAba);//14
        Principal2.setArriba_derecha(dereArri2);//15
        //Principal2.setAbajo_derecha(dereAba2);//16
        Principal2.setAbajo_derecha(null);//16
        
        Principal3.setArriba_izquierda(dereArri2);//15
        Principal3.setAbajo_izquierda(dereAba2);//16
        //Principal3.setAbajo_izquierda(null);//16
        Principal3.setArriba_derecha(null);
        Principal3.setAbajo_derecha(dereAba3);//18
       
        
        IIterator<INodo> nodosIterator = Principal1.createIterator();
        while (nodosIterator.hasNext()) {
            INodo nodo = nodosIterator.next();
            System.out.println("nodo > " + nodo.toString());
        }
    }
    
}
