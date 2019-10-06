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
        INodo izqAba = new NodoAuxiliar(11, Principal1, Principal2);
        INodo izqArri = new NodoAuxiliar(12, Principal1, Principal2);
        INodo dereAba = new NodoAuxiliar(13, Principal2, null);
        INodo dereArri = new NodoAuxiliar(14, Principal2, null);
        Principal1.setArriba_derecha(dereArri);
        Principal1.setAbajo_derecha(dereAba);
        Principal2.setArriba_izquierda(izqArri);
        Principal2.setAbajo_izquierda(izqAba);
        Principal2.setArriba_derecha(dereArri);
        Principal2.setAbajo_derecha(dereAba);
//        System.out.println("" + izqAba.next().toString() + "\n" + izqArri.next().toString());
//        System.out.println("" + dereAba.next().toString() + "\n" + dereArri.next().toString());
        Principal2.next();
    }
    
}
