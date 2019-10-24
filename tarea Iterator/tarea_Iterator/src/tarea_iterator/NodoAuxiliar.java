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
    private INodo anterior;
    private INodo siguiente;

    public NodoAuxiliar(int id, INodo anterior, INodo siguiente) {
        this.id = id;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public NodoAuxiliar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public INodo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPrincipal anterior) {
        this.anterior = anterior;
    }

    public INodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrincipal siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Id: " + this.id;
    }
    
    

    @Override
    public IIterator createIterator() {
        return (IIterator) new NodoAuxiliar();
        
    }

    
    
    
}
