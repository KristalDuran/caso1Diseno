/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_subasta;

import api.IObservable;
import api.IObserver;
import java.util.ArrayList;

public class Subasta implements IObservable {

    private final ArrayList<IObserver> listaOferentes_Observadores;
    
    public Producto productoSubasta;
    
    public String nombre;
    public String descripcion;
    public String estado;
    public String fechaInicio;
    public String fechaFin;
    
    
    public Subasta(Producto productoSubasta, String nombre, String descripcion, String estado, String fechaInicio, String fechaFin){
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.productoSubasta = productoSubasta;
        
        listaOferentes_Observadores = new ArrayList<>();
    }
    
    public void subirApuesta(double nuevaOferta){
        
        this.productoSubasta.setPrecioFinal(nuevaOferta);
        
//        this.notifyAllObservers(nombre, nombre);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 

    @Override
    public String toString() {
        
        String informacionOferente = "";
        
        for (int i = 0; i < listaOferentes_Observadores.size(); i++) {
            informacionOferente += listaOferentes_Observadores.get(i).toString();
        }
        
        return "\nSubasta{" + 
                "\n listaOferentes = {" + informacionOferente + "}" +
                ",\n productoSubasta = " + productoSubasta.toString() + 
                ",\n nombre=" + nombre + 
                ",\n descripcion=" + descripcion + 
                ",\n estado=" + estado + "\n}";
    }

    @Override
    public void addObserver(IObserver observer) {
        listaOferentes_Observadores.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyAllObservers(String command, Object source) {
        listaOferentes_Observadores.forEach((ob) -> {
            ob.notify(command, source);
        });
    }
}