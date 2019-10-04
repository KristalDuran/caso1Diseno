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
public class NodoPrincipal implements INodo{
    private int id;
    private NodoAuxiliar arriba_derecha;
    private NodoAuxiliar arriba_izquierda;
    private NodoAuxiliar abajo_derecha;
    private NodoAuxiliar abajo_izquierda;

    public NodoPrincipal(int id, NodoAuxiliar arriba_derecha, NodoAuxiliar arriba_izquierda, NodoAuxiliar abajo_derecha, NodoAuxiliar abajo_izquierda) {
        this.id = id;
        this.arriba_derecha = arriba_derecha;
        this.arriba_izquierda = arriba_izquierda;
        this.abajo_derecha = abajo_derecha;
        this.abajo_izquierda = abajo_izquierda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoAuxiliar getArriba_derecha() {
        return arriba_derecha;
    }

    public void setArriba_derecha(NodoAuxiliar arriba_derecha) {
        this.arriba_derecha = arriba_derecha;
    }

    public NodoAuxiliar getArriba_izquierda() {
        return arriba_izquierda;
    }

    public void setArriba_izquierda(NodoAuxiliar arriba_izquierda) {
        this.arriba_izquierda = arriba_izquierda;
    }

    public NodoAuxiliar getAbajo_derecha() {
        return abajo_derecha;
    }

    public void setAbajo_derecha(NodoAuxiliar abajo_derecha) {
        this.abajo_derecha = abajo_derecha;
    }

    public NodoAuxiliar getAbajo_izquierda() {
        return abajo_izquierda;
    }

    public void setAbajo_izquierda(NodoAuxiliar abajo_izquierda) {
        this.abajo_izquierda = abajo_izquierda;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IIterator createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  
    
    
}
