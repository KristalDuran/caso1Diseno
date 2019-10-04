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
public class NodoAuxiliar implements INodo {
    private int id;
    private NodoPrincipal anterior;
    private NodoPrincipal siguiente;

    public NodoAuxiliar(int id, NodoPrincipal anterior, NodoPrincipal siguiente) {
        this.id = id;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoPrincipal getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPrincipal anterior) {
        this.anterior = anterior;
    }

    public NodoPrincipal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrincipal siguiente) {
        this.siguiente = siguiente;
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
