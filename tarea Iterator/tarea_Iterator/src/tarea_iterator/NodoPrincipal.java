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
    private INodo arriba_derecha;
    private INodo arriba_izquierda;
    private INodo abajo_derecha;
    private INodo abajo_izquierda;

    public NodoPrincipal(int id, NodoAuxiliar arriba_derecha, NodoAuxiliar arriba_izquierda, NodoAuxiliar abajo_derecha, NodoAuxiliar abajo_izquierda) {
        this.id = id;
        this.arriba_derecha = arriba_derecha;
        this.arriba_izquierda = arriba_izquierda;
        this.abajo_derecha = abajo_derecha;
        this.abajo_izquierda = abajo_izquierda;
    }
    
    public NodoPrincipal(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public INodo getArriba_derecha() {
        return arriba_derecha;
    }

    public void setArriba_derecha(INodo arriba_derecha) {
        this.arriba_derecha = arriba_derecha;
    }

    public INodo getArriba_izquierda() {
        return arriba_izquierda;
    }

    public void setArriba_izquierda(INodo arriba_izquierda) {
        this.arriba_izquierda = arriba_izquierda;
    }

    public INodo getAbajo_derecha() {
        return abajo_derecha;
    }

    public void setAbajo_derecha(INodo abajo_derecha) {
        this.abajo_derecha = abajo_derecha;
    }

    public INodo getAbajo_izquierda() {
        return abajo_izquierda;
    }

    public void setAbajo_izquierda(INodo abajo_izquierda) {
        this.abajo_izquierda = abajo_izquierda;
    }

    @Override
    public boolean hasNext() {
        if (this.arriba_derecha != null || this.abajo_derecha != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (!arriba_derecha.equals(null)) {
            System.out.println(arriba_derecha.toString());
        }
        if (!abajo_derecha.equals(null)) {
            System.out.println(abajo_derecha.toString());
            return abajo_derecha;
        }else{
            return arriba_derecha;
        }
    }

    @Override
    public IIterator createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "principal " + id;
    }
    
}
