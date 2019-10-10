/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_iterator;

import java.util.LinkedList;

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

    public NodoPrincipal() {
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
    public IIterator createIterator() {
        return new NodosIterator();
    }

    @Override
    public String toString() {
        return "principal " + id;
    }
    public class NodosIterator implements IIterator<INodo>{
        private LinkedList<INodo> list = new LinkedList<INodo>();                    
        private int index = 0;  
        
        
        public NodosIterator() {                        
          addRecursive(NodoPrincipal.this);
          System.out.println("finish");
        }

      
      
        public void addRecursive(NodoPrincipal nodo) {
            if(nodo.arriba_izquierda!=null && !list.contains(nodo.arriba_izquierda) && nodo.getId()==1){
                list.add((INodo) nodo.arriba_izquierda);  
            }
            if(nodo.abajo_izquierda!=null && !list.contains(nodo.abajo_izquierda) && nodo.getId()==1 ){
                list.add((INodo) nodo.abajo_izquierda);
            }
            if(!list.contains(nodo)){
                list.add(nodo);
            }
            if(nodo.arriba_derecha!=null && !list.contains(nodo.arriba_derecha)){
                list.add((INodo) nodo.arriba_derecha);
            }
            if(nodo.abajo_derecha!=null && !list.contains(nodo.abajo_derecha)){
                list.add((INodo) nodo.abajo_derecha); 
            }
            //validarParaRecursividad(nodo);
            if(nodo.arriba_derecha!=null){
                NodoAuxiliar nodoA = (NodoAuxiliar) nodo.arriba_derecha;
                addRecursive((NodoPrincipal) nodoA.getSiguiente());
            }
            
        }                                
        public void validarParaRecursividad(NodoPrincipal nodo){
            if(nodo.arriba_derecha!=null){
                NodoAuxiliar nodoB = (NodoAuxiliar) nodo.arriba_derecha;
                addRecursive((NodoPrincipal) nodoB.getSiguiente());
            }else{
                //no sé porqué no sirve si pongo abajo derecha
                if(nodo.abajo_derecha!=null){
                    NodoAuxiliar nodoA = (NodoAuxiliar) nodo.abajo_derecha;
                    addRecursive((NodoPrincipal) nodoA.getSiguiente());
                }else{
                   
                    System.out.println("tenemos problemas, fin del comunicado");
                }
            }
       
        }
        
     
        @Override
        public boolean hasNext() {
            if (list.isEmpty()) {                            
                return false;                        
            }
            return index < list.size();
        }

        @Override
        public INodo next() {
            if (!hasNext()) {                            
                throw new RuntimeException("No more elements");                        
            }
            return list.get(index++);  
        }
        
    }
}
